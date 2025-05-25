package com.food.notification.config;

import com.food.notification.constants.NotificationConstants;
import com.food.notification.entity.EmailConfig;
import com.food.notification.enums.EventType;
import com.food.notification.repository.EmailConfigRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class EmailConfiguration {
    private final EmailConfigRepository emailConfigRepository;

    public EmailConfiguration(EmailConfigRepository emailConfigRepository) {
        this.emailConfigRepository = emailConfigRepository;
    }

    @Bean
    public JavaMailSender javaMailSender() {
        EmailConfig config = emailConfigRepository.findByEventTypeAndIsActive(EventType.CONFIG, NotificationConstants.ACTIVE_FLAG);

        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(config.getHost());
        mailSender.setPort(config.getPort());
        mailSender.setUsername(config.getUsername());
        mailSender.setPassword(config.getPassword());
        mailSender.setProtocol(config.getProtocol());

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", config.getProtocol());
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");

        return mailSender;
    }
}
