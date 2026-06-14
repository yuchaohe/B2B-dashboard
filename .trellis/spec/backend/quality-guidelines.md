# Quality Guidelines

> Code quality standards for backend development.

---

## Overview

Week 1 quality rules are intentionally narrow. They exist to keep a new React + Spring Cloud admin dashboard consistent while the team is still proving the core workflow.

---

## Forbidden Patterns

- Do not put mock data literals directly inside React page components when an API module can own the shape.
- Do not let controllers contain business logic that should live in services.
- Do not create one-off response envelopes per endpoint.
- Do not add a real database dependency just to complete the first-week shell task.
- Do not skip tests entirely for “temporary” mock flows; mock-backed features still need contract checks.

Why:

- these patterns make the eventual move from mock data to real services harder
- they blur the API contract the frontend will depend on
- they create avoidable rewrite work during week 2 and later

---

## Required Patterns

- Use typed frontend models and API adapters in TypeScript.
- Keep route/page components thin; move request logic and mapping into API or service modules.
- Use shared response envelopes for backend success and failure payloads.
- Prefer deterministic mock data fixtures so smoke tests remain stable.
- When adding a new route, add at least one render-path test or smoke assertion for it.

For Spring Cloud week 1:

- each service should own a clear responsibility
- gateway routing should remain simple and explicit
- mock data may live in service classes or fixtures, not inside controllers when avoidable

---

## Testing Requirements

Week 1 testing target: unit tests plus critical smoke tests.

Minimum expectations:

- Frontend
  - unit test for at least one overview page rendering path
  - unit test for at least one API adapter or mapper
  - one smoke test proving the overview page loads without runtime errors
- Backend
  - unit or lightweight integration test for overview service behavior
  - test for the main overview endpoint success contract
  - test for at least one standardized error response path

Not required in week 1:

- broad end-to-end coverage
- high percentage coverage targets
- full CRUD test matrices for customers and orders

---

## Code Review Checklist

- Does the change support the week-1 MVP workflow instead of introducing side quests?
- Is mock data isolated enough to replace later?
- Are API contracts explicit and consistent?
- Are failure states handled with the shared error format?
- Were unit and smoke tests added or updated for the changed behavior?
