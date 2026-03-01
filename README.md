# 🚀 Spring Boot REST API Practice Projects

This repository contains multiple hands-on REST API examples built using **Spring Boot**.  
Each folder represents a separate example covering different REST concepts.

---

## 📂 Project Structure

```
REST_API_Ex-1
REST_API_Ex-2
REST_API_Ex-3
REST_API_Ex-4
REST_API_Ex-5
REST_API_Ex-6
REST_API_Ex-7
REST_API_Ex-8
REST_API_Ex-9
```

Each example focuses on different REST features such as:

- Creating REST Controllers
- Handling GET, POST, PUT, DELETE
- Path Variables
- Request Parameters
- Request Body
- ResponseEntity
- HTTP Status Codes
- Exception Handling
- JSON Data Handling

---

## 🛠️ Technologies Used

- Java (JDK 21 LTS)
- Spring Boot
- Spring Web
- Maven
- Postman (for testing APIs)

---

## ▶️ How to Run

1. Clone the repository:
   ```bash
   git clone <your-repo-url>
   ```

2. Open any example project in **Spring Tool Suite (STS)** or **IntelliJ IDEA**.

3. Make sure:
   - JDK 21 is installed
   - Maven dependencies are downloaded

4. Run the main class:
   ```java
   @SpringBootApplication
   public class Application {
       public static void main(String[] args) {
           SpringApplication.run(Application.class, args);
       }
   }
   ```

5. Application will start on:
   ```
   http://localhost:8080
   ```

---

## 📌 Example API Endpoints

Example:

### ✅ GET Request
```
GET http://localhost:8080/api/students
```

### ✅ GET by ID
```
GET http://localhost:8080/api/students/101
```

### ✅ POST Request
```
POST http://localhost:8080/api/students
```

### ✅ PUT Request
```
PUT http://localhost:8080/api/students/101
```

### ✅ DELETE Request
```
DELETE http://localhost:8080/api/students/101
```

---

## 📖 Learning Objectives

✔ Understand REST architecture  
✔ Learn HTTP methods  
✔ Work with JSON data  
✔ Understand status codes  
✔ Handle request & response properly  
✔ Build real-world REST APIs  

---

## 📌 Author

**Phoolsagar Singh**  
BTech Student | Java Full Stack Developer  
Currently Learning: Spring Boot & REST APIs  

---

## ⭐ Future Improvements

- Connect with Database (MySQL)
- Add Validation
- Add Global Exception Handling
- Add Swagger Documentation
- Add Security (Spring Security)

---

## 🙌 Contribution

This repository is created for learning and practice purpose.  
Feel free to fork and improve it.

---

### 🔥 Happy Coding!
