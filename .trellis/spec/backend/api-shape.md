# API Shape

> HTTP endpoint and response conventions for the week-1 admin dashboard.

---

## Overview

Week 1 APIs should optimize for clarity and predictability over completeness.

The first frontend slice needs:

- overview metrics
- route scaffolding for customers
- route scaffolding for orders

Because the project keeps Spring Cloud but uses mock or in-memory data in week 1, contracts should look production-like without requiring full persistence.

---

## Endpoint Design

Use resource-oriented JSON endpoints under gateway-facing admin paths.

Suggested first-week shape:

- `GET /api/overview`
- `GET /api/customers`
- `GET /api/orders`

Optional placeholders are acceptable for week 1, but the response contract should already be stable enough for frontend integration.

Avoid:

- action-heavy RPC endpoints such as `/api/getDashboardDataNow`
- inconsistent pluralization
- mixing admin and public API concerns in the same route space

---

## Success Response Envelope

All successful JSON responses should use one shared envelope:

```json
{
  "success": true,
  "data": {},
  "meta": null
}
```

Examples:

```json
{
  "success": true,
  "data": {
    "activeCustomers": 128,
    "openOrders": 42,
    "dailyRevenue": 18500
  },
  "meta": null
}
```

```json
{
  "success": true,
  "data": [
    {
      "id": "CUST-001",
      "name": "Acme Trading",
      "status": "ACTIVE"
    }
  ],
  "meta": {
    "page": 1,
    "pageSize": 20,
    "total": 1
  }
}
```

---

## Frontend Contract Rules

- Frontend pages should consume typed API clients instead of reading raw `fetch` payloads inline.
- Normalize response handling in one API layer.
- UI components should receive already-mapped view data when possible.
- Placeholder routes may consume mock lists, but they should still follow the same envelope as real endpoints.

---

## Versioning and Growth

Do not add formal API versioning in week 1 unless an external integration requires it.

For internal admin APIs, keep the first contract simple and evolve it carefully:

- add fields in a backward-compatible way
- avoid renaming fields once frontend code depends on them
- prefer optional fields over breaking shape changes during early iteration
