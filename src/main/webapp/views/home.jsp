<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Job Portal</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="style1.css">
    <style>
        body {
            background-color: #eef2f3;
        }
        .navbar {
            background-color: #343a40; /* Dark gray */
        }
        .navbar-brand {
            color: #ffffff;
        }
        .nav-link {
            color: #f8f9fa;
        }
        .hero {
            background-color: #007bff; /* Bootstrap primary color */
            color: white;
            padding: 50px 20px;
            text-align: center;
            border-radius: 8px;
            margin-bottom: 30px;
        }
        .card {
            border-radius: 8px;
            transition: transform 0.2s;
        }
        .card:hover {
            transform: scale(1.05);
        }
        .btn-primary {
            background-color: #28a745; /* Green */
            border: none;
        }
        .btn-primary:hover {
            background-color: #218838; /* Darker green */
        }
    </style>
</head>
<body>

    <nav class="navbar navbar-expand-lg navbar-dark">
        <div class="container">
            <a class="navbar-brand fs-1 fw-bold" href="#">Job Portal</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item"><a class="nav-link" href="home">Home</a></li>
                    <li class="nav-item"><a class="nav-link" href="viewalljobs">All Jobs</a></li>
                    <li class="nav-item"><a class="nav-link" href="https://telusko.com/">Contact</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <header class="hero">
        <h1>Welcome to the Job Portal</h1>
        <p>Your next job opportunity is just a click away!</p>
    </header>

    <main class="container mt-5">
        <div class="row">
            <!-- Job Listings Card -->
            <div class="col-md-6 mb-4">
                <div class="card bg-warning shadow-sm">
                    <div class="card-body text-center">
                        <h5 class="card-title">View All Jobs</h5>
                        <form action="/viewalljobs" method="get">
                            <button type="submit" class="btn btn-primary">View Jobs</button>
                        </form>
                    </div>
                </div>
            </div>

            <!-- Add Job Card -->
            <div class="col-md-6 mb-4">
                <div class="card bg-light shadow-sm">
                    <div class="card-body text-center">
                        <h5 class="card-title">Add Job</h5>
                        <form action="/addjob" method="get">
                            <button type="submit" class="btn btn-primary">Add Job</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </main>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>

