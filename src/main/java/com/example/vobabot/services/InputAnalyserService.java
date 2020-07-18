package com.example.vobabot.services;

import org.telegram.telegrambots.meta.api.objects.Message;

public interface InputAnalyserService {
    String getResponse(Message msg);
}
