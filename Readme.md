# Quantity Measurement App — Microservices Architecture

## Architecture Overview

```
Angular Frontend (port 4200)
         |
         ▼
   API Gateway (port 8080)       ← single entry point, JWT validation, CORS
     /            \
Auth Service   Quantity Service
 (port 8081)    (port 8082)
     \            /
    Eureka Server (port 8761)    ← service discovery registry
         |
      MySQL DB
```

---

## Services Summary

| Service          | Port | Responsibility                              |
|------------------|------|---------------------------------------------|
| eureka-server    | 8761 | Service registry (all services register here)|
| auth-service     | 8081 | Login, signup, JWT generation                |
| quantity-service | 8082 | Calculations, conversion, CRUD history       |
| api-gateway      | 8080 | Routes Angular requests, validates JWT       |
| Angular frontend | 4200 | UI (talks only to gateway on port 8080)      |

---

## Startup Order (IMPORTANT — follow this order)

### Step 1: Start MySQL
Make sure MySQL is running and create the two databases:

```sql
CREATE DATABASE quantity_auth_db;
CREATE DATABASE quantity_measurement_db;
```

### Step 2: Start Eureka Server
```bash
cd eureka-server
mvn spring-boot:run
```
Open http://localhost:8761 to confirm it's running.

### Step 3: Start Auth Service
```bash
cd auth-service
mvn spring-boot:run
```
Wait for it to register with Eureka.

### Step 4: Start Quantity Service
```bash
cd quantity-service
mvn spring-boot:run
```

### Step 5: Start API Gateway
```bash
cd api-gateway
mvn spring-boot:run
```

### Step 6: Start Angular Frontend

```bash
cd quantity-app
npm install
ng serve
```
Open http://localhost:4200

---

## API Endpoints (via Gateway on port 8080)

### Auth (public — no token needed)
| Method | URL                        | Body                                | Returns      |
|--------|----------------------------|-------------------------------------|--------------|
| POST   | /api/v1/auth/signup        | `{"username":"","password":""}`     | token + user |
| POST   | /api/v1/auth/login         | `{"username":"","password":""}`     | token + user |

### Quantities (protected — send `Authorization: Bearer <token>` header)
| Method | URL                             | Body / Params                                              |
|--------|---------------------------------|------------------------------------------------------------|
| POST   | /api/v1/quantities/convert      | `{"value":100,"unit":"meter","type":"Length"}&target=feet` |
| POST   | /api/v1/quantities/add          | `[{...q1}, {...q2}]`                                       |
| POST   | /api/v1/quantities/subtract     | `[{...q1}, {...q2}]`                                       |
| POST   | /api/v1/quantities/divide       | `[{...q1}, {...q2}]`                                       |
| POST   | /api/v1/quantities/compare      | `[{...q1}, {...q2}]`                                       |
| GET    | /api/v1/quantities              | —                                                          |
| GET    | /api/v1/quantities/{id}         | —                                                          |
| PUT    | /api/v1/quantities/{id}         | `{"operation":"","result":""}`                             |
| DELETE | /api/v1/quantities/{id}         | —                                                          |

### Supported Units
| Type        | Units                                    |
|-------------|------------------------------------------|
| Length      | meter, km, cm, feet, inch, yard          |
| Weight      | kg, gram, tonne                          |
| Volume      | litre, ml, gallon                        |
| Temperature | celsius, fahrenheit                      |

---
