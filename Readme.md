# 🚀 Quantity Measurement Application

A robust and scalable **Quantity Measurement System** developed using **Java & Spring Boot**, designed to handle multiple measurement domains such as **Length, Weight, Volume, and Temperature**.

The application supports accurate **unit conversion, cross-unit comparison, and arithmetic operations**, and is built using a **Use Case–driven approach (UC1–UC18)**.
It evolves from core OOP concepts to a **secure, database-integrated backend system with RESTful APIs**.

---

## 👤 Developer

**Akarsh Rai**

---

## 🧠 Use Cases (UC1 – UC18)

### 📏 Core Measurement (UC1 – UC8)

| 🔢 UC   | 📌 Description                                                  |
| ------- | --------------------------------------------------------------- |
| **UC1** | Value-based equality for Feet using `equals()` and `hashCode()` |
| **UC2** | Equality extended to Feet and Inches                            |
| **UC3** | Cross-unit comparison using base unit conversion                |
| **UC4** | Support for multiple length units *(Inch, Feet, Yard, CM)*      |
| **UC5** | Unit conversion across length units                             |
| **UC6** | Addition for same units                                         |
| **UC7** | Addition for different units                                    |
| **UC8** | Immutability, validation, and proper equality handling          |

---

### ⚖️ Extended Measurement (UC9 – UC11)

| 🔢 UC    | 📌 Description                                           |
| -------- | -------------------------------------------------------- |
| **UC9**  | Weight measurement *(Kg, Gram, Tonne)* with conversion   |
| **UC10** | Generic `Quantity` class with `Unit` interface           |
| **UC11** | Volume measurement *(Litre, ML, Gallon)* with operations |

---

### ➕ Advanced Operations (UC12 – UC14)

| 🔢 UC    | 📌 Description                                     |
| -------- | -------------------------------------------------- |
| **UC12** | Subtraction and division operations                |
| **UC13** | Centralized arithmetic logic *(DRY principle)*     |
| **UC14** | Temperature measurement with restricted operations |

---

### 🏗️ Architecture & Backend (UC15 – UC18)

| 🔢 UC    | 📌 Description                                            |
| -------- | --------------------------------------------------------- |
| **UC15** | N-Tier architecture *(Controller → Service → Repository)* |
| **UC16** | JDBC integration with CRUD operations                     |
| **UC17** | Spring Boot REST APIs                                     |
| **UC18** | Security using Spring Security, JWT & OAuth2              |

---

## 🛠️ Tech Stack

* **Java**
* **Spring Boot**
* **Spring Security**
* **JWT Authentication**
* **OAuth2 (Google Login)**
* **JDBC**
* **MySQL**
* **JUnit**
* **Postman**

---

## 📌 Highlights

* Supports multiple measurement domains
* Clean and scalable architecture
* Strong OOP & design principles
* Secure backend with authentication

---

## 🔗 GitHub Repository

👉 [https://github.com/RaiAkarsh/QuantityMeasurementApp](https://github.com/RaiAkarsh/QuantityMeasurementApp)

---

## 🙏 Acknowledgement

Thanks to **BridgeLabz** for structured learning and guidance.

---
