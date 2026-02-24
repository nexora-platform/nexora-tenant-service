Nexora Tenant Service is a core microservice within the Nexora SaaS Platform architecture.

It is responsible for managing tenant lifecycle, including company registration, domain uniqueness, status control (ACTIVE/SUSPENDED), and tenant-level isolation strategy.

Built with:
- Java 21
- Spring Boot 3
- Spring Data JPA
- PostgreSQL
- Eureka Discovery Client

Architecture Style:
- Microservices
- Shared Database with Tenant ID Isolation
- Production-ready layered structure