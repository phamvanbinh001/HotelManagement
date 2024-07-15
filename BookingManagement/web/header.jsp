<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Header Start -->
<div class="container-fluid bg-dark px-0">
    <div class="row gx-0">
        <div class="col-lg-3 bg-dark d-none d-lg-block">
            <a href="home.jsp" class="navbar-brand w-100 h-100 m-0 p-0 d-flex align-items-center justify-content-center">
                <h1 class="m-0 text-primary text-uppercase">Thieuhoang</h1>
            </a>
        </div>
        <div class="col-lg-9">
            <div class="row gx-0 bg-white d-none d-lg-flex">
                <div class="col-lg-7 px-5 text-start">
                    <div class="h-100 d-inline-flex align-items-center py-2 me-4">
                        <i class="fa fa-envelope text-primary me-2"></i>
                        <p class="mb-0">info@example.com</p>
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
                            <a href="register.jsp" class="me-3 text-decoration-none text-primary">Register</a>
                        </div>
                    </c:if>
                    <c:if test="${sessionScope.userFullNameLogin != null}">
                        <div class="d-inline-flex align-items-center py-2">
                            <a href="profile" class="text-decoration-none text-primary">
                                <i class="fas fa-user"></i>
                                <span class="me-3 text-primary">${sessionScope.userFullNameLogin}</span>
                            </a>
                        </div>
                    </c:if>
                </div>
            </div>
            <nav class="navbar navbar-expand-lg bg-dark navbar-dark p-3 p-lg-0">
                <a href="home.jsp" class="navbar-brand d-block d-lg-none">
                    <h1 class="m-0 text-primary text-uppercase">Thieuhoang</h1>
                </a>
                <button type="button" class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
                    <div class="navbar-nav mr-auto py-0">
                        <a href="#" class="nav-item nav-link active">Home</a>
                        <a href="#about-page" class="nav-item nav-link">About</a>
                        <a href="#room-page" class="nav-item nav-link">Rooms</a>
                        <div class="nav-item dropdown">
                            <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Pages</a>
                            <div class="dropdown-menu rounded-0 m-0">
                                <a href="booking.jsp" class="dropdown-item">Booking</a>
                                <a href="team.jsp" class="dropdown-item">Our Team</a>
                                <a href="testimonial.jsp" class="dropdown-item">Testimonial</a>
                            </div>
                        </div>
                        <a href="#footer-page" class="nav-item nav-link">Contact</a>
                    </div>
                </div>
            </nav>
        </div>
    </div>
</div>
<!-- Header End -->
