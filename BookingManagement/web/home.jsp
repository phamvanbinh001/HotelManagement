<%-- 
    Document   : home
    Created on : Jul 10, 2024, 2:54:54 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Hotelier - Hotel HTML Template</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="" name="keywords">
        <meta content="" name="description">

        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&family=Montserrat:wght@400;500;600;700&display=swap" rel="stylesheet">

        <!-- Icon Font Stylesheet -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.5.0/font/bootstrap-icons.min.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" rel="stylesheet">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css" rel="stylesheet">

        <!-- Customized Bootstrap Stylesheet -->
        <!--<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.2/css/bootstrap.min.css" rel="stylesheet">-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

        <!-- Template Stylesheet -->
        <link href="css/styles.css" rel="stylesheet">
        <style>
            .fw-medium {
                font-weight: 500 !important;
            }
            .fw-semi-bold {
                font-weight: 600 !important;
            }
            .back-to-top {
                position: fixed;
                display: none;
                right: 45px;
                bottom: 45px;
                z-index: 99;
                align-content: center;
            }
            /*** Spinner ***/
            #spinner {
                opacity: 0;
                visibility: hidden;
                transition: opacity .5s ease-out, visibility 0s linear .5s;
                z-index: 99999;
            }
            #spinner.show {
                transition: opacity .5s ease-out, visibility 0s linear 0s;
                visibility: visible;
                opacity: 1;
            }
            /*** Header ***/
            .carousel-caption {
                top: 0;
                left: 0;
                right: 0;
                bottom: 0;
                background: rgba(15, 23, 43, .7);
                z-index: 1;
            }
            .carousel-control-prev,
            .carousel-control-next {
                width: 10%;
            }
            .carousel-control-prev-icon,
            .carousel-control-next-icon {
                width: 3rem;
                height: 3rem;
            }
            @media (max-width: 768px) {
                #header-carousel .carousel-item {
                    position: relative;
                    min-height: 450px;
                }
                #header-carousel .carousel-item img {
                    position: absolute;
                    width: 100%;
                    height: 100%;
                    object-fit: cover;
                }
            }
            .booking {
                position: relative;
                margin-top: -100px !important;
                z-index: 1;
            }
            /*** Section Title ***/
            .section-title {
                position: relative;
                display: inline-block;
            }
            .section-title::before {
                position: absolute;
                content: "";
                width: 45px;
                height: 2px;
                top: 50%;
                left: -55px;
                margin-top: -1px;
                background: var(--primary);
            }
            .section-title::after {
                position: absolute;
                content: "";
                width: 45px;
                height: 2px;
                top: 50%;
                right: -55px;
                margin-top: -1px;
                background: var(--primary);
            }
            .section-title.text-start::before,
            .section-title.text-end::after {
                display: none;
            }
            .newsletter {
                position: relative;
                z-index: 1;
            }
            .text-luxury {
                color: #34c481 !important
            }
            .bg-luxury {
                background-color: #34c481 !important;
            }
            .footer {
                margin-top: -110px;
                padding-top: 150px;
            }
        </style>
    </head>
    <body>
        <div class="container-xxl bg-white p-0">
            <!-- Spinner Start -->
            <div id="spinner" class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
                <div class="spinner-border text-primary" style="width: 3rem; height: 3rem;" role="status">
                    <span class="sr-only">Loading...</span>
                </div>
            </div>
            <!-- Spinner End -->
            <jsp:include page="header.jsp" />
            <!-- Carousel Start -->
            <div class="container-fluid p-0 mb-5">
                <div id="header-carousel" class="carousel slide" data-bs-ride="carousel">
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img class="w-100" src="img/carousel-1.jpg" alt="Image">
                            <div class="carousel-caption d-flex flex-column align-items-center justify-content-center">
                                <div class="p-3" style="max-width: 700px;">
                                    <h6 class="section-title text-white text-uppercase mb-3 animated slideInDown">Luxury Living</h6>
                                    <h1 class="display-3 text-white mb-4 animated slideInDown">Discover A Brand Luxurious Hotel</h1>
                                    <a href="#room-page" class="btn btn-primary py-md-3 px-md-5 me-3 animated slideInLeft">Our Rooms</a>
                                    <a href="#room-page" class="btn btn-light py-md-3 px-md-5 animated slideInRight">Book A Room</a>
                                </div>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img class="w-100" src="img/carousel-2.jpg" alt="Image">
                            <div class="carousel-caption d-flex flex-column align-items-center justify-content-center">
                                <div class="p-3" style="max-width: 700px;">
                                    <h6 class="section-title text-white text-uppercase mb-3 animated slideInDown">Luxury Living</h6>
                                    <h1 class="display-3 text-white mb-4 animated slideInDown">Discover A Brand Luxurious Hotel</h1>
                                    <a href="" class="btn btn-primary py-md-3 px-md-5 me-3 animated slideInLeft">Our Rooms</a>
                                    <a href="" class="btn btn-light py-md-3 px-md-5 animated slideInRight">Book A Room</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <button class="carousel-control-prev" type="button" data-bs-target="#header-carousel"
                            data-bs-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Previous</span>
                    </button>
                    <button class="carousel-control-next" type="button" data-bs-target="#header-carousel"
                            data-bs-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Next</span>
                    </button>
                </div>
            </div>
            <!-- Carousel End -->
            <!-- Booking Start -->
            <div class="container-fluid booking pb-5 wow fadeIn" data-wow-delay="0.1s">
                <div class="container">
                    <div class="bg-white shadow" style="padding: 35px;">
                        <form class="row g-2" action="main" method="post">
                            <div class="col-md-10">
                                <div class="row g-2">
                                    <div class="col-md-4">
                                        <div>
                                            <input type="number" name="singleBeds" class="form-control" placeholder="Single beds"/>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div data-target-input="nearest">
                                            <input type="number" name="doubleBeds" class="form-control" placeholder="Double beds"/>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <select name="type" class="form-select">
                                            <option value="Standard" selected>Standard</option>
                                            <option value="Luxury">Luxury</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-2">
                                <button type="submit" class="btn btn-primary w-100" name="action" value="home">Submit</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <!-- Booking End -->


            <!-- About Start -->
            <div class="container-xxl py-5 about-page" id="about-page">
                <div class="container">
                    <div class="row g-5 align-items-center">
                        <div class="col-lg-6">
                            <h6 class="section-title text-start text-primary text-uppercase">About Us</h6>
                            <h1 class="mb-4">Welcome to <span class="text-primary text-uppercase">Xom Nha La</span></h1>
                            <p class="mb-4">Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit. Aliqu diam amet diam et eos. Clita erat ipsum et lorem et sit, sed stet lorem sit clita duo justo magna dolore erat amet</p>
                            <div class="row g-3 pb-4">
                                <div class="col-sm-4 wow fadeIn" data-wow-delay="0.1s">
                                    <div class="border p-1">
                                        <div class="border rounded text-center p-4">
                                            <i class="fa fa-hotel fa-2x text-primary mb-2"></i>
                                            <h2 class="mb-1">${requestScope.roomList == null ? 0 : requestScope.roomList.size()} rooms</h2>
                                            <p class="mb-0">Large space</p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-4 wow fadeIn" data-wow-delay="0.3s">
                                    <div class="border p-1">
                                        <div class="border rounded text-center p-4">
                                            <i class="fas fa-star fa-2x text-primary mb-2"></i>
                                            <h2 class="mb-1"">4 stars</h2>
                                            <p class="mb-0">High Quality</p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-4 wow fadeIn" data-wow-delay="0.5s">
                                    <div class="border p-1">
                                        <div class="border rounded text-center p-4">
                                            <i class="fas fa-wifi fa-2x text-primary mb-2"></i>
                                            <h2 class="mb-1">Internet</h2>
                                            <p class="mb-0">24/24</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <a class="btn btn-primary py-3 px-5 mt-2" href="#footer-page">Explore More</a>
                        </div>
                        <div class="col-lg-6">
                            <div class="row g-3">
                                <div class="col-6 text-end">
                                    <img class="img-fluid rounded w-75 wow zoomIn" data-wow-delay="0.1s" src="img/about-1.jpg" style="margin-top: 25%;">
                                </div>
                                <div class="col-6 text-start">
                                    <img class="img-fluid rounded w-100 wow zoomIn" data-wow-delay="0.3s" src="img/about-2.jpg">
                                </div>
                                <div class="col-6 text-end">
                                    <img class="img-fluid rounded w-50 wow zoomIn" data-wow-delay="0.5s" src="img/about-3.jpg">
                                </div>
                                <div class="col-6 text-start">
                                    <img class="img-fluid rounded w-75 wow zoomIn" data-wow-delay="0.7s" src="img/about-4.jpg">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- About End -->


            <!-- Room Start -->
            <div class="container-xxl py-5 room-page" id="room-page">
                <div class="container">
                    <div class="text-center wow fadeInUp" data-wow-delay="0.1s">
                        <h6 class="section-title text-center text-primary text-uppercase">Our Rooms</h6>
                        <h1 class="mb-5">Explore Our <span class="text-primary text-uppercase">Rooms</span></h1>
                    </div>
                    <div class="row g-4">
                        <c:forEach var="p" items="${requestScope.roomList}">
                            <div id="room${p.roomId}" class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.1s">
                                <div class="room-item shadow rounded overflow-hidden">
                                    <div class="position-relative">
                                        <img class="img-fluid" src="${p.imageUrl}" alt="Our room">
                                        <c:if test="${p.type == 'Luxury'}">
                                            <small class="position-absolute start-0 top-100 translate-middle-y text-white rounded bg-luxury py-1 px-3 ms-4">
                                                <span>$</span>${p.pricePerDay}/Day
                                            </small>
                                        </c:if>
                                        <c:if test="${p.type == 'Standard'}">
                                            <small class="position-absolute start-0 top-100 translate-middle-y bg-secondary text-white rounded py-1 px-3 ms-4"><span>$</span>${p.pricePerDay}/Day</small>
                                        </c:if>                                        
                                    </div>
                                    <div class="p-4 mt-2">
                                        <div class="d-flex justify-content-between mb-3">
                                            <h5 class="mb-0">Room: ${p.roomNumber}</h5>
                                            <div class="ps-2">
                                                <c:if test="${p.type == 'Luxury'}">
                                                    <p class="fw-bold text-luxury">${p.type} Room</p>
                                                </c:if>
                                                <c:if test="${p.type == 'Standard'}">
                                                    <p class="fw-bold text-secondary">${p.type} Room</p>
                                                </c:if>
                                            </div>
                                        </div>
                                        <div class="d-flex mb-3">
                                            <small class="border-end me-3 pe-3"><i class="fa fa-bed text-primary me-2"></i>${p.singleBeds} Single Bed</small>
                                            <small class="border-end me-3 pe-3"><i class="fa fa-bed text-primary me-2"></i>${p.doubleBeds} Double Bed</small>
                                            <small><i class="fa fa-wifi text-primary me-2"></i>Wifi</small>
                                        </div>
                                        <p class="text-body mb-3">${p.amenitiesDescription}</p>
                                        <div class="d-flex justify-content-end">
                                            <form action="main" method="get">
                                                <input type="hidden" name="roomId" value="${p.roomId}">
                                                <input type="hidden" name="action" value="booking">
                                                <button class="btn btn-sm btn-dark rounded py-2 px-4" type="submit">Book Now</button>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
            <!-- Room End -->

            <!-- Newsletter Start -->
            <div class="container newsletter mt-5 wow fadeIn" data-wow-delay="0.1s">
                <div class="row justify-content-center">
                    <div class="col-lg-10 border rounded p-1">
                        <div class="border rounded text-center p-1">
                            <div class="bg-white rounded text-center p-5">
                                <h4 class="mb-4">Subscribe Our <span class="text-primary text-uppercase">Newsletter</span></h4>
                                <div class="position-relative mx-auto" style="max-width: 400px;">
                                    <input class="form-control w-100 py-3 ps-4 pe-5" type="text" placeholder="Enter your email">
                                    <button type="button" class="btn btn-primary py-2 px-3 position-absolute top-0 end-0 mt-2 me-2" onclick="showErrorModal('Feature not supported yet!')">
                                        Submit
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Newsletter Start -->
            <jsp:include page="footer.jsp"/>
            <jsp:include page="login.jsp"/>
            <!-- Back to Top -->
            <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top" style="display: none"><i class="bi bi-arrow-up"></i></a>
        </div>

        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/wow/1.1.2/wow.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/waypoints/4.0.1/jquery.waypoints.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.29.1/moment.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/moment-timezone/0.5.34/moment-timezone-with-data.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/tempusdominus-bootstrap-4/5.39.0/js/tempusdominus-bootstrap-4.min.js"></script>


        <!-- Template Javascript -->
        <script src="js/main.js">
        </script>
        <script>
            window.onload = function () {
            <c:if test="${not empty param.login or not empty login}">
                openPopupLogin();
            </c:if>
            };
        </script>        
        <script>
        document.addEventListener("DOMContentLoaded", function() {
            var scrollTo = "${scrollTo}";
            if (scrollTo) {
                var element = document.getElementById(scrollTo);
                if (element) {
                    element.scrollIntoView();
                }
            }
        });
    </script>
        <jsp:include page="modal.jsp"/>
    </body>
</html>
