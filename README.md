# QuickPoll - A Simple Polling Application

**QuickPoll** is a lightweight and easy-to-use polling application built using **Spring Boot** and **JDBC**. This application allows users to create polls, add options, vote on their preferred options, and view poll results in real-time.

## 🧩 Features

- ✅ Create new polls
- ➕ Add multiple options to polls
- 🗳️ Vote on poll options
- 📊 View poll results
- 🧪 Simple REST APIs for easy testing with Postman or any API client

---

## 🛠️ Technologies Used

- **Java 11+**
- **Spring Boot**
- **JDBC**
- **MySQL**
- **Postman** (for API testing)

---

## 📦 API Endpoints

### 1. Create a Poll

- **URL:** `POST /createPoll`
- **Request JSON:**
```json
{
  "question": "What is your favorite programming language?"
}
