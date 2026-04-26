Inventory Management System

PROJECT DESCRIPTION
The Inventory Management System is a web-based application developed using Spring Boot MVC.
It is designed to manage end-user IT equipment such as laptops, routers, printers, and other devices.

KEY FEATURES:
- Add new equipment
- View list of all assets
- Update/Edit asset details
- Delete assets
- Track status (Available, Assigned, Maintenance)
- Dashboard summary of assets

SYSTEM ADMINISTRATOR CREDENTIALS

Username: 24rp01507
Password: 24rp01217

SETUP INSTRUCTIONS

1. Requirements:
- Java 8+
- Maven
- MySQL Server
- IDE (IntelliJ / Eclipse)

2. Database Setup:
CREATE DATABASE airtel_inventory;

USE airtel_inventory;

3. Configure application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/airtel_inventory
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
server.port=8091

4. Run Application:
mvn spring-boot:run

5. Access System:
http://localhost:8091/login

NAVIGATION:
- Dashboard: view statistics
- Assets: manage equipment
- Add Asset: insert new equipment
- Edit Asset: update details
- Delete Asset: remove asset

TECHNOLOGIES:
- Java
- Spring Boot MVC
- Thymeleaf
- MySQL
- Maven
- Bootstrap

NOTE:
This is a demo academic project.
