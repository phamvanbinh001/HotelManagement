<!--Login popup start-->
<!--<button onclick="openPopupLogin()">Test Login Btn</button>-->
<div id="loginPopup" class="popup">
    <div class="popup-content">
        <span class="close-btn">&times;</span>
        <h2 class="text-center mb-4">Login</h2>
        <form action="main" method="post">
            <input type="hidden" name="src" value="${pageContext.request.servletPath.substring(1)}">
            <input type="hidden" name="action" value="login">
            <div class="mb-3">
                <label for="usernameOrEmail" class="form-label">Email or Username </label>
                <input type="text" class="form-control" id="usernameOrEmail" name="usernameOrEmail" value="${requestScope.usernameOrEmail}" required>
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Password</label>
                <input type="password" class="form-control" id="password" name="password" required>
            </div>
            <c:if test="${requestScope.loginError != null}">
                <div class="text-danger mb-3">
                    ${requestScope.loginError}
                </div>
            </c:if>
            <button type="submit" class="btn btn-primary submit-btn w-100">Login</button>
            <div class="text-center mt-3">
                <a class="forgot d-block mb-2" href="#">Forgot password?</a>
                <a class="signup d-block" href="register?src=${pageContext.request.servletPath.substring(1)}">Create new account</a>
            </div>
        </form>
    </div>
</div>

<!--<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>-->
<script>
    document.addEventListener("DOMContentLoaded", function () {
        var popup = document.getElementById("loginPopup");
        var closeBtn = document.getElementsByClassName("close-btn")[0];

        window.openPopupLogin = function () {
            popup.style.display = "block";
        };
        closeBtn.onclick = function () {
            popup.style.display = "none";
        };
        window.onclick = function (event) {
            if (event.target == popup) {
                popup.style.display = "none";
            }
        };
    });
</script>
<!--<script>
    window.onload = function () {
    <c:if test="{not empty param.login or not empty login}"> //$
                openPopupLogin();
    </c:if>
    };
</script>-->
<!--Login popup end-->