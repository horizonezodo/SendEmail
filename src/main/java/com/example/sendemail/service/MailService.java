package com.example.sendemail.service;

public interface MailService {
    void sendMail(String to,String subject,String text);
}
