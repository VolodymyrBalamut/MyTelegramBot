package com.example.vobabot.services.impl;

import com.example.vobabot.services.SenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

@Service
@RequiredArgsConstructor
public class SenderServiceImpl implements SenderService {
    @Override
    public SendMessage sendMessage(Long chatId, String msgText) {
        return new SendMessage().setChatId(chatId)
                .setText(msgText);
    }
}
