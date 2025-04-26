package com.food.notification.serviceimpl;

import ch.qos.logback.core.util.StringUtil;
import com.food.notification.enums.EventType;
import com.food.notification.service.NotificationService;
import org.springframework.util.StringUtils;

public class NotificationServiceImpl implements NotificationService {

    private final NotificationLogger notificationLogger;

    public NotificationServiceImpl(NotificationLogger notificationLogger) {
        this.notificationLogger = notificationLogger;
    }

    @Override
    public String sendNotify(String message, EventType eventType) {

        notificationLogger.notificationLog(message,eventType);
        return "Notication sent successfully";
    }
}
