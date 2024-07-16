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
                                <a class="nav-link active" href="#dashboard" data-section="dashboard">
                                    <i class="fas fa-tachometer-alt me-2"></i>Dashboard
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#products" data-section="products">
                                    <i class="fa-solid fa-hotel me-2"></i></i>Rooms
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#users" data-section="users">
                                    <i class="fas fa-users me-2"></i>Users
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#orders" data-section="orders">
                                    <i class="fa-solid fa-money-bill me-2"></i></i>Bookings
                                </a>
                            </li>
                        </ul>
                    </div>
                </nav>

                <!-- Main content -->
                <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4 main-content">
                    <div class="content">
                        <section id="dashboard" class="mb-4">
                            <h2>Dashboard</h2>
                        </section>

                        <!-- Bookings Section -->
                        <section id="products" class="mb-5">
                            <h3>Booking List</h3>
                            <div class="mb-3">
                                <!--                                <a href="product-details.jsp?target=add">
                                                                    <button class="btn btn-outline-success mb-2" type="submit">Add new product</button>
                                                                </a>-->
                                <form action="main" method="post" class="d-flex">
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
                                            <tr id="${p.id}">
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
                                            <tr class="text-center"><td colspan="7">Nothing to show here</td></tr>
                                        </c:if>
                                    </tbody>
                                </table>
                            </div>
                        </section>

                        <!-- Rooms Section -->
                        <section id="users" class="mb-5">
                            <h3>Rooms</h3>
                            <div class="mb-3">
                                <a href="room-details.jsp?target=addRoom">
                                    <button class="btn btn-outline-success mb-2" type="submit">Add new room</button>
                                </a>
                                <form action="main" method="post" class="d-flex">
                                    <input type="hidden" name="action" value="searchRoom">
                                    <button class="btn btn-outline-success me-2" type="submit">Search</button>
                                    <input class="form-control me-2" type="search" name="keyword" placeholder="Search rooms" aria-label="Search">                                   
                                </form>
                            </div>
                            <div class="table-responsive">
                                <table class="table table-striped table-sm">
                                    <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>Room no</th>
                                            <th>Beds</th>
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
                                                    <a href="room-details.jsp?target=updateRoom">
                                                        <button>View detail/Update</button>
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
        <script>
            function formatCurrencyVND(number) {
                return new Intl.NumberFormat('vi-VN', {style: 'currency', currency: 'VND'}).format(number);
            }
            document.querySelectorAll('.price-format').forEach(function (element) {
                const value = parseFloat(element.textContent);
                element.textContent = formatCurrencyVND(value);
            });
        </script>
        <script>
            document.addEventListener("DOMContentLoaded", function () {
                if (${requestScope.hashUrl != null} && !window.location.hash) {
                    window.location.hash = '${requestScope.hashUrl}';
                }
            });
        </script>
        <script>
            document.addEventListener('DOMContentLoaded', function () {
                const sidebarLinks = document.querySelectorAll('.sidebar .nav-link');
                const mainContent = document.querySelector('.main-content');

                sidebarLinks.forEach(link => {
                    link.addEventListener('click', function (e) {
                        e.preventDefault();
                        const targetId = this.getAttribute('data-section');
                        const targetElement = document.getElementById(targetId);

                        if (targetElement) {
                            const yOffset = -60;
                            const y = targetElement.getBoundingClientRect().top + window.pageYOffset + yOffset;

                            mainContent.scrollTo({
                                top: y,
                                behavior: 'smooth'
                            });
                            sidebarLinks.forEach(l => l.classList.remove('active'));
                            this.classList.add('active');
                        }
                    });
                });
            });
        </script>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script>
            $(document).ready(function () {
                //remove product :)))))
                $('.remove-product').click(function () {
                    var productId = $(this).data('product-id');
                    var $row = $(this).closest('tr');

                    showConfirmModal('Are you sure you want to delete this product?', function () {
                        $.ajax({
                            url: 'home',
                            type: 'POST',
                            data: {
                                id: productId,
                                action: "RemoveProduct"
                            },
                            success: function (response) {
                                if (response === 'success') {
                                    $row.find('td:last').find('button:last').css('display', 'none');
                                    $row.find('td:last').find('button:first').html('Restore');
                                    $row.find('td:last').find('button:first').addClass('btn-warning restore');
                                    showSuccessModal('Product deleted successfully');
                                } else {
                                    showErrorModal('Failed to delete product');
                                }
                            },
                            error: function () {
                                showErrorModal('An error occurred while deleting the product');
                            }
                        });
                    });
                });

                //reset :)))))
                $('.reset-password').click(function () {
                    var userId = $(this).data('user-id');
                    $.ajax({
                        url: 'home',
                        type: 'post',
                        data: {
                            id: userId,
                            action: "ChangePassword",
                            password: ""
                        },
                        success: function (response) {
                            if (response === 'success') {
                                showSuccessModal("ID: " + userId + "  New password: 12345");
                            } else {
                                showErrorModal("An error occurred. Please try again.");
                            }
                        },
                        error: function () {
                            showErrorModal('An error occurred while reset this password!');
                        }
                    });
                });
                $(document).on('click', '.change-role', function () {
                    var userId = $(this).data('user-id');
                    var roleId = $(this).data('role') === 1 ? 2 : $(this).data('role') === 2 ? 3 : 1;
                    var newRole = roleId === 1 ? "Admin" : roleId === 2 ? "Staff" : "Customer user";
                    var $col = $(this).closest('td');
                    var newHtml = roleId === 1 ? '<button class="btn btn-outline-dark admin-btn change-role" data-user-id="' + userId + '" data-role="1">Admin</button>'
                            : roleId === 2 ? '<button class="btn btn-outline-dark staff-btn change-role" data-user-id="' + userId + '" data-role="2">Staff</button>'
                            : '<button class="btn btn-outline-dark change-role" data-user-id="' + userId + '" data-role="3">Customer user</button>';

                    $.ajax({
                        url: 'home',
                        type: 'post',
                        data: {
                            id: userId,
                            action: "ChangeRole",
                            role: roleId
                        },
                        success: function (response) {
                            if (response === 'success') {
                                $col.html(newHtml);
                                showSuccessModal("New role: " + newRole);
                            } else {
                                showErrorModal("An error occurred. Please try again.");
                            }
                        },
                        error: function () {
                            showErrorModal('An error occurred while changing this role!');
                        }
                    });
                });
                $('.change-password').click(function () {
                    var userId = $(this).data('user-id');
                    var pass = "";
                    showInputModal('Enter new password:', 'password', 'Be careful when entering a new password').then(password => {
                        if (password.length < 6 || !/[A-Z]/.test(password) || !/[a-z]/.test(password) || !/[0-9]/.test(password)) {
                            showErrorModal('Password must be at least 6 characters long and include at least 1 uppercase letter, 1 lowercase letter, and 1 digit.');
                            pass = "";
                        } else {
                            pass = password;
                            $.ajax({
                                url: 'home',
                                type: 'post',
                                data: {
                                    id: userId,
                                    action: "ChangePassword",
                                    password: pass
                                },
                                success: function (response) {
                                    if (response === 'success') {
                                        showSuccessModal("Change password successfully!");
                                    } else {
                                        showErrorModal("An error occurred. Please try again.");
                                    }
                                },
                                error: function () {
                                    showErrorModal('An error occurred while reset this password!');
                                }
                            });
                        }
                    });
                });

                // Remove user :))))
                $('.remove-user').click(function () {
                    var userId = $(this).data('user-id');
                    var $row = $(this).closest('tr');
                    var text = $row.find('td:last').find('button:last').text();
                    if (text === 'Ban') {
                        showConfirmModal('Are you sure you want to ban this user?', function () {
                            $.ajax({
                                url: 'remove-user',
                                type: 'post',
                                data: {
                                    id: userId,
                                    action: "RemoveUser"
                                },
                                success: function (response) {
                                    if (response === 'success') {
                                        $row.find('td:last').find('button:first').css('display', 'none');
                                        $row.find('td:last').find('button:last').text('Unban');
                                        $row.find('td:last').find('button:last').addClass('banning');
                                        showSuccessModal('User banned successfully');
                                    } else {
                                        showErrorModal("Opps! An error occurred. Please try again.");
                                    }
                                },
                                error: function () {
                                    showErrorModal('An error occurred while banning the user');
                                }
                            });
                        });
                    } else {
                        showConfirmModal('Are you sure you want to unban this user?', function () {
                            $.ajax({
                                url: 'remove-user',
                                type: 'post',
                                data: {
                                    id: userId,
                                    action: "RemoveUser"
                                },
                                success: function (response) {
                                    if (response === 'success') {
                                        $row.find('td:last').find('button:first').css('display', 'inline-block');
                                        $row.find('td:last').find('button:last').text('Ban');
                                        $row.find('td:last').find('button:last').removeClass('banning');
                                        showSuccessModal('User unbanned successfully');
                                    } else {
                                        showErrorModal("Opps! An error occurred. Please try again.");
                                    }
                                },
                                error: function () {
                                    showErrorModal('An error occurred while unbanning the user');
                                }
                            });
                        });
                    }
                });
            });
        </script>
    </body>
</html>
