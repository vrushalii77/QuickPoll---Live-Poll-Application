# QuickPoll - A Simple Polling Application

**QuickPoll** is a lightweight and easy-to-use polling application built using **Spring Boot** and **JDBC**. This application allows users to create polls, add options, vote on their preferred options, and view poll results in real-time.

## # Features

- 1. Create new polls
- 2. Add multiple options to polls
- 3. Vote on poll options
- 4. View poll results
- 5. Simple REST APIs for easy testing with Postman or any API client

---

## # Technologies Used

- **Java 11+**
- **Spring Boot**
- **JDBC**
- **MySQL**
- **Postman** (for API testing)

---

## # API Endpoints

### 1. Create a Poll

- **URL:** `POST /createPoll`
- **Request JSON:**
```json
{
  "question": "What is your favorite programming language?"
}
```

### 2. Add Options to Poll

- **URL:** `POST /addOption`
- **Request JSON:**
```json
{
  "pollId": 1,
  "option": "Java"
}
```

### 3. Vote for an Option

- **URL:** `POST /vote`
- **Request JSON:**
```json
{
  "pollId": 1,
  "optionId": 2
}

```

### 4. Get Poll Results

- **URL:** `GET /getPollResults/{pollId}`
- **Example:**
```json
{
  "pollId": 1,
  "question": "What is your favorite programming language?",
  "options": [
    {
      "optionId": 1,
      "optionText": "Java",
      "votes": 10
    },
    {
      "optionId": 2,
      "optionText": "Python",
      "votes": 15
    }
  ]
}


```

 ## # How to Run Locally
**Prerequisites**
1. Java 11+
2. MySQL Server
3. Maven

