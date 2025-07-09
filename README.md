# Library_Management_System

# 📚 Library Management System

A simple **console-based Java application** that allows users to manage a library using Object-Oriented Programming (OOP) principles like **Encapsulation, Inheritance, and Polymorphism**.

---

## 🚀 Features

- 📖 Add and manage books
- 👤 Manage student or admin users
- 🔄 Borrow and return books
- ✅ View available books
- 🔐 Follows OOP concepts for structure and scalability

---

## 🛠️ Tech Stack

- **Language:** Java
- **Concepts:** Classes, Objects, Inheritance, Encapsulation, Polymorphism
- **Tools:** VS Code / IntelliJ IDEA

---

## 💻 How to Run the Program

Make sure you have Java installed. Then:

```bash
javac Main.java
java Main

FOLDER STRUCTURE
LibraryManagementSystem/
│
├── Book.java          # Book class with borrow/return logic
├── User.java          # Parent class for users
├── StudentUser.java   # Inherited from User class
├── AdminUser.java     # (Optional) for admin-based extensions
└── Main.java          # Program entry point

SAMPLE OUTPUT

Welcome to Library System
1. Add Book
2. Borrow Book
3. Return Book
4. Exit
Enter your choice:
