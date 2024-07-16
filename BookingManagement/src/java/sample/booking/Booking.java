/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.booking;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class Booking {
    private int bookingId;
    private int userId;
    private int roomId;
    private Date checkinDate;
    private Date checkoutDate;
    private double totalPrice;
    private Date bookingDate;
    private String message;
    private String status;
    private String roomNumber;
    private String imageUrl;

    public Booking() {
    }

    public Booking(int bookingId, int userId, int roomId, Date checkinDate, Date checkoutDate, double totalPrice, Date bookingDate, String message, String status, String roomNumber, String imageUrl) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.roomId = roomId;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        this.totalPrice = totalPrice;
        this.bookingDate = bookingDate;
        this.message = message;
        this.status = status;
        this.roomNumber = roomNumber;
        this.imageUrl = imageUrl;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Booking{" + "bookingId=" + bookingId + ", userId=" + userId + ", roomId=" + roomId + ", checkinDate=" + checkinDate + ", checkoutDate=" + checkoutDate + ", totalPrice=" + totalPrice + ", bookingDate=" + bookingDate + ", status=" + status + '}';
    }
}
