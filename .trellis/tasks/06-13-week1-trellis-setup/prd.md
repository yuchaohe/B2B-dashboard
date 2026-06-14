# Plan week-1 Trellis setup for B2B dashboard

## Goal

Set up Trellis planning artifacts for week 1 of a brand-new B2B dashboard so the project starts with:

- a small, concrete first implementation task
- minimum project specs for frontend structure, API shape, error handling, and tests
- enough product and stack decisions to keep the first week aligned

## Requirements

- Ask for the missing product and tech-stack decisions that cannot be inferred from the repository.
- Keep questioning focused on decisions that affect the first week's work.
- Produce a small first-task PRD after the key decisions are resolved.
- Produce the minimum Trellis specs needed for:
  - frontend structure
  - API shape
  - error handling
  - tests
- Keep the outcome lightweight and suitable for a new project rather than a mature, fully-specified platform.

## Confirmed Facts

- The project is a new B2B dashboard being started from scratch.
- Trellis has already been initialized in this repository.
- The user wants week-1 planning artifacts, not broad implementation.
- There is already a Spring Cloud multi-module Java backend scaffold in the repository, but the actual product and frontend stack are not yet defined.
- The week-1 MVP is an internal operations/admin dashboard.
- The core MVP workflows are:
  - view top-level operational overview metrics
  - manage customers
  - manage orders
- Week 1 targets a web admin dashboard only.
- The frontend stack should use React.
- Week 1 should continue with a Spring Cloud backend rather than a simplified monolith.
- The frontend should use React + TypeScript from day one.
- Week 1 testing should cover unit tests plus critical smoke tests.
- Week 1 should use mock or in-memory data to validate the main flows before introducing a real database.

## Decisions Captured

- Product target:
  - internal operations/admin web dashboard
  - overview metrics
  - customer management
  - order management
- Frontend:
  - React
  - TypeScript
  - web admin only in week 1
- Backend:
  - keep Spring Cloud
  - use mock or in-memory data for week 1
- Testing:
  - unit tests plus critical smoke tests
- Proposed first implementation task:
  - build the admin overview shell with mock KPI cards and route scaffolding for customers and orders

## Open Questions

None for week-1 planning. Further questions can be handled inside implementation tasks if needed.

## Out of Scope

- Full product roadmap beyond the first week
- Detailed UI design system or visual branding
- Production infrastructure, CI/CD, observability, auth, billing, and multi-region rollout unless needed to define week 1
- Detailed data model for every domain area

## Acceptance Criteria

- [x] Missing product and tech-stack decisions needed for week 1 are identified and resolved with the user.
- [x] A small, concrete first-task PRD is created under Trellis.
- [x] Minimum specs exist for frontend structure, API shape, error handling, and tests.
- [x] The resulting artifacts are lightweight, internally consistent, and suitable for a new B2B dashboard MVP.

## Notes

- Keep `prd.md` focused on requirements, constraints, and acceptance criteria.
- Lightweight tasks can remain PRD-only.
- For complex tasks, add `design.md` for technical design and `implement.md` for execution planning before `task.py start`.
