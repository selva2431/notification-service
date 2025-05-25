package com.food.notification.repository;

import com.food.notification.entity.EmailConfig;
import com.food.notification.enums.EventType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailConfigRepository extends JpaRepository<EmailConfig, UUID> {
    EmailConfig findByEventTypeAndIsActive(EventType eventType, String status);
}