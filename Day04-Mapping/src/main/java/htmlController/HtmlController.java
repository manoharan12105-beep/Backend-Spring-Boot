package com.example.SpringApplication.ClassFolder;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HtmlController {

    @GetMapping("/welcome")
    public ResponseEntity<String> getWelcomePage() {

        String html = """
        <!DOCTYPE html>
<html>
<head>
<title>Spring Boot API</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background: linear-gradient(120deg,#667eea,#764ba2);
    color:white;
}

/* Navbar */

nav{
    display:flex;
    justify-content:space-between;
    padding:20px 80px;
    background:rgba(0,0,0,0.2);
}

nav h2{
    letter-spacing:1px;
}

nav ul{
    list-style:none;
    display:flex;
    gap:25px;
}

nav a{
    text-decoration:none;
    color:white;
    font-size:16px;
}

/* Hero Section */

.hero{
    text-align:center;
    padding:120px 20px 60px;
}

.hero h1{
    font-size:50px;
    margin-bottom:20px;
}

.hero p{
    font-size:20px;
    opacity:0.9;
}

/* API Cards */

.container{
    width:80%;
    margin:auto;
    margin-top:40px;
}

.cards{
    display:flex;
    justify-content:center;
    gap:30px;
    flex-wrap:wrap;
}

.card{
    background:white;
    color:#333;
    width:250px;
    padding:25px;
    border-radius:10px;
    text-align:center;
    box-shadow:0 10px 25px rgba(0,0,0,0.2);
    transition:0.3s;
}

.card:hover{
    transform:translateY(-8px);
}

.card h3{
    margin-bottom:10px;
}

.card button{
    margin-top:15px;
    padding:8px 18px;
    border:none;
    background:#667eea;
    color:white;
    border-radius:5px;
    cursor:pointer;
}

/* Footer */

footer{
    text-align:center;
    margin-top:80px;
    padding:20px;
    opacity:0.8;
}

</style>

</head>

<body>

<nav>
    <h2>Spring Boot API</h2>
    <ul>
        <li><a href="#">Home</a></li>
        <li><a href="#">Docs</a></li>
        <li><a href="#">GitHub</a></li>
    </ul>
</nav>

<section class="hero">

<h1>Welcome to My Spring Boot Backend</h1>

<p>
This project demonstrates REST APIs built using Java and Spring Boot.
Explore the endpoints below.
</p>

</section>

<div class="container">

<div class="cards">

<div class="card">
<h3>Students API</h3>
<p>Get all students from database.</p>
<a href="/api/students">
<button>View API</button>
</a>
</div>

<div class="card">
<h3>Products API</h3>
<p>Access product related endpoints.</p>
<button>View API</button>
</div>

<div class="card">
<h3>Users API</h3>
<p>User management endpoints.</p>
<button>View API</button>
</div>

</div>

</div>

<footer>

Built with  using Java & Spring Boot

</footer>

</body>
</html>
        """;

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_HTML);

        return ResponseEntity
                .ok()
                .headers(headers)
                .body(html);
    }
}
