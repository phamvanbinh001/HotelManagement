<%-- 
    Document   : booking
    Created on : 12/07/2024, 9:50:57 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Booking Summary</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&family=Montserrat:wght@400;500;600;700&display=swap" rel="stylesheet">

        <!-- Icon Font Stylesheet -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.5.0/font/bootstrap-icons.min.css" rel="stylesheet">

        <!--CSS files-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="css/styles.css" rel="stylesheet">
        <style>
            .back-to-top {
                position: fixed;
                display: none;
                right: 45px;
                bottom: 45px;
                z-index: 99;
                align-content: center;
            }
        </style>
    </head>
    <body>
        <div class="container-xxl bg-white p-0">
            <!-- Include your header here -->
            <jsp:include page="header.jsp" />

            <!-- Booking Summary Start -->
            <div class="container-xxl py-2">
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-12">
                            <c:if test="${not empty bookingList}">
                                <h2 class="mb-4">Your Bookings</h2>
                            </c:if>                            
                            <c:forEach var="booking" items="${requestScope.bookingList}">
                                <div class="card mb-3 wow fadeInUp" data-wow-delay="0.1s">
                                    <div class="card-body">
                                        <div class="row align-items-center">
                                            <div class="col-md-2">
                                                <a href="home#room${booking.roomId}" class="text-decoration-none text-dark">
                                                    <h5 class="card-title text-center">Room ${booking.roomNumber}</h5>
                                                </a>
                                                <a href="home#room${booking.roomId}">
                                                    <img src="${booking.imageUrl}" alt="Room Image" class="img-fluid rounded">
                                                </a>                                            
                                            </div>
                                            <div class="col-md-4">                                                                                              
                                                <p class="card-text">
                                                    <small class="text-muted">
                                                        <i class="fa fa-calendar text-primary me-2"></i>
                                                        Check-in: 
                                                        <input type="date" class="form-control" value="${booking.checkinDate}"/>
                                                    </small>
                                                </p>
                                                <p class="card-text">
                                                    <small class="text-muted">
                                                        <i class="fa fa-calendar text-primary me-2"></i>
                                                        Check-out: 
                                                        <input type="date" class="form-control" value="${booking.checkoutDate}"/>
                                                    </small>
                                                </p>
                                                <p class="card-text">
                                                    <small class="text-muted">
                                                        <i class="fa fa-calendar text-primary me-2"></i>
                                                        Booking date: <fmt:formatDate value="${booking.bookingDate}" pattern="dd/MM/yyyy"/>
                                                    </small>
                                                </p>
                                            </div>
                                            <div class="col-md-2 px-5">
                                                <h6 class="mb-0">Total</h6>
                                                <p class="card-text">
                                                    <small class="text-muted">
                                                        $${booking.totalPrice}
                                                    </small>
                                                </p>
                                            </div>
                                            <div class="col-md-1">                                                
                                                <c:if test="${booking.checkoutDate.before(currentDate) && booking.status == 'completed'}">
                                                    <span class="badge bg-secondary p-2">
                                                        checked out
                                                    </span>
                                                </c:if>
                                                <c:if test="${booking.checkoutDate.before(currentDate) && booking.status == 'pending'}">
                                                    <span class="badge bg-secondary p-2">
                                                        time out
                                                    </span>
                                                </c:if>
                                                <c:if test="${booking.checkoutDate.before(currentDate) && booking.status == 'canceled'}">
                                                    <span class="badge bg-danger p-2">
                                                        canceled
                                                    </span>
                                                </c:if>
                                                <c:if test="${!booking.checkoutDate.before(currentDate)}">
                                                    <span class="badge bg-${booking.status == 'completed' ? 'success' : booking.status == 'pending' ? 'warning' : 'danger'} p-2">
                                                        ${booking.status}
                                                    </span>
                                                </c:if>                                                
                                            </div>
                                            <form action="main" method="get" class="col-md-3 text-end">
                                                <input type="hidden" name="bookingId" value="${booking.bookingId}">
                                                <c:if test="${booking.checkinDate.before(currentDate)}">
                                                    <a href="bookingDetails?id=${booking.bookingId}" class="btn btn-sm btn-primary rounded py-2 px-5">View Details</a>  
                                                </c:if>
                                                <c:if test="${!booking.checkinDate.before(currentDate)}">
                                                    <c:if test="${booking.status != 'canceled'}">
                                                        <a href="bookingDetails?id=${booking.bookingId}" class="btn btn-sm btn-primary rounded py-2 px-2">View Details</a>
                                                        <button type="submit" class="btn btn-sm btn-danger rounded py-2 px-2" name="action" value="cancelBooking">Cancel</button>
                                                    </c:if>
                                                    <c:if test="${booking.status == 'canceled'}">
                                                        <a href="bookingDetails?id=${booking.bookingId}" class="btn btn-sm btn-primary rounded py-2 px-5">View Details</a>                                                    
                                                    </c:if>
                                                    <c:if test="${booking.status == 'pending'}">
                                                        <button type="submit" class="btn btn-sm btn-dark rounded py-2 px-3 mt-2" name="action" value="payment">Proceed to Payment</button>
                                                    </c:if>
                                                </c:if>    
                                            </form>                                            
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                            <c:if test="${empty bookingList}">
                                <div class="text-center mt-5">
                                    <h3>You have no bookings yet.</h3>
                                    <a href="main" class="btn btn-primary mt-3">Explore Rooms</a>
                                </div>
                            </c:if>
                        </div>
                    </div>
                </div>
                <div style="margin-bottom: 160px;">

                </div>
            </div>
            <!-- Booking Summary End -->

            <!-- Include your footer here -->
            <jsp:include page="footer.jsp" />

            <!-- Back to Top -->
            <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="bi bi-arrow-up"></i></a>
        </div>

        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>

        <!-- Template Javascript -->
        <script>
            // Back to top button
            const backToTop = document.querySelector('.back-to-top');

            window.addEventListener('scroll', function () {
                if (window.pageYOffset > 300) {
                    backToTop.style.display = 'block';
                } else {
                    backToTop.style.display = 'none';
                }
            });
        </script>
        <jsp:include page="modal.jsp" />
        <c:if test="${param.rs == 'true'}">
            <script>
                showSuccessModal("Canceled!");
            </script>
        </c:if>
        <c:if test="${param.rs == 'false'}">
            <script>
                showErrorModal("An error has occurred!");
            </script>
        </c:if>
        <c:if test="${param.pay == 'true'}">
            <script>
                showSuccessModal("Payment successful!");
            </script>
        </c:if>
        <c:if test="${param.pay == 'false'}">
            <script>
                showErrorModal("An error has occurred!");
            </script>
        </c:if>
    </body>
</html>
