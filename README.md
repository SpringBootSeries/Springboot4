# 🎓 Student Management Spring Boot Application

This is a simple Spring Boot REST API application to manage student data. It provides endpoints to retrieve, add, and delete student records.

## 📁 Project Structure

```
src
├── controller
│   └── AppControllers.java
├── model
│   ├── Student.java
│   └── Course.java
```

## 🚀 How to Run the Application

### ✅ Prerequisites:
- Java 17 or later
- Maven
- IDE (optional): IntelliJ IDEA / Eclipse
- Postman for testing the API

### 🛠 Build & Run the App

```bash
# Compile and run the project
./mvnw spring-boot:run
```

The app will be available at:  
`http://localhost:8080/app`

---

## 🌐 API Endpoints

### 1. Test Message
```bash
 http://localhost:8080/app/msg
```
**Response**: `Hello Spring Boot!`

---

### 2. Get Age Message
```bash
http://localhost:8080/app/age/25
```
**Response**: \`My Age is 25\`

---

### 3. Get One Student (Hardcoded)
```bash
 http://localhost:8080/app/student
```

---

### 4. Get All Students
```bash
 http://localhost:8080/app/students
```

---

### 5. Get Student by Registration Number
```bash
curl http://localhost:8080/app/students/2020ict65
```

---

### 6. Add a New Student
```bash
curl -X POST http://localhost:8080/app/add 
"Content-Type: application/json" 
{
  "regNo": "2020ict65",
  "name": "Chandru",
  "age": 23,
  "course": "IT",
  "gpa": 3.66
}
```
**Response**: `New Student added`

---

### 7. Delete a Student by Registration Number
```bash
 http://localhost:8080/app/students/2020CS99
```
**Response**:  
- If exists: `The student removed`  
- If not: `404 couldn't find the student`

---

## 📌 Notes
- Students are initialized in-memory using a `HashMap`, so data will reset on every application restart.
- No database connection is used in this project.
- Endpoint /`findage` is present but not implemented yet.

---

## 📚 Example Student Object Format

```json
{
  "regNo": "2020ict65",
  "name": "Chandru",
  "age": 23,
  "course": "IT",
  "gpa": 3.66
}
```

---

## 📎 License

This project is for educational use and does not include any license.



