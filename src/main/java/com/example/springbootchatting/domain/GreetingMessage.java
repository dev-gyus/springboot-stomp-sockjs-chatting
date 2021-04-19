package com.example.springbootchatting.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GreetingMessage {
    private String content;

    public GreetingMessage(String content) {
        this.content = content;
    }
}
