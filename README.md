# 🏥 Hospital Management System - Backend

This is the backend of the Hospital Management System built using Spring Boot. It provides REST APIs for user authentication, patient management, and appointment booking.

---

## 🚀 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
---

## 📌 Features

- User Registration & Login (JWT-based)
- Role-based access (Admin / Patient)
- Add Patient Records
- Book Appointments
- REST API integration with frontend

---

## ⚙️ Setup Instructions

1. Clone the repository:
bash
git clone https://github.com/your-username/hospital-backend.git
Open in IDE (IntelliJ / VS Code)

Run the application:
mvn spring-boot:run

Backend runs on:
http://localhost:8080

🗄️ Database (H2)
In-memory / file-based database used for development
Access H2 Console:
http://localhost:8080/h2-console

JDBC URL:
jdbc:h2:file:./data/testdb

📡 API Endpoints
🔐 Auth
POST /users/register
POST /users/login
👤 Patients
POST /patients
GET /patients
📅 Appointments
POST /appointments
GET /appointments
📦 Deployment

Backend is deployed on Render:
https://your-backend-url.onrender.com

⚠️ Note-H2 database is used for development purposes. For production, MySQL/PostgreSQL can be used.
