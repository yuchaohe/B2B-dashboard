# Build admin overview shell with mock metrics

## Goal

Create the first implementation task for week 1: a web admin overview shell that proves the project structure, main routes, and dashboard data flow using mock data.

## Requirements

- Build a React + TypeScript admin shell for internal operations users.
- Include a dashboard landing page with mock KPI cards for operational overview.
- Include visible navigation entries and empty route shells for:
  - dashboard overview
  - customer management
  - order management
- Consume data through frontend API modules rather than hardcoding data directly in page components.
- Back the overview API with mock or in-memory Spring Cloud service responses.
- Keep the task small enough for an initial week-1 implementation.

## Confirmed Facts

- This is the first concrete task for a brand-new B2B admin dashboard.
- Frontend is React + TypeScript.
- Backend remains Spring Cloud.
- Week 1 uses mock or in-memory data instead of a real database.
- Testing for week 1 should include unit tests plus critical smoke tests.

## Out of Scope

- Full customer CRUD behavior
- Full order CRUD behavior
- Authentication and authorization
- Real database integration
- Polished design system or final UI branding
- Complex filtering, export, or analytics

## Acceptance Criteria

- [ ] The app has an admin shell layout with navigation for Overview, Customers, and Orders.
- [ ] The Overview page renders mock KPI cards from an API layer, not inline page constants.
- [ ] Customers and Orders routes exist as shells or placeholders so the information architecture is visible.
- [ ] Backend mock endpoints return predictable data for the overview page.
- [ ] Frontend unit tests cover at least the overview KPI rendering and one API adapter.
- [ ] At least one critical smoke test verifies the main overview page loads without runtime errors.

## Notes

- Keep this as a lightweight implementation task with a PRD only unless execution complexity grows during planning.
- Prefer proving structure and contracts over shipping deep business logic.
