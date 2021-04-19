package com.example.springbootchatting.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Chat {
    private String name;
    private String content;

    public Chat(String name, String content) {
        this.name = name;
        this.content = content;
    }
}
