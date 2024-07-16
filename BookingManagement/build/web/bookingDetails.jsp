<%-- 
    Document   : bookingDetails
    Created on : 16/07/2024, 12:57:43 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Booking Details</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&family=Montserrat:wght@400;500;600;700&display=swap" rel="stylesheet">

        <!-- Icon Font Stylesheet -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.5.0/font/bootstrap-icons.min.css" rel="stylesheet">

        <!-- CSS files -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="css/styles.css" rel="stylesheet">
    </head>

    <body>
        <div class="container-xxl bg-white p-0">
            <!-- Include your header here -->
            <jsp:include page="header.jsp" />

            <!-- Booking Details Start -->
            <div class="container-xxl py-5 mb-5">
                <div class="container">
                    <div class="text-center wow fadeInUp" data-wow-delay="0.1s">
                        <h6 class="section-title text-center text-primary text-uppercase">Booking Details</h6>
                        <h1 class="mb-5">Book a <span class="text-primary text-uppercase">Luxury Experience</span></h1>
                    </div>
                    <c:set var="room" value="${requestScope.room}">                    
                    </c:set>
                    <c:set var="user" value="${requestScope.userLogin}">                    
                    </c:set>
                    <div class="row g-5">
                        <div class="col-lg-6">
                            <div class="wow fadeInUp" data-wow-delay="0.2s">
                                <h2>Room Details</h2>
                                <img src="${empty room.imageUrl ? room.imageUrl : 'img/room-default.jpg'}" alt="Room Image" class="img-fluid rounded mb-4">
                                <h4>Room ${room.roomNumber}</h4>
                                <p><strong>Type:</strong> ${room.type}</p>
                                <p><strong>Price per Day:</strong> $${room.pricePerDay}</p>
                                <p><strong>Beds:</strong> ${room.doubleBeds} Double, ${room.singleBeds} Single</p>
                                <p><strong>Amenities:</strong> ${room.amenitiesDescription}</p>
                            </div>
                        </div>
                        <div class="col-lg-6 py-5">
                            <div class="wow fadeInUp" data-wow-delay="0.2s">
                                <form action="main" method="post">
                                    <input type="hidden" name="action" value="booking">
                                    <input type="hidden" name="roomId" value="${room.roomId}">
                                    <input type="hidden" name="roomNumber" value="${room.roomNumber}">
                                    <div class="row g-3">
                                        <div class="col-md-6">
                                            <div class="form-floating">
                                                <input type="text" value="${user.fullName}" class="form-control" id="name" name="name" placeholder="Your Name" required readonly>
                                                <label for="name">Your Name</label>
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-floating">
                                                <input type="email" value="${user.email}" class="form-control" id="email" name="email" placeholder="Your Email" required readonly> 
                                                <label for="email">Your Email</label>
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-floating date" id="date3" data-target-input="nearest">
                                                <input type="date" class="form-control datetimepicker-input" id="checkin" name="checkinDate" placeholder="Check In" data-target="#date3" data-toggle="datetimepicker" required onchange="updateCheckoutMinDate()" />
                                                <label for="checkin">Check In</label>
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-floating date" id="date4" data-target-input="nearest">
                                                <input type="date" class="form-control datetimepicker-input" id="checkout" name="checkoutDate" placeholder="Check Out" data-target="#date4" data-toggle="datetimepicker" required />
                                                <label for="checkout">Check Out</label>
                                            </div>
                                        </div>
                                        <div class="col-12">
                                            <div class="form-floating">
                                                <textarea class="form-control" placeholder="Special Request" id="message" name="message" style="height: 100px"></textarea>
                                                <label for="message">Special Request</label>
                                            </div>
                                        </div>
                                        <div class="col-12">
                                            <button class="btn btn-primary w-100 py-3" type="submit">Book Now</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>                    
                    </div>
                </div>
            </div>
            <!-- Booking Details End -->

            <!-- Include your footer here -->
            <jsp:include page="footer.jsp" />
        </div>

        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/wow/1.1.2/wow.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/tempusdominus-bootstrap-4/5.39.0/js/tempusdominus-bootstrap-4.min.js">

        </script>

        <!-- Template Javascript -->

        <script>
            // Initialize WOW.js
            new WOW().init();

            // Initialize date pickers
            $(function () {
                $('#date3, #date4').datetimepicker({
                    format: 'L'
                });
            });

            // Function to update the minimum date for checkout
            function updateCheckoutMinDate() {
                var checkinDate = document.getElementById('checkin').value;
                var checkoutInput = document.getElementById('checkout');

                if (checkinDate) {
                    // Set the minimum date for checkout to be the day after check-in
                    var minCheckoutDate = new Date(checkinDate);
                    minCheckoutDate.setDate(minCheckoutDate.getDate() + 1);
                    checkoutInput.min = minCheckoutDate.toISOString().split('T')[0];

                    // If the current checkout date is before the new minimum, reset it
                    if (checkoutInput.value && new Date(checkoutInput.value) <= new Date(checkinDate)) {
                        checkoutInput.value = minCheckoutDate.toISOString().split('T')[0];
                    }
                }
            }

            // Add event listener to check-in date input
            document.getElementById('checkin').addEventListener('change', updateCheckoutMinDate);

            // Add form submission validation
            document.querySelector('form').addEventListener('submit', function (event) {
                var checkinDate = new Date(document.getElementById('checkin').value);
                var checkoutDate = new Date(document.getElementById('checkout').value);

                if (checkoutDate <= checkinDate) {
                    event.preventDefault();
                    alert('Check-out date must be after check-in date');
                }
            });
        </script>
    </body>
</html>
