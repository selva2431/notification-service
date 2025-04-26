package com.food.notification.serviceimpl;

import com.food.notification.entity.NotificationMessage;
import com.food.notification.enums.EventType;
import com.food.notification.repository.NoticationMessageRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationLogger {

    private final NoticationMessageRepository noticationMessageRepository;

    public NotificationLogger(NoticationMessageRepository noticationMessageRepository) {
        this.noticationMessageRepository = noticationMessageRepository;
    }

    @Transactional
    public void notificationLog(String message, EventType eventType){
        NotificationMessage notificationMessage=new NotificationMessage();
        notificationMessage.setMessage(message);
        notificationMessage.setEventType(eventType);
        noticationMessageRepository.save(notificationMessage);
    }
}
