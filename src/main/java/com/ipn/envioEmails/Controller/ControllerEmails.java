package com.ipn.envioEmails.Controller;

import com.ipn.envioEmails.Service.ServiceEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
public class ControllerEmails {

    @Autowired
    private ServiceEmail serviceEmail;

    @PostMapping("/send")
    public String sendEmail(@RequestParam String to, @RequestParam String subject, @RequestParam String text) {
        serviceEmail.sendSimpleMessage(to, subject, text);
        return "Envio de email hecho!";
    }
}
