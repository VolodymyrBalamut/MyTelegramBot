package com.example.vobabot.services.impl;

import com.example.vobabot.model.User;
import com.example.vobabot.services.InputAnalyserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Message;

@Service
@RequiredArgsConstructor
public class TextAnalyserService implements InputAnalyserService {
    @Override
    public String getResponse(Message msg) {
        User user = new User(msg);
        String msgText = msg.hasText() ? msg.getText() : null;
        String response = " ";
        if(msgText != null){
            switch (msgText.toUpperCase()) {
                case "ПРИВІТ":
                    response = "Привіт, " + user.toString();
                    break;
                case "HI":
                    response = "Hi, " + user.toString();
                    break;
                default:
                    response = msgText;
                    break;
            }
        }
        return response;
    }
}
