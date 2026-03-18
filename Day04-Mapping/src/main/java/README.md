# 🚀 Spring Boot REST API – HTML Homepage

This project demonstrates how to return a **custom HTML homepage from a Spring Boot REST API** using `ResponseEntity`.

Instead of returning JSON, the `/welcome` endpoint returns a **styled HTML page** that acts as a simple API dashboard.

---

## 📌 Features

* Return **HTML content from a Spring Boot controller**
* Use **ResponseEntity with HTTP headers**
* Simple **API dashboard UI**
* Button linked to an API endpoint (`/api/students`)
* Clean layout with **navbar, hero section, and cards**

---

## 🛠️ Tech Stack

* **Java**
* **Spring Boot**
* **REST API**
* **HTML + CSS**

---

## 📂 Project Structure

```
src
 └─ main
     └─ java
         └─ com.example.SpringApplication
                 └─ HtmlController.java
```

---

## ⚙️ API Endpoint

### Welcome Page

```
GET /welcome
```

Returns a **custom HTML page**.

Example:

```
http://localhost:8080/welcome
```

---

## 🔗 API Navigation

The homepage contains a card that links to the Students API:

```
GET /api/students
```

Example:

```
http://localhost:8080/api/students
```

Clicking **View API** on the homepage will open the endpoint.

---

## 🧠 Controller Logic

The controller returns HTML using `ResponseEntity` and sets the correct content type.

Example:

```java
@GetMapping("/welcome")
public ResponseEntity<String> getWelcomePage() {

    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.TEXT_HTML);

    return ResponseEntity
            .ok()
            .headers(headers)
            .body(html);
}
```

This ensures the browser renders the response as a **web page instead of plain text**.

---

## ▶️ How to Run

1. Clone the repository
2. Open the project in your IDE
3. Run the Spring Boot application
4. Open your browser and visit:

```
http://localhost:8080/welcome
```

---

## 📷 Demo

The homepage includes:

* Navigation bar
* Welcome section
* API cards
* Students API button
* Modern CSS styling

---

## 📚 Learning Purpose

This project helps understand:

* Returning **HTML responses from REST controllers**
* Using **ResponseEntity**
* Setting **HTTP headers**
* Combining **backend APIs with simple frontend UI**

---

Built while learning **Spring Boot backend development**.
