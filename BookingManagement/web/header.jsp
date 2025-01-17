<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Header Start -->
<div class="container-fluid bg-dark px-0">
    <div class="row gx-0">
        <div class="col-lg-3 bg-dark d-none d-lg-block">
            <a href="home" class="navbar-brand w-100 h-100 m-0 p-0 d-flex align-items-center justify-content-center">
                <h1 class="m-0 text-primary text-uppercase">Xom Nha La</h1>
            </a>
        </div>
        <div class="col-lg-9">
            <div class="row gx-0 bg-white d-none d-lg-flex">
                <div class="col-lg-7 px-5 text-start">
                    <div class="h-100 d-inline-flex align-items-center py-2 me-4">
                        <i class="fa fa-envelope text-primary me-2"></i>
                        <p class="mb-0">info@xomnhala.com</p>
                    </div>
                    <div class="h-100 d-inline-flex align-items-center py-2">
                        <i class="fa fa-phone-alt text-primary me-2"></i>
                        <p class="mb-0">+012 345 6789</p>
                    </div>
                </div>
                <div class="col-lg-5 text-end">
                    <c:if test="${sessionScope.userFullNameLogin == null}">
                        <div class="d-inline-flex align-items-center py-2">
                            <a href="#" class="me-3 text-decoration-none text-primary" onclick="openPopupLogin()">Login</a>
                            <span class="me-3 text-primary">|</span>
                            <a href="register" class="me-3 text-decoration-none text-primary">Register</a>
                        </div>
                    </c:if>
                    <c:if test="${sessionScope.userFullNameLogin != null}">
                        <div class="dropdown d-inline-block d-inline-flex align-items-center py-2">
                            <a class="text-white text-decoration-none text-primary" href="#" role="button" id="userDropdown" data-bs-toggle="dropdown" aria-expanded="false">
                                <i class="fas fa-user"></i>
                                <span class="me-3 text-primary">${sessionScope.userFullNameLogin}</span>
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="userDropdown">
                                <li><a class="dropdown-item" href="profile">Your profile</a></li>
                                    <c:if test="${sessionScope.role == 'admin'}">
                                    <li><a class="dropdown-item" href="admin">Admin Center</a>
                                    </c:if>
                                <li><a class="dropdown-item" href="logout">Logout</a>
                                </li>
                            </ul>
                        </div>     
                    </c:if>
                </div>
            </div>
            <nav class="navbar navbar-expand-lg bg-dark navbar-dark p-3 p-lg-0">
                <a href="home.jsp" class="navbar-brand d-block d-lg-none">
                    <h1 class="m-0 text-primary text-uppercase">Xom Nha La</h1>
                </a>
                <button type="button" class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
                    <div class="navbar-nav mr-auto py-0">
                        <a href="home#" class="nav-item nav-link">Home</a>
                        <a href="home#about-page" class="nav-item nav-link">About</a>
                        <a href="home#room-page" class="nav-item nav-link">Rooms</a>
                        <a href="viewBooking" class="nav-item nav-link">Bookings</a>
                        <a href="#footer-page" class="nav-item nav-link">Contact</a>
                    </div>
                </div>
            </nav>
        </div>
    </div>
</div>
<!-- Header End -->
