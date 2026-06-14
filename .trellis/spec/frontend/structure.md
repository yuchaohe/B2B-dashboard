# Frontend Structure

> Structure rules for the week-1 React + TypeScript admin dashboard.

---

## Overview

The frontend should start with a simple, scalable structure that can grow from one dashboard page into a full internal admin application.

Week 1 should optimize for:

- clear route ownership
- typed API access
- simple layout reuse
- easy addition of customer and order features later

---

## Recommended Week-1 Structure

Use a layout like this:

```text
frontend/
  src/
    app/
      router/
      providers/
    layouts/
      admin/
    pages/
      overview/
      customers/
      orders/
    features/
      overview/
    api/
      overview/
      customers/
      orders/
    components/
      ui/
    types/
    test/
```

If the actual frontend package name differs, keep the same intent even if the top-level folder changes.

---

## Responsibilities

- `app/router`
  - route declarations
  - route-level lazy loading if added
- `layouts/admin`
  - shared admin shell
  - sidebar, header, content frame
- `pages/*`
  - route entry components only
  - minimal orchestration
- `features/*`
  - feature-specific view composition and behavior
- `api/*`
  - request functions
  - response mapping
  - typed payload definitions when not centralized elsewhere
- `components/ui`
  - reusable visual building blocks
- `types`
  - shared domain and contract types
- `test`
  - smoke helpers or shared frontend test utilities

---

## Rules

- Do not mix route layout code with API request logic.
- Do not place raw `fetch` calls directly inside deeply nested presentational components.
- Do not make the overview page depend on customer or order page internals.
- Keep route placeholders simple; they should communicate information architecture, not fake full business behavior.
- When a type is shared across multiple pages or API modules, move it out of the component file.

---

## First-Week Pages

The first navigation should include:

- `Overview`
- `Customers`
- `Orders`

Expected week-1 behavior:

- `Overview`
  - renders KPI cards from API-backed mock data
- `Customers`
  - route shell or placeholder page
- `Orders`
  - route shell or placeholder page

---

## Testing Expectations

- Each route added in week 1 should have at least one render-path assertion.
- The overview feature should have at least one test proving KPI data renders correctly from typed mock API output.
- Shared layout should be stable enough that a smoke test can mount the admin shell without runtime failures.
