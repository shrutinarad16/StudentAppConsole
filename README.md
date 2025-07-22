# 🧑‍🎓 StudentAppConsole – Java Desktop CRUD Utility + Windows Service

🚀 **Author**: Shruti Narad  
📧 **Contact**: shrutinarad06@gmail.com  
📱 **LinkedIn**: [linkedin.com/in/shrutinarad16](https://linkedin.com/in/shrutinarad)  
📍 **Location**: Maharashtra, India  
🎯 **Open to Work**: Java Developer | Spring Boot | Backend Engineer

---

## 💡 Project Overview

**StudentAppConsole** is a Java-based desktop console application that performs full **CRUD operations** (Create, Read, Update, Delete) on a `Student` database table. This utility was further **converted into a Windows Service**, demonstrating my ability to handle both application logic and deployment/service-layer management.

### ✅ Features

- 📦 Java Console-based UI
- 💾 CRUD operations on `Student` table:
  - `id` (INT)
  - `name` (VARCHAR)
  - `course` (VARCHAR)
- 🔗 JDBC integration with Oracle (via `ojdbc8.jar`)
- 🔄 Runs as a **Windows Service**
- 🛠️ Command-line execution with `run.bat`
- 📁 Clean structure with Maven support

---

## ⚙️ Technologies Used

- **Java 8+**
- **JDBC (Oracle)**
- **Maven**
- **Windows Service Integration (via batch and JAR deployment)**
- **Oracle Database**

---

## 📸 Console Preview
Welcome to Student Database Utility

Add Student

View All Students

Update Student

Delete Student

Exit


## 🔧 How to Run Locally

### ▶️ Console App

```bash
1. Clone this repository.
2. Import the project into Eclipse or run `StudentAppConsole.jar` directly.
3. Configure your Oracle DB credentials in the Java class.
4. Execute `run.bat` to launch console UI.
```

## As Windows Service
1. Build the project using Maven (or use the provided JAR).
2. Use any Java service wrapper (like NSSM or WinSW) to install the JAR as a service.
3. Start the service from Windows Service Manager.

## 🔐 Database Setup (Oracle)
```bash
CREATE TABLE Student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    course VARCHAR(50)
);
```

## 📞 Reach Me
📧 Email: shrutinarad06@gmail.com

📍 Location: Warora, Maharashtra, India

#### 🔍 “If you're hiring for a Java role, I would love the opportunity to connect and grow with your team!”

## 🏁 Final Note
This project showcases my real-world development, database handling, and deployment skills using Java. Looking forward to joining innovative teams and taking this passion forward!
