<%-- 
    Document   : profile
    Created on : 21/06/2024, 1:01:17 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Profile</title>
        <link rel="icon" type="image/x-icon" href="assets/images/favicon.png">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@400;500;600;700&display=swap" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <style>
            .container-body {
                max-width: 1200px !important;
                padding: 0 !important;
                margin-bottom: 24px;
            }
            .breadcrumb-p {
                color: #439845;
                font-weight: bold;
            }
            .user-sidebar {
                background-color: #f8f9fa;
                padding: 20px;
                border-radius: 5px;
            }
            label[for="password"]:hover {
                cursor: pointer;
            }
            .user-sidebar .nav-link {
                color: #333;
                padding: 10px 15px;
            }
            .user-sidebar .nav-link.active {
                background-color: #439845;
                color: #fff;
                border-radius: 5px;
            }
            .user-info-card {
                box-shadow: 0 2px 12px rgba(0, 0, 0, .08);
                border-radius: 5px;
            }
            .user-avatar {
                width: 150px;
                height: 150px;
                object-fit: cover;
                padding: 2px;
                border: solid 1px #439845;
                border-radius: 50%;
            }
            .user-sidebar .nav-item .nav-link.non-active{
                color: #000  !important;
            }
            .card-body .btn.btn-outline-mystyle {
                background-color: #fff;
                border-color: #439845;
                color: #439845;
            }
            .card-body .btn.btn-mystyle, 
            .card-body .btn.btn-outline-mystyle:hover {
                background-color: #439845;
                border-color: #439845;
                color: #fff;
            }
            .card-body .btn.btn-mystyle:hover {
                background-color: #367a39;
            }
        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="container container-body mt-4">
            <nav aria-label="breadcrumb">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="home" class="breadcrumb-p">Home</a></li>
                    <li class="breadcrumb-item active breadcrumb-p" aria-current="page">User Information</li>
                </ol>
            </nav>

            <div class="row">
                <div class="col-md-3">
                    <div class="user-sidebar">
                        <h4 class="mb-4">My Account</h4>
                        <ul class="nav flex-column">
                            <li class="nav-item">
                                <a class="nav-link active" href="#">Account Information</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link non-active" href="#">My Orders</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link non-active" href="#">Shipping Addresses</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link non-active" href="#">Favorite Products</a>
                            </li>
                            <li class="nav-item">
                                <label for="password" class="nav-link non-active">Change Password</label>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-9">
                    <div class="card user-info-card">
                        <div class="card-body">
                            <h3 class="card-title mb-4">Account Information</h3>
                            <div class="row">
                                <div class="col-md-4 text-center mb-4">
                                    <img src="img/room-default.jpg" alt="User Avatar" class="user-avatar mb-3">
                                    <button class="btn btn-outline-primay  btn-outline-mystyle">Change Avatar</button>
                                </div>
                                <div class="col-md-8">
                                    <c:set var="p" value="${requestScope.userLogin}"></c:set>
                                    <form action="main" method="post">
                                        <div class="mb-3 row">
                                            <label for="fullName" class="col-sm-3 col-form-label">Full Name</label>
                                            <div class="col-sm-9">
                                                <input maxlength="40" type="text" class="form-control" name="fullName" id="fullName" value="${p.fullName}" required>
                                            </div>
                                        </div>
                                        <div class="mb-3 row">
                                            <label for="email" class="col-sm-3 col-form-label">Email</label>
                                            <div class="col-sm-9">
                                                <input type="email" class="form-control" name="email" id="email" value="${p.email}" required>
                                            </div>
                                            <div class="text-danger mt-2" style="display: none; ${emailErrStyle}">
                                                Email is already in use!
                                            </div>
                                        </div>
                                        <div class="mb-3 row">
                                            <label for="username" class="col-sm-3 col-form-label">Username</label>
                                            <div class="col-sm-9">
                                                <input type="text" class="form-control" name="username" id="username" value="${p.username}" required>
                                            </div>
                                            <div class="text-danger mt-2" style="display: none; ${usernameErrStyle}">
                                                Username is already in use!
                                            </div>
                                        </div>
                                        <div class="mb-3 row">
                                            <label for="password" class="col-sm-3 col-form-label">New Password</label>
                                            <div class="col-sm-9">
                                                <input type="password" class="form-control" name="password" id="password">
                                            </div>
                                            <div id="passwordError" class="text-danger mt-2" style="display: none;">
                                                Password must be at least 6 characters long and include at least 1 uppercase letter, 1 lowercase letter, and 1 digit.
                                            </div>
                                        </div>
                                        <div class="mb-3 row">
                                            <label for="confirmPassword" class="col-sm-3 col-form-label">Confirm new Password</label>
                                            <div class="col-sm-9">
                                                <input type="password" class="form-control" id="confirmPassword">
                                            </div>
                                            <div id="password2Error" class="text-danger mt-2" style="display: none;">
                                                Passwords do not match!
                                            </div>
                                        </div>
                                        <div class="text-end">
                                            <input type="hidden" name="action" value="updateProfile">
                                            <button type="submit" class="btn btn-primary btn-mystyle">Save Changes</button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="footer.jsp" %>
        <%@include file="modal.jsp" %>
        <!--<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>-->
        <script src="assets/js/bootstrap.bundle.min.js"></script>
        <script>
            const pass = document.querySelector("#password");
            const pass2 = document.querySelector("#confirmPassword");

            function validatePassword() {
                var password = document.getElementById("password").value;
                var passwordError = document.getElementById("passwordError");
                var result = true;

                const hasUpperCase = /[A-Z]/.test(password);
                const hasLowerCase = /[a-z]/.test(password);
                const hasDigit = /[0-9]/.test(password);

                if (password.length >= 6 && hasUpperCase && hasLowerCase && hasDigit) {
                    passwordError.style.display = "none";
                } else {
                    passwordError.style.display = "block";
                    result = false;
                }
                return result;
            }
            function validateConfirmPassword() {
                var password = document.getElementById("password").value;
                var confirmPassword = document.getElementById("confirmPassword").value;
                var password2Error = document.getElementById("password2Error");
                var result = true;

                if (password !== confirmPassword) {
                    password2Error.style.display = "block";
                    result = false;
                } else {
                    password2Error.style.display = "none";
                }
                return result;
            }
            pass.addEventListener("input", validatePassword);
            pass2.addEventListener("input", validateConfirmPassword);
        </script>
        <c:if test="${param.success == true}">
            <script>
                showSuccessModal("Update profile successfully!");
            </script>
        </c:if>
    </body>
</html>
