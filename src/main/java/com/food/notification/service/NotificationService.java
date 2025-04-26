package com.food.notification.service;

import com.food.notification.enums.EventType;

public interface NotificationService {
    String sendNotify(String message, EventType eventType);
}
