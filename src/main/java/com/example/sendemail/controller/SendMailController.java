package com.example.sendemail.controller;

import com.example.sendemail.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class SendMailController {

    @Autowired
    private MailService mailService;

    @GetMapping("/verifyCode")
    public String sendCode(@RequestParam String email){
        mailService.sendMail(email,"your link","redirect:http://localhost:8081/ChangePassword?email="+email);
        return "We have been send email for you";
    }
}
