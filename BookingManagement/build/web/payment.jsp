<%-- 
    Document   : payment
    Created on : 16/07/2024, 12:07:50 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Checkout</title>
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

            <!-- Checkout Start -->
            <div class="container-xxl py-5 mb-5">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8">
                            <h2 class="mb-4">Checkout</h2>
                            <form action="processCheckout" method="post">
                                <input type="hidden" name="bookingId" value="${booking.bookingId}">

                                <h4 class="mb-3">Select Payment Method</h4>
                                <div class="mb-3">
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" name="paymentMethod" id="creditCard" value="creditCard" checked>
                                        <label class="form-check-label" for="creditCard">
                                            Credit Card
                                        </label>
                                    </div>
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" name="paymentMethod" id="paypal" value="paypal">
                                        <label class="form-check-label" for="paypal">
                                            PayPal
                                        </label>
                                    </div>
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" name="paymentMethod" id="bankTransfer" value="bankTransfer">
                                        <label class="form-check-label" for="bankTransfer">
                                            Bank Transfer
                                        </label>
                                    </div>
                                </div>

                                <h4 class="mb-3">Contact Information</h4>
                                <div class="mb-3">
                                    <label for="email" class="form-label">Email</label>
                                    <input type="email" class="form-control" id="email" name="email" required>
                                </div>
                                <div class="mb-3">
                                    <label for="phone" class="form-label">Phone</label>
                                    <input type="tel" class="form-control" id="phone" name="phone" required>
                                </div>
                                
                                <button type="button" class="btn btn-primary" onclick="document.querySelector('form').dispatchEvent(new Event('submit'))">Confirm Booking</button>
                                <button type="submit" class="btn btn-secondary" name="action" value="addPendingBooking">Do it later</button>
                            </form>
                        </div>
                        <div class="col-lg-4">
                            <h2 class="mb-4">Booking Summary</h2>
                            <div class="card">
                                <div class="card-body">
                                    <h5 class="card-title">Room ${booking.roomNumber}</h5>
                                    <p class="card-text">
                                        <small class="text-muted">
                                            <i class="fa fa-calendar text-primary me-2"></i>
                                            Check-in: <fmt:formatDate value="${booking.checkinDate}" pattern="yyyy/MM/dd"/>
                                        </small>
                                    </p>
                                    <p class="card-text">
                                        <small class="text-muted">
                                            <i class="fa fa-calendar text-primary me-2"></i>
                                            Check-out: <fmt:formatDate value="${booking.checkoutDate}" pattern="yyyy/MM/dd"/>
                                        </small>
                                    </p>
                                    <h6 class="mt-4">Total Amount</h6>
                                    <p class="card-text">
                                        <strong>$${booking.totalPrice}</strong>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Checkout End -->
            <!-- Invoice Popup -->
            <div class="modal fade" id="invoiceModal" tabindex="-1" aria-labelledby="invoiceModalLabel" aria-hidden="true">
                <div class="modal-dialog modal-lg">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="invoiceModalLabel">Booking Invoice</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            <div class="container">
                                <div class="row">
                                    <div class="col-12">
                                        <h4>Booking Details</h4>
                                        <p><strong>Room:</strong> ${booking.roomNumber}</p>
                                        <p><strong>Check-in:</strong> <fmt:formatDate value="${booking.checkinDate}" pattern="yyyy/MM/dd"/></p>
                                        <p><strong>Check-out:</strong> <fmt:formatDate value="${booking.checkoutDate}" pattern="yyyy/MM/dd"/></p>
                                        <p><strong>Payment Method:</strong> <span id="paymentMethodDisplay"></span></p>
                                    </div>
                                </div>
                                <div class="row mt-4">
                                    <div class="col-12">
                                        <h4>Price Details</h4>
                                        <table class="table">
                                            <tr>
                                                <td>Room Charge</td>
                                                <td>$${booking.totalPrice}</td>
                                            </tr>
                                            <tr>
                                                <td>Tax</td>
                                                <td>$${booking.totalPrice * 0.1}</td>
                                            </tr>
                                            <tr>
                                                <th>Total</th>
                                                <th>$${booking.totalPrice * 1.1}</th>
                                            </tr>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal" id="closeInvoiceBtn">Close</button>
                            <button type="button" class="btn btn-primary" onclick="printInvoice()">Print Invoice</button>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Include your footer here -->
            <jsp:include page="footer.jsp" />
        </div>

        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>

        <!-- Template Javascript -->
        <script src="js/main.js">
        </script>
        <script>
            var invoiceModal;

            document.querySelector('form').addEventListener('submit', function (e) {
                e.preventDefault(); // Ngăn form submit theo cách thông thường

                // Lấy phương thức thanh toán đã chọn
                var paymentMethod = document.querySelector('input[name="paymentMethod"]:checked').value;
                document.getElementById('paymentMethodDisplay').textContent = paymentMethod;

                // Hiển thị modal
                invoiceModal = new bootstrap.Modal(document.getElementById('invoiceModal'));
                invoiceModal.show();
            });

            // Hàm để chuyển hướng
            function redirectToViewBooking() {
                window.location.href = 'viewBooking';
            }

            // Event listener cho nút Close
            document.getElementById('closeInvoiceBtn').addEventListener('click', redirectToViewBooking);

            // Event listener cho sự kiện đóng modal
            document.getElementById('invoiceModal').addEventListener('hidden.bs.modal', redirectToViewBooking);
        </script>
        <script>
            function printInvoice() {
                var printContents = document.getElementById('invoiceModal').innerHTML;
                var originalContents = document.body.innerHTML;

                document.body.innerHTML = printContents;
                window.print();
                document.body.innerHTML = originalContents;
                window.location.reload();
            }
        </script>
    </body>
</html>