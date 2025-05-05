# Canteen-Management-System
A spring boot backend application to manage canteens, employees, daily menus, and food items using *Jakarta Persistence API (JPA)**.

## 🛠️ Technologies Used

- Java 17+
- Spring Boot
- JPA (Hibernate)
- H2 (or MySQL/PostgreSQL)
- Maven or Gradle
- Jakarta Persistence (JPA)

---

## 📦 Features

- Manage multiple **Canteens** and their **Locations**
- Assign **Employees** to multiple Canteens (Many-to-Many)
- Link **Daily Menus** to specific Canteens and Dates
- Associate multiple **Food** items with Daily Menus
- Inheritance mapping for Employees via a `Person` superclass

---

## 📁 Project Structure
src/
└── main/
└── java/
└── lk/
└── ac/
└── vau/
└── Model/
├── Canteen.java
├── DailyMenu.java
├── Employee.java
├── Food.java
└── Person.java




