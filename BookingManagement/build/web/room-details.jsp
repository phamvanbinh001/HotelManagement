<%-- 
    Document   : room-details
    Created on : 11/07/2024, 7:21:29 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Product Details</title>
        <link rel="icon" type="image/x-icon" href="assets/images/favicon.png">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@400;500;600;700&display=swap" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <style>
            body {
                font-family: Quicksand, sans-serif;
            }
            .back-button {
                position: fixed;
                left: 10px;
                top: 10px;
                background-color: #f8f9fa;
                color: #007bff;
                border: 1px solid #007bff;
                border-radius: 4px;
                padding: 5px 10px;
                font-size: 14px;
                cursor: pointer;
                transition: all 0.3s ease;
                z-index: 1000;
            }
            .back-button:hover {
                background-color: #007bff;
                color: white;
            }
            .back-button i {
                margin-right: 5px;
            }
            .container {
                max-width: 800px;
                margin-top: 50px;
                margin-bottom: 100px;
            }
            input[readonly=""] {
                opacity: 0.7;
            }
        </style>
    </head>
    <body>
        <a href="admin">
            <button id="backButton" class="back-button">
                <i class="fas fa-arrow-left"></i>
            </button>
        </a>
        <div class="container">
            <c:if test='${param.target.equals("updateRoom")}'>
                <h2 class="mb-4">Room Details</h2>
                <c:set var="room" value="${requestScope.room}"></c:set>
            </c:if>
            <c:if test='${param.target.equals("addRoom") || param.target == null}'>
                <h2 class="mb-4">Add New Room</h2>
            </c:if>
            <form action="main" method="post">          
                <input type="hidden" name="id" value="${room.roomId}">
                <input type="hidden" name="action" value="addRoom">
                <div class="mb-3">
                    <label for="roomNumber" class="form-label">Room Number</label>
                    <input type="text" maxlength="5" class="form-control" id="roomNumber" name="roomNumber" value="${room.roomNumber}" required>
                </div>
                
                <div class="mb-3">
                    <label for="singleBeds" class="form-label">Number of single beds</label>
                    <input type="number" min="0" class="form-control" id="singleBeds" name="singleBeds" value="${room.singleBeds}" required>
                </div>
                
                <div class="mb-3">
                    <label for="doubleBeds" class="form-label">Number of double beds</label>
                    <input type="number" min="0" class="form-control" id="doubleBeds" name="doubleBeds" value="${room.doubleBeds}" required>
                </div>

                <div class="mb-3">
                    <label for="pricePerDay" class="form-label">Price/day (VND)</label>
                    <input type="number" class="form-control" id="pricePerDay" name="pricePerDay" value="${room.pricePerDay}" required>
                </div>
                
                <div class="mb-3">
                    <label for="description" class="form-label">Description</label>
                    <input type="text" class="form-control" id="description" name="description" value="${room.description}" required>
                </div>

                <div class="mb-3">
                    <label for="type" class="form-label">Type</label>
                    <select id="type" class="form-select" name="type">
                        <option value="Luxury">Luxury</option>
                        <option value="Standard">Standard</option>
                    </select>
                </div>

                <div class="mb-3">
                    <label for="isAvailable" class="form-label">Available</label>
                    <select class="form-select" id="isAvailable" name="isAvailable">
                        <option value="true">Available</option>
                        <option value="false">Not Available</option>
                    </select>
                </div>

                <div class="mb-3">
                    <label for="imageUrl" class="form-label">Image URL</label>
                    <input type="url" class="form-control" id="imageUrl" name="imageUrl" value="${room.imageUrl}">
                </div>

                <input type="hidden" name="target" value="${param.target}">

                <c:if test='${param.target.equals("update")}'>
                    <button type="submit" class="btn btn-primary">Update Product</button>
                </c:if>
                <c:if test='${param.target.equals("add") || param.target == null}'>
                    <input type="hidden" name="product" value="1">
                    <button type="submit" class="btn btn-primary">Add New Product</button>
                </c:if>
                <!--<a href="admin" class="btn btn-secondary">Back to Admin Panel</a>-->
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
        <%@include file="modal.jsp"%>
        <c:if test="${param.result == 'update'}">
            <script>
                showSuccessModal("Update product successfully!");
            </script>
        </c:if>
        <c:if test="${param.result == 'add'}">
            <script>
                showSuccessModal("Add product successfully!");
            </script>
        </c:if>
    </body>
</html>