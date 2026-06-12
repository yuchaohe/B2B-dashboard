# B2B Dashboard Spring Cloud Scaffold

This repository has been initialized as a standard Spring Cloud multi-module project.

## Modules

- `b2b-common`: shared DTOs and common utilities.
- `b2b-config`: Spring Cloud Config Server.
- `b2b-registry`: Eureka service registry.
- `b2b-gateway`: Spring Cloud Gateway entry point.
- `b2b-service-user`: sample user service.
- `b2b-service-order`: sample order service that calls the user service via OpenFeign.

## Recommended stack

- Java 17
- Maven 3.9+
- Spring Boot 3.5.15
- Spring Cloud 2025.0.3

## Startup order

1. Start `b2b-config`
2. Start `b2b-registry`
3. Start `b2b-service-user`
4. Start `b2b-service-order`
5. Start `b2b-gateway`

## Local endpoints

- Config Server: `http://localhost:8888/b2b-service-user/default`
- Eureka dashboard: `http://localhost:8761`
- Gateway route test: `http://localhost:8080/api/users/1`
- Gateway route test: `http://localhost:8080/api/orders/101`

## Build

```bash
mvnw.cmd clean package
```

## Notes

- The project uses Config Server, service discovery, Gateway, and OpenFeign out of the box.
- If you want to add Nacos, Sentinel, Seata, OAuth2, or Stream later, this scaffold is ready to extend.
- If `mvnw.cmd` reports a missing `JAVA_HOME`, set it to your local JDK 17 installation path before building.
