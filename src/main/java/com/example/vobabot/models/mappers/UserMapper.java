package com.example.vobabot.models.mappers;

import com.example.vobabot.models.entity.User;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Message;

@Component
public class UserMapper {
    public User getUser(Message msg) {
        return new User().builder()
                .chatId(msg.getChatId().toString())
                .firstName(msg.getFrom().getFirstName())
                .lastName(msg.getFrom().getLastName())
                .userName(msg.getFrom().getUserName()).build();
    }
}
