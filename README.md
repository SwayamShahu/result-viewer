# 🎓 Result Viewer – Student Result Management System

A web-based **Student Result Viewer** built using **Spring Boot, Thymeleaf, and Tailwind CSS**.
This application allows students to securely check their examination results using their **Roll Number and Date of Birth**.

The system fetches student information and marks from a **database** and displays the results in a clean, printable format.

---

## 🚀 Features

* 🔍 **View Result**

  * Students can check results using Roll Number and Date of Birth.

* 🧾 **Detailed Result Page**

  * Displays student details:

    * Name
    * Roll Number
    * Date of Birth
    * School
    * Standard

* 📊 **Subject-wise Marks Table**

  * Shows marks, maximum marks, and grade for each subject.

* 🖨 **Print Result**

  * One-click print functionality for downloading or printing the marksheet.

* ❓ **Help Page**

  * Instructions on how to view results and contact support.

* 📱 **Responsive UI**

  * Built using Tailwind CSS for a modern and mobile-friendly design.

---

## 🛠 Tech Stack

**Backend**

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA

**Frontend**

* Thymeleaf
* Tailwind CSS
* HTML5
* JavaScript

**Database**

* MySQL

---

## 🏗 Project Structure

```
result-viewer
│
├── controller
│   └── PageController.java
│
├── model
│   ├── Student.java
│   └── Mark.java
│
├── repository
│   ├── StudentRepository.java
│   └── MarkRepository.java
│
├── dto
│   └── RequestResultForm.java
│
├── templates
│   ├── index.html
│   ├── viewResultForm.html
│   ├── resultPage.html
│   └── help.html
│
└── application.properties
```

---

## ⚙️ How It Works

1. Student enters **Roll Number and Date of Birth**.
2. The application queries the **Student database**.
3. If the student exists:

   * Their marks are fetched from the **Marks table**.
4. The results are displayed using **Thymeleaf templates**.

Flow:

```
User Input
   ↓
Spring Boot Controller
   ↓
Student Repository
   ↓
Mark Repository
   ↓
Thymeleaf Result Page
```

---

## 🖥 Screenshots

### Home Page

Landing page with navigation.
<img width="1895" height="908" alt="image" src="https://github.com/user-attachments/assets/5440318d-bc4f-4070-8543-124428b4203b" />


### Result Page

Displays student information and subject-wise marks.
<img width="1915" height="905" alt="image" src="https://github.com/user-attachments/assets/68562e0b-cb06-4286-9585-1f677c5132a0" />


### Help Page

Provides instructions and support information.

<img width="1895" height="913" alt="image" src="https://github.com/user-attachments/assets/eaa80518-f707-41d3-b470-9b9c2f7369a5" />


---

## ▶️ Running the Project

### 1. Clone Repository

```
git clone https://github.com/yourusername/result-viewer.git
```

### 2. Open in IDE

Recommended IDE:

* IntelliJ IDEA
* Eclipse
* VS Code

### 3. Configure Database

Update `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/result_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4. Run Application

Run the Spring Boot application:

```
ResultViewerApplication.java
```

### 5. Open in Browser

```
http://localhost:8080
```

---

## 📌 Future Improvements

* Admin Dashboard
* Add / Edit Student Results
* Result PDF Download
* Result Analytics
* Authentication for Admin Panel

---

## 👨‍💻 Author

**Swayam Shahu**

Aspiring **UI Designer & Front-End Developer**

---

## 📄 License

This project is open-source and available for educational purposes.
