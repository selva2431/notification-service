package com.food.notification.service.email;

import com.food.notification.repository.EmailConfigRepository;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailNotification {

    private final JavaMailSender mailSender;

    private final EmailConfigRepository configRepository;

    public EmailNotification(JavaMailSender mailSender, EmailConfigRepository configRepository) {
        this.mailSender = mailSender;
        this.configRepository = configRepository;
    }

    public void sendMail(String to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);

        mailSender.send(message);
    }

}
