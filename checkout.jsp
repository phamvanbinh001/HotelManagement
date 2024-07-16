<%-- 
    Document   : checkout
    Created on : Jul 15, 2024, 10:34:48 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Hotel Booking - Checkout</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="" name="keywords">
        <meta content="" name="description">

        <!-- Favicon -->
        <link href="img/favicon.ico" rel="icon">

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
        <link href="https://cdnjs.cloudflare.com/ajax/libs/tempusdominus-bootstrap-4/5.39.0/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css">

        <!-- Customized Bootstrap Stylesheet -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

        <!-- Template Stylesheet -->
        <link href="css/style.css" rel="stylesheet">
        <style>
            .highlight-box {
                border: 2px solid #367a39; /* Đường viền màu xanh */
                padding: 20px; /* Khoảng cách bên trong */
                background: linear-gradient(135deg, #e9f7ff 0%, #d0e7ff 100%); /* Nền gradient xanh nhạt */
                border-radius: 15px; /* Bo góc */
                box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2); /* Bóng đổ sâu hơn */
                overflow: hidden; /* Đảm bảo nội dung không tràn ra ngoài */
                transition: transform 0.3s ease; /* Hiệu ứng chuyển đổi khi hover */
            }

            .highlight-box:hover {
                transform: scale(1.05); /* Phóng to nhẹ khi hover */
            }

            .header-section {
                background-color: #367a39; /* Nền xanh đậm cho tiêu đề */
                color: white; /* Chữ trắng */
                padding: 10px; /* Khoảng cách bên trong */
                border-radius: 10px 10px 0 0; /* Bo góc trên */
                text-transform: uppercase; /* Chữ in hoa */
                font-weight: bold; /* Chữ đậm */
            }

            .content-section {
                padding: 20px; /* Khoảng cách bên trong */
                background-color: white; /* Nền trắng cho nội dung */
                border-radius: 0 0 10px 10px; /* Bo góc dưới */
            }

            .content-section p {
                margin: 10px 0; /* Khoảng cách giữa các đoạn văn */
                font-size: 1.1em; /* Tăng kích thước chữ */
            }

            .content-section span {
                font-weight: bold; /* Chữ đậm cho giá */
                color: #367a39; /* Màu xanh cho giá */
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
            <%--<jsp:include page="header.jsp" />--%>
            <!-- Checkout Start -->
            <div class="container-xxl py-5">
                <div class="container">
                    <div class="text-center wow fadeInUp" data-wow-delay="0.1s">
                        <h6 class="section-title text-center text-primary text-uppercase">Checkout</h6>
                        <h1 class="mb-5">Complete Your <span class="text-primary text-uppercase">Booking</span></h1>
                    </div>
                    <div class="row g-5">
                        <div class="col-lg-8">
                            <h2 class="mb-4">Booking Details</h2>
                            <form id="checkoutForm" action="checkout" method="post">
                                <div class="row g-3">
                                    <div class="col-md-12">
                                        <div class="form-floating">
                                            <input type="text" class="form-control" id="name" placeholder="John" name="name" value="${sessionScope.userLogin.userFullNameLogin}">
                                            <label for="name">How can we call you?</label>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-floating">
                                            <input type="email" class="form-control" id="email" placeholder="name@example.com" name="email" value="${sessionScope.userLogin.userEmailLogin}" required>
                                            <label for="email">Email Address</label>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-floating">
                                            <input type="tel" class="form-control" id="phone" placeholder="123-456-7890" name="phone" required>
                                            <label for="phone">Phone Number</label>
                                        </div>
                                    </div>
                                    <div class="col-12">
                                        <div class="form-floating">
                                            <input type="text" class="form-control" id="address" placeholder="123 Street" name="address">
                                            <label for="address">Address</label>
                                        </div>
                                    </div>
                                    <div class="col-12">
                                        <div class="form-floating">
                                            <textarea class="form-control" placeholder="Special Requests" id="specialRequests" name="specialRequests" style="height: 100px"></textarea>
                                            <label for="specialRequests">Special Requests</label>
                                        </div>
                                    </div>

                                    <!-- Payment and Shipping Start -->
                                    <h4 class="mt-4">Payment and Shipping</h4>
                                    <div class="col-md-6">
                                        <div class="mb-3">
                                            <label for="paymentMethod" class="form-label">Payment Method</label>
                                            <select name="paymentMethod" class="form-select" id="paymentMethod" required>
                                                <option value="" disabled selected>Select payment method</option>
                                                <option value="creditCard">Credit Card</option>
                                                <option value="paypal">PayPal</option>
                                                <option value="bankTransfer">Bank Transfer</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="mb-3">
                                            <label for="shippingMethod" class="form-label">Shipping Method</label>
                                            <select name="shippingMethod" class="form-select" id="shippingMethod" required>
                                                <option value="" disabled selected>Select shipping method</option>
                                                <option value="standard">Standard Shipping</option>
                                                <option value="express">Express Shipping</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>

                        <div class="col-lg-4">
                            <!-- Selected Options Start -->
                            <h4>Selected Options</h4>
                            <table class="table table-bordered">
                                <thead>
                                    <tr>
                                        <th>Option</th>
                                        <th>Details</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>Room Type</td>
                                        <td id="roomType">${requestScope.room.type}</td>
                                    </tr>
                                    <tr>
                                        <td>Beds</td>
                                        <td id="roomType">${requestScope.room.singleBeds} Single and ${requestScope.room.doubleBeds} Double</td>
                                    </tr>
                                    <tr>
                                        <td>Amenities</td>
                                        <td id="amenities">${requestScope.room.amenitiesDescription}</td>
                                    </tr>
                                    <tr>
                                        <td>Price/day</td>
                                        <td id="amenities">${requestScope.room.pricePerDay}$</td>
                                    </tr>
                                    <tr>
                                        <td>Check-in Date</td>
                                        <td id="checkinDate">${requestScope.booking.checkinDate}</td>
                                    </tr>
                                    <tr>
                                        <td>Check-out Date</td>
                                        <td id="checkoutDate">${requestScope.booking.checkoutDate}</td>
                                    </tr>
                                </tbody>
                            </table>

                            <!-- Discount Code Start -->
                            <h4 class="mt-4">Discount Code</h4>
                            <div class="mb-3">
                                <input type="text" class="form-control" maxlength="8" id="discountCode" placeholder="Enter discount code">
                            </div>
                            <button class="btn btn-primary" onclick="applyDiscount()">Apply</button>
                            <div id="discountMessage" class="mt-3"></div>
                        </div>
                    </div>
                    <div class="row mt-4 justify-content-center">
                        <div class="col-md-6 text-center highlight-box">
                            <div class="header-section">
                                <h4>Total Price</h4>
                            </div>
                            <div class="content-section">
                                <p>Original Price: <span id="originalPrice">$${(requestScope.booking.checkoutDate - requestScope.booking.checkinDate) * requestScope.room.pricePerDay}</span></p>
                                <p>Discounted Price: <span id="discountedPrice">$1000.00</span></p>
                            </div>
                        </div>
                    </div>



                </div>
            </div>
            <!-- Checkout End -->

            <!-- Back to Top -->
            <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="bi bi-arrow-up"></i></a>
        </div>

        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/wow/1.1.2/wow.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/tempusdominus-bootstrap-4/5.39.0/js/tempusdominus-bootstrap-4.min.js"></script>

        <!-- Template Javascript -->
        <script src="js/main.js"></script>

        <script>
                                function applyDiscount() {
                                    var discountCode = document.getElementById('discountCode').value;
                                    var originalPrice = 1000.00; // Example original price
                                    var discount = 0;
                                    var discountedPrice = originalPrice;

                                    if (discountCode === 'SAVE10') {
                                        discount = 10;
                                    } else if (discountCode === 'SAVE20') {
                                        discount = 20;
                                    } else if (discountCode === 'SAVE30') {
                                        discount = 30;
                                    }

                                    if (discount > 0) {
                                        discountedPrice = originalPrice - (originalPrice * discount / 100);
                                        document.getElementById('discountMessage').innerText = `Discount of ${discount}% applied!`;
                                    } else {
                                        document.getElementById('discountMessage').innerText = 'Invalid discount code!';
                                    }

                                    document.getElementById('originalPrice').innerText = `$${originalPrice.toFixed(2)}`;
                                    document.getElementById('discountedPrice').innerText = `$${discountedPrice.toFixed(2)}`;
                                }
        </script>
    </body>
</html>
