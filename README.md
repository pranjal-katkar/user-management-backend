# 🛠️ User Management Backend

This is the Spring Boot + PostgreSQL backend for the full-stack **User Management System**. It provides RESTful APIs to manage users and is deployed on Render.

## 🔗 Live Backend URL

👉 [https://user-management-backend-bqat.onrender.com/api/users](https://user-management-backend-bqat.onrender.com/api/users)

---

## 📡 API Endpoints

| Method | Endpoint                 | Description          |
|--------|--------------------------|----------------------|
| GET    | `/api/users`             | Get all users        |
| GET    | `/api/users/{id}`        | Get user by ID       |
| POST   | `/api/users`             | Create a new user    |
| PUT    | `/api/users/{id}`        | Update existing user |
| DELETE | `/api/users/{id}`        | Delete a user        |

---

## ✅ Health Check

You can visit the base URL to check if the backend is running:  
**[https://user-management-backend-bqat.onrender.com/](https://user-management-backend-bqat.onrender.com/)**  
It will respond with:

```

HELLO

```

---

## ⚙️ Tech Stack

- Java 17  
- Spring Boot 3.x  
- Spring Data JPA  
- PostgreSQL  
- Maven  
- Deployed on Render

---

## 📁 Project Structure

```

src/
├── controller/
│   └── UserController.java
├── model/
│   └── User.java
├── repository/
│   └── UserRepository.java
├── UserbackendApplication.java
└── resources/
└── application.properties

```

---

## ⚙️ Environment Variables (on Render)

These must be configured under Render → Environment:

```

spring.datasource.url=jdbc\:postgresql://<your-render-db-url>
spring.datasource.username=<your-db-username>
spring.datasource.password=<your-db-password>
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

````

---

## 🧪 Run Locally

1. Clone the repo:
```bash
git clone https://github.com/pranjal-katkar/user-management-backend.git
cd user-management-backend
````

2. Add PostgreSQL credentials in `application.properties`.

3. Run:

```bash
./mvnw spring-boot:run
```

Visit: [http://localhost:8080](http://localhost:8080)

---
