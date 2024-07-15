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

        <!-- Include your CSS files here -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
    </head>

    <body>
        <div class="container-xxl bg-white p-0">
            <!-- Include your header here -->
            <jsp:include page="header.jsp" />

            <!-- Booking Summary Start -->
            <div class="container-xxl py-5">
                <div class="container">
                    <div class="text-center wow fadeInUp" data-wow-delay="0.1s">
                        <h6 class="section-title text-center text-primary text-uppercase">Your Bookings</h6>
                        <h1 class="mb-5">Booking <span class="text-primary text-uppercase">Summary</span></h1>
                    </div>

                    <div class="row g-4">
                        <c:forEach var="booking" items="${bookings}">
                            <div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.1s">
                                <div class="room-item shadow rounded overflow-hidden">
                                    <div class="position-relative">
                                        <img class="img-fluid" src="${booking.room.imageUrl}" alt="Room Image">
                                        <small class="position-absolute start-0 top-100 translate-middle-y bg-primary text-white rounded py-1 px-3 ms-4">
                                            <span>$</span>${booking.room.pricePerDay}/Night
                                        </small>
                                    </div>
                                    <div class="p-4 mt-2">
                                        <div class="d-flex justify-content-between mb-3">
                                            <h5 class="mb-0">Room ${booking.room.roomNumber}</h5>
                                            <div class="ps-2">
                                                <p class="mb-0 text-${booking.room.type == 'Luxury' ? 'primary' : 'secondary'}">${booking.room.type}</p>
                                            </div>
                                        </div>
                                        <div class="d-flex mb-3">
                                            <small class="border-end me-3 pe-3"><i class="fa fa-calendar text-primary me-2"></i>Check-in: <fmt:formatDate value="${booking.checkInDate}" pattern="dd/MM/yyyy"/></small>
                                            <small><i class="fa fa-calendar text-primary me-2"></i>Check-out: <fmt:formatDate value="${booking.checkOutDate}" pattern="dd/MM/yyyy"/></small>
                                        </div>
                                        <div class="d-flex justify-content-between">
                                            <h6 class="mb-0">Total: $${booking.totalPrice}</h6>
                                            <p class="mb-0 text-${booking.isPaid ? 'success' : 'warning'}">
                                                ${booking.isPaid ? 'Paid' : 'Pending Payment'}
                                            </p>
                                        </div>
                                        <div class="d-flex justify-content-between mt-3">
                                            <a href="bookingDetails?id=${booking.id}" class="btn btn-sm btn-primary rounded py-2 px-4">View Details</a>
                                            <c:if test="${!booking.isPaid}">
                                                <a href="checkout?id=${booking.id}" class="btn btn-sm btn-dark rounded py-2 px-4">Proceed to Payment</a>
                                            </c:if>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>

                    <c:if test="${empty bookings}">
                        <div class="text-center mt-5">
                            <h3>You have no bookings yet.</h3>
                            <a href="rooms" class="btn btn-primary mt-3">Explore Rooms</a>
                        </div>
                    </c:if>
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
        <script src="js/main.js"></script>
    </body>
</html>
