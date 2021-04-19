package com.example.springbootchatting.domain;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * STOMP 설정클래스
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/websocket").withSockJS(); // 최초 웹소켓 연결시(채팅방개설시) 사용할 EndPoint가 될 Url, SockJS도 같이 사용하도록 설정
    }


    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic"); // Client로 메세지 응답할때 사용할 prefix
        registry.setApplicationDestinationPrefixes("/app"); // Client -> Server로 메세지 보낼때 사용할 prefix
    }
}
