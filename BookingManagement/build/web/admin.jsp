<%-- 
    Document   : admin
    Created on : 11/07/2024, 10:41:10 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Admin Center</title>
        <link rel="icon" type="image/x-icon" href="assets/images/favicon.png">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@400;500;600;700&display=swap" rel="stylesheet">
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="css/styles.css" rel="stylesheet">
        <style>
            body {
                font-family: Quicksand, sans-serif;
            }
            .container-body {
                max-width: 1200px !important;
                padding: 0 !important;
            }
            .container-fluid main.main-content {
                max-height: 100vh;
                overflow-y: scroll;
            }
            .sidebar {
                height: 100vh;
                background-color: #f8f9fa;
            }
            .content {
                padding: 20px;
            }
            .nav-link {
                color: #333;
            }
            .nav-link:hover, .nav-link.active {
                background-color: #e9ecef;
            }
            .table-responsive {
                overflow-x: auto;
            }
            .admin-info {
                background-color: #e9ecef;
                padding: 10px;
                margin-bottom: 20px;
            }
            .restore {
                width: 105px;
            }
            form[action="home"] {
                display: inline-block;
            }
            .banning {
                width: 168px;
            }
            .admin-btn, .staff-btn {
                width: 134px;
            }
        </style>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row">
                <!-- Sidebar -->
                <nav class="col-md-3 col-lg-2 d-md-block sidebar collapse">
                    <div class="position-sticky pt-3">
                        <div class="admin-info text-center">
                            <a href="profile" class="text-decoration-none text-dark"><i class="fas fa-user-circle fa-2x mb-2"></i></a>
                            <p class="mb-0">Welcome, ${sessionScope.userFullNameLogin}</p>
                            <a href="main?action=logout" class="btn btn-sm btn-danger mt-2" onclick="">Logout</a>
                        </div>
                        <ul class="nav flex-column">
                            <li class="nav-item">
                                <a class="nav-link active" href="admin" data-section="dashboard">
                                    <i class="fas fa-tachometer-alt me-2"></i>Dashboard
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#rooms" data-section="products">
                                    <i class="fa-solid fa-hotel me-2"></i></i>Rooms
                                </a>
                            </li>
                            <!--                            <li class="nav-item">
                                                            <a class="nav-link" href="#users" data-section="users">
                                                                <i class="fas fa-users me-2"></i>Users
                                                            </a>
                                                        </li>-->
                            <li class="nav-item">
                                <a class="nav-link" href="#bookings" data-section="orders">
                                    <i class="fa-solid fa-money-bill me-2"></i></i>Bookings
                                </a>
                            </li>
                        </ul>
                             <hr class="my-3">
                        <!--Total Customer-->
                        <p class="text-danger fw-bold">Total invoice: ${requestScope.customers}</p>
                        <!--Total Customer-->

                        <!--Total Revenue-->
                        <p class="text-danger fw-bold">Total revenue:  $${requestScope.revenue} </p>
                        <!--Total Revenue-->

                    </div>
                </nav>


                <!-- Main content -->
                <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4 main-content">
                    <div class="content">
                        <section id="dashboard" class="mb-4">
                            <h2>Dashboard</h2>
                        </section>

                        <!-- Bookings Section -->
                        <section id="bookings" class="mb-5">
                            <h3>Booking List</h3>
                            <div class="mb-3">
                                <!--                                <a href="product-details.jsp?target=add">
                                                                    <button class="btn btn-outline-success mb-2" type="submit">Add new product</button>
                                                                </a>-->
                                <form action="main" class="d-flex">
                                    <input type="hidden" name="action" value="searchBooking">
                                    <input type="hidden" name="src" value="admin.jsp">
                                    <button class="btn btn-outline-success me-2" type="submit">Search</button>
                                    <input class="form-control me-2" type="search" name="keyword" placeholder="Input ID to search" aria-label="Search">                                   
                                </form>
                            </div>
                            <div class="table-responsive">
                                <table class="table table-striped table-sm">
                                    <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>User ID</th>
                                            <th>Room ID</th>
                                            <th>Check in</th>
                                            <th>Check out</th>
                                            <th>Booking date</th>
                                            <th>Price</th>
                                            <th>Status</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="p" items="${requestScope.bookingList}">
                                            <tr id="${p.bookingId}">
                                                <td>${p.bookingId}</td>
                                                <td>${p.userId}</td>
                                                <td>${p.roomId}</td>
                                                <td>${p.checkinDate}</td>
                                                <td>${p.checkoutDate}</td>
                                                <td>${p.bookingDate}</td>
                                                <td class="price-format">${p.totalPrice}</td>
                                                <td>${p.status}</td>
                                            </tr>
                                        </c:forEach>
                                        <c:if test="${requestScope.bookingList.size() == 0}">
                                            <tr class="text-center"><td colspan="8">Nothing to show here</td></tr>
                                        </c:if>
                                    </tbody>
                                </table>
                            </div>
                        </section>

                        <!-- Rooms Section -->
                        <section id="rooms" class="mb-5">
                            <h3>Rooms</h3>
                            <div class="mb-3">
                                <a href="main?action=roomDetails&id=-1&target=add">
                                    <button class="btn btn-outline-success mb-2">Add new room</button>
                                </a>
                                <form action="main" class="d-flex">
                                    <input type="hidden" name="action" value="searchRoom">
                                    <button class="btn btn-outline-success me-2" type="submit">Search</button>
                                    <input class="form-control me-2" type="search" name="keyword" placeholder="Input ID or Room number to search" aria-label="Search">                                   
                                </form>
                            </div>
                            <div class="table-responsive">
                                <table class="table table-striped table-sm">
                                    <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>Room no</th>
                                            <th>Double/Single Beds</th>
                                            <th>Price/date</th>
                                            <th>Type</th>
                                            <th>Status</th>
                                            <th>Actions</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="p" items="${requestScope.rooms}">
                                            <tr>
                                                <td>${p.roomId}</td>
                                                <td>${p.roomNumber}</td>
                                                <td>${p.doubleBeds} / ${p.singleBeds}</td>
                                                <td>${p.pricePerDay}</td>
                                                <td>${p.type}</td>
                                                <td>
                                                    <c:choose>
                                                        <c:when test="${p.isAvailable}">
                                                            Available
                                                        </c:when>
                                                        <c:otherwise>
                                                            Not Available
                                                        </c:otherwise>
                                                    </c:choose>
                                                </td>
                                                <td>
                                                    <a href="main?action=roomDetails&id=${p.roomId}&target=update">
                                                        <button class="btn btn-primary">View details/Update</button>
                                                    </a> 
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </section>
                    </div>
                </main>
            </div>
        </div>
        <%@include file="modal.jsp"%>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
        <c:if test="${param.success == 'true'}">
            <script>
                showSuccessModal("Update room details successfully !")
            </script>
        </c:if>
        <c:if test="${param.success == 'false'}">
            <script>
                showErrorModal("Update room details failed !")
            </script>
        </c:if>

        <c:if test="${param.add == 'true'}">
            <script>
                showSuccessModal("Add New Room Successfully !")
            </script>
        </c:if>
        <c:if test="${param.add == 'false'}">
            <script>
                showSuccessModal("Add New Room Failed !")
            </script>
        </c:if>
    </body>
</html>
