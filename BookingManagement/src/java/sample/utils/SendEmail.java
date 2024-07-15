/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.utils;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author ADMIN
 */
public class SendEmail {
    // Email: 
    // Password: 

    static final String FROM = "";
    static final String PASSWORD = "";

    public static boolean sendEmail(String receiver, String title, String content) {
        // Properties : declare properties
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP HOST
        props.put("mail.smtp.port", "587"); // TLS 587 SSL 465
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // create Authenticator
        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                // TODO Auto-generated method stub
                return new PasswordAuthentication(FROM, PASSWORD);
            }
        };
        // session
        Session session = Session.getInstance(props, auth);
        // create message
        MimeMessage msg = new MimeMessage(session);
        try {
            // content type
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            // sender
            msg.setFrom(new InternetAddress(FROM, "Appointment Schedules ")); // Set the sender name
            // receiver
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiver, false));
            // email title
            msg.setSubject(title);
            // submission date regulations
            msg.setSentDate(new Date());
            // feedback email regulations
            // msg.setReplyTo(InternetAddress.parse(from, false))
            // content
            String htmlContent = "<!DOCTYPE html>"
                    + "<html lang='en'>"
                    + "<head>"
                    + "<meta charset='UTF-8'>"
                    + "<meta name='viewport' content='width=device-width, initial-scale=1.0'>"
                    + "<title>Appointment Schedules  - Important Message</title>"
                    + "</head>"
                    + "<body style='font-family: Arial, sans-serif; line-height: 1.6; color: #333; max-width: 600px; margin: 0 auto;'>"
                    + "<table width='100%' cellpadding='0' cellspacing='0' style='border-collapse: collapse;'>"
                    + "<tr>"
                    + "<td style='background-color: #f40; padding: 20px; text-align: center;'>"
                    + "<h1 style='color: white; margin: 0;'>Appointment Schedules </h1>"
                    + "</td>"
                    + "</tr>"
                    + "<tr>"
                    + "<td style='padding: 20px;'>"
                    + "<p>Dear Customer,</p>"
                    + "<p>This is a reminder for your upcoming appointment.</p>"
                    + "<p style='font-weight: bold;'>" + content + "</p>"
                    + "<p>Thank you for using our service.</p>"
                    + "</td>"
                    + "</tr>"
                    + "<tr>"
                    + "<td style='background-color: #f5f5f5; padding: 20px; text-align: center;'>"
                    + "<p style='margin: 0;'>Sincerely,<br>QE180172</p>"
                    + "</td>"
                    + "</tr>"
                    + "</table>"
                    + "</body>"
                    + "</html>";

            msg.setContent(htmlContent, "text/html; charset=UTF-8");
            // send email
            Transport.send(msg);
//            System.out.println("Send email successfully.");
            return true;
        } catch (MessagingException | UnsupportedEncodingException e) {
            Logger.getLogger(SendEmail.class.getName()).log(Level.SEVERE, "An exception occurred when sending email", e);
            return false;
        }
    }

//    public static void main(String[] args) {
//        String content = "<table border='1' style='width:100%; border-collapse: collapse;'>";
//        content += "<tr><th>Appointment Date</th><th>Appointment Time</th><th>Purpose</th><th>Status</th></tr>";
//        content += "<tr><td>2024-07-15</td><td>10:00 AM</td><td>Consultation</td><td>Confirmed</td></tr>";
//        content += "<tr><td>2024-07-16</td><td>2:00 PM</td><td>Follow-up</td><td>Pending</td></tr>";
//        content += "</table>";
//        SendEmail.sendEmail("trautrong@gmail.com", "Appointment Reminder", content);
//    }

}
//qard xgua lldg clyu
