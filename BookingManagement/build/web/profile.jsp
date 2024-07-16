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
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@400;500;600;700&display=swap" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="css/styles.css" rel="stylesheet">
        <style>
            .container-body {
                min-width: 100%;
                padding: 24px 60px 70px;
            }
            .user-sidebar .nav-link {
                color: #333;
            }
            .user-sidebar .nav-link.active {
                background-color: #439845;
                color: #fff;
            }
            .user-sidebar .nav-link.non-active:hover {
                background-color: rgba(67, 152, 69, 0.7);
                color: #fff;
                cursor: pointer;
            }
            .user-info-card {
                box-shadow: 0 2px 12px rgba(0, 0, 0, .08);
            }
            .user-avatar {
                width: 150px;
                height: 150px;
                object-fit: cover;
                border: solid 1px #439845 !important;
            }
            .btn-mystyle {
                background-color: #439845;
                border-color: #439845;
                color: #fff;
            }
            .btn-mystyle:hover {
                background-color: #367a39;
            }
            .btn-outline-mystyle {
                background-color: #fff;
                border-color: #439845;
                color: #439845;
            }
            .btn-outline-mystyle:hover {
                background-color: #439845;
                color: #fff;
            }
        </style>
    </head>
    <body>
        <div class="container-xxl bg-white p-0">
            <%@include file="header.jsp" %>
            <div class="container container-body border border-dark">
                <div class="row">
                    <div class="col-md-3">
                        <div class="user-sidebar bg-light p-4 rounded">
                            <h4 class="mb-4">My Account</h4>
                            <ul class="nav flex-column">
                                <li class="nav-item">
                                    <a class="nav-link active" href="#">Account Information</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link non-active" href="viewBooking">My Bookings</a>
                                </li>
                                <li class="nav-item">
                                    <label for="password" class="nav-link non-active">Change Password</label>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-md-9">
                        <div class="user-info-card card shadow-sm rounded">
                            <div class="card-body">
                                <h3 class="card-title mb-4">Account Information</h3>
                                <div class="row">
                                    <div class="col-md-4 text-center mb-4">
                                        <img src="img/user-avatar.jpg" alt="User Avatar" class="user-avatar img-fluid rounded-circle border border-primary p-1 mb-3">
                                        <button class="btn btn-outline-primay btn-outline-mystyle" onclick="showErrorModal('Feature not supported yet!')">Change Avatar</button>
                                    </div>
                                    <div class="col-md-8">
                                        <c:set var="p" value="${requestScope.userLogin}">
                                        </c:set>
                                        <form action="main" method="post" onsubmit="return notUpdatePassword() || (validatePassword() && validateConfirmPassword())">
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
                                                <label for="role" class="col-sm-3 col-form-label">Your role</label>
                                                <div class="col-sm-9">
                                                    <input type="text" class="form-control" name="role" id="role" value="${p.role}" readonly>
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
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js">
        </script>
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
            function notUpdatePassword() {
                var password = document.getElementById("password").value;
                return password === "";
            }
            pass.addEventListener("input", validatePassword);
            pass2.addEventListener("input", validateConfirmPassword);
        </script>
        <%@include file="modal.jsp" %>
        <c:if test="${param.success == 'true'}">
            <script>
                showSuccessModal("Update profile successfully!");
            </script>
        </c:if>
        <c:if test="${param.error == 'true'}">
            <script>
                showErrorModal("An error has occurred!");
            </script>
        </c:if>
    </body>
</html>
