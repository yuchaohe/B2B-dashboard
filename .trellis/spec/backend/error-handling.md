# Error Handling

> How errors are handled in this project.

---

## Overview

Week 1 uses lightweight, predictable error handling suitable for a new Spring Cloud system backed by mock or in-memory data.

Goals:

- return stable error payloads to the React admin frontend
- keep controller responses simple and easy to mock
- avoid leaking stack traces or framework exceptions to clients
- make it obvious whether a failure is a client-input problem or a server-side problem

---

## Error Types

- `VALIDATION_ERROR`
  - request is syntactically valid HTTP but missing required business input
- `NOT_FOUND`
  - requested dashboard resource, customer, or order does not exist
- `CONFLICT`
  - request cannot be completed because current mock state conflicts with it
- `INTERNAL_ERROR`
  - unexpected failure inside a service, adapter, or controller

Keep the initial set small. Add more codes only when the frontend needs distinct handling.

---

## Error Handling Patterns

- Controllers should delegate business work to service classes and avoid inline business branching.
- Services may throw typed application exceptions; controllers should not build ad hoc error JSON inside each endpoint.
- Use one shared exception-handling path for HTTP responses.
- Unexpected exceptions should be converted to `INTERNAL_ERROR`.
- Validation failures should be mapped explicitly instead of falling through as generic `500` responses.

Recommended backend shape for week 1:

- application exception with:
  - `code`
  - `message`
  - optional `details`
- global exception handler that maps known exceptions to HTTP status codes

Avoid in week 1:

- returning framework-default HTML error pages
- returning plain strings such as `"error"` or `"failed"`
- mixing success and error shapes across endpoints

---

## API Error Responses

All JSON errors should use one envelope shape:

```json
{
  "success": false,
  "error": {
    "code": "NOT_FOUND",
    "message": "Customer 123 was not found",
    "details": null
  },
  "traceId": "optional-request-id"
}
```

HTTP status mapping for week 1:

- `400` for `VALIDATION_ERROR`
- `404` for `NOT_FOUND`
- `409` for `CONFLICT`
- `500` for `INTERNAL_ERROR`

Success responses should not reuse the error structure.

---

## Common Mistakes

- Returning different error JSON from different controllers
- Throwing raw `RuntimeException` with user-facing text as the only contract
- Hiding validation problems behind `500`
- Embedding stack traces or internal class names in API responses
- Hardcoding frontend-specific strings in backend exception logic

## Week-1 Review Checklist

- Does the endpoint return the standard error envelope on failure?
- Is the HTTP status aligned with the error code?
- Is user-facing text concise and safe to display in an admin UI toast or page state?
- Are unexpected errors handled in one place rather than duplicated?
