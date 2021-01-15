package com.example.vobabot.models.mappers;

import com.example.vobabot.models.entity.UsersMessage;
import com.example.vobabot.models.entity.UsersMessage;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Message;

@Component
public class MessageMapper {
    public UsersMessage getMessage(Message msg){
        return new UsersMessage().builder()
                .text(msg.getText())
                .messageId(msg.getMessageId())
                .build();
    }
}
