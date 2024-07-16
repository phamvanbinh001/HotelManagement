/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.payment;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class Payment {
    private int paymentId;
    private int bookingId;
    private double amount;
    private Date paymentDate;
    private String paymentMethod;

    public Payment() {
    }  

    public Payment(int paymentId, int bookingId, double amount, Date paymentDate, String paymentMethod) {
        this.paymentId = paymentId;
        this.bookingId = bookingId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Payment{" + "paymentId=" + paymentId + ", bookingId=" + bookingId + ", amount=" + amount + ", paymentDate=" + paymentDate + ", paymentMethod=" + paymentMethod + '}';
    }
    
}
