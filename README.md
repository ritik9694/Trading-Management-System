# Trading Management System

## Overview
The Trading Management System is a comprehensive platform designed to manage trading operations efficiently. Built using Spring Boot microservices architecture, it ensures scalability, modularity, and ease of maintenance. This system facilitates trade execution, portfolio management, user authentication, and reporting functionalities.

## Features
- Microservices Architecture: Each domain entity is managed by a dedicated microservice.
- CRUD Operations: Full Create, Read, Update, Delete functionality for all entities.
- Spring Security: Secure access to services with authentication and authorization.
- Eureka Discovery Server: Service registration and discovery for seamless communication.
- Swagger Documentation: Interactive API documentation for all microservices.
- API Gateway: Centralized routing and access control for all services.

## Microservices
- **Trading Company Service**: Manage trading companies and their details.
- **Trader Service**: Handle trader profiles and activities.
- **Trade Orders Service**: Create and manage trade orders.
- **Asset Service**: Manage financial assets and instruments.
- **Settlement Service**: Process and track trade settlements.

## Technologies Used
- Java 17
- Spring Boot
- Spring Cloud (Eureka, Gateway)
- Spring Security
- Swagger (Springfox)
- Maven

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone [https://github.com/ritik9694/trading-management-system.git
](https://github.com/ritik9694/Trading-Management-System)
