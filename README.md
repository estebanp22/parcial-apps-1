# Restobar Management System

This project is a RESTful API built with **Spring Boot**, **JPA**, and **MySQL** to manage a restaurant's operations, including customers, orders, employees, products, and categories.

## Prerequisites

Before running the application, ensure you have the following installed:
- **Java 17** or later
- **Docker / Docker Engine**

## Setup Instructions

### 1. Clone the repository
```bash
git clone https://github.com/estebanp22/parcial-apps-1.git
```

### 2. Configure the database
The project uses **MySQL** inside a Docker container. To start the database, run:
```bash
docker-compose up -d
```
This will start MySQL on port **5500** with the necessary configurations.

### 3. Update application.properties (if needed)
By default, the application is configured to connect to MySQL on port **5500**. If needed, update the database credentials in `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:5500/restobar?useSSL=false&serverTimezone=UTC
spring.datasource.username=esteban
spring.datasource.password=2210
```

### 4. Build and Run the Application

The API will be available at: **http://localhost:4500/api/** + endpoint

### 5. API Endpoints
| Method | Endpoint          | Description                   |
|--------|------------------|-------------------------------|
| POST   | `/customer/save`  | Create a new customer        |
| GET    | `/customer/{id}`  | Get customer by ID           |
| GET    | `/customer/getAll` | Get all customers            |
| PUT    | `/customer/{id}`  | Update customer information  |
| DELETE | `/customer/{id}`  | Delete a customer            |

Similar endpoints exist for **orders, employees, products, and categories**.

### 6. Accessing Adminer (Database UI)
The **Adminer** tool is included for easy database management. Access it at:
- **URL:** [http://localhost:8000](http://localhost:8000)
- **Server:** `mysql`
- **Username:** `esteban`
- **Password:** `2210`
- **Database:** `restobar`

## Technologies Used
- **Spring Boot** (REST API)
- **Spring Data JPA** (ORM)
- **MySQL** (Database)
- **Docker & Docker Compose** (Containerization)
- **Lombok** (Reducing boilerplate code)

## License
This project is open-source and available under the MIT License.

