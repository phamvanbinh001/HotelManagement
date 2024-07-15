<%-- 
    Document   : register
    Created on : Jul 10, 2024, 2:55:04 PM
    Author     : ADMIN
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Register</title>
        <link rel="icon" type="image/x-icon" href="assets/images/favicon.png">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@400;500;600;700&display=swap" rel="stylesheet">
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <style>
            body {
/*                font-family: Quicksand, sans-serif;*/
                background-color: #f8f9fa;
            }
            .register-container {
                max-width: 400px;
                margin: 50px auto;
                padding: 20px;
                background-color: #fff;
                border-radius: 5px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            }
            .submit-btn {
                background-color: #439845;
                border-color: #439845;
            }
            .submit-btn:hover {
                background-color: #367a39;
                border-color: #367a39;
            }
            a.login {
                color: #439845;
                transition: color 0.3s ease;
            }
            a.login:hover {
                color: #367a39;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <div class="register-container">
                <h2 class="text-center mb-4">Register</h2>
                <form action="main" method="post" onsubmit="return validatePassword() && validateConfirmPassword()">
                    <input type="hidden" name="action" value="register">
                    <div class="mb-3">
                        <label for="username" class="form-label">Username</label>
                        <input type="text" class="form-control" id="username" name="username" value="${username}" required>
                    </div>
                    <div class="text-danger mb-3" style="display: none; ${usernameErrStyle}">
                        Username is already in use!
                    </div>
                    <div class="mb-3">
                        <label for="email" class="form-label">Email</label>
                        <input type="email" class="form-control" id="email" name="email" value="${email}" required>
                    </div>
                    <div class="text-danger mb-3" style="display: none; ${emailErrStyle}">
                        Email is already in use!
                    </div>
                    <div class="mb-3">
                        <label for="password" class="form-label">Password</label>
                        <input type="password" class="form-control" id="password" name="password" required>
                    </div>
                    <div id="passwordError" class="text-danger mb-3" style="display: none;">
                        Password must be at least 6 characters long and include at least 1 uppercase letter, 1 lowercase letter, and 1 digit.
                    </div>
                    <div class="mb-3">
                        <label for="confirmPassword" class="form-label">Confirm Password</label>
                        <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" required>
                    </div>
                    <div id="password2Error" class="text-danger mb-3" style="display: none;">
                        Passwords do not match!
                    </div>
                    <button type="submit" class="btn btn-primary submit-btn w-100">Register</button>
                    <div class="text-center mt-3">
                        <a class="login d-block" href="${param.src != null ? param.src.replaceFirst(".jsp","") : "home"}?login=yes">Already have an account? Login</a>
                    </div>
                </form>
            </div>
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
            pass.addEventListener("input", validatePassword);
            pass2.addEventListener("input", validateConfirmPassword);
        </script>
    </body>
</html>