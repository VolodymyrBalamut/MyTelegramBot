package com.example.vobabot.services.impl;

import com.example.vobabot.models.entity.User;
import com.example.vobabot.models.mappers.UserMapper;
import com.example.vobabot.services.InputAnalyserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Message;

@Service
@AllArgsConstructor
public class TextAnalyserService implements InputAnalyserService {
    private UserMapper userMapper;
    @Override
    public String getResponse(Message msg) {
        if(msg != null) {
            User user = userMapper.getUser(msg);
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
        return "";
    }
}
