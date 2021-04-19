package com.example.springbootchatting.domain;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public GreetingMessage gretting(HelloMessage helloMessage){
        return new GreetingMessage("Hello," + HtmlUtils.htmlEscape(helloMessage.getName()));
    }

    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    public Chat chatting(Chat chat){
        return new Chat(chat.getName(), chat.getContent());
    }
}
