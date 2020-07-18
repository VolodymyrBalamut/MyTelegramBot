package com.example.vobabot.services;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public interface SenderService {
    SendMessage sendMessage(Long chatId, String msgText);
}
