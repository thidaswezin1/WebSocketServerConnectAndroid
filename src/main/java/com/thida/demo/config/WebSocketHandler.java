package com.thida.demo.config;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

public class WebSocketHandler extends AbstractWebSocketHandler{

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		// TODO Auto-generated method stub
		super.handleTextMessage(session, message);
		
		String msg = String.valueOf(message.getPayload());
		if(msg.equals("1")) {
			System.out.println("Jasmine flower is clicked!");
			session.sendMessage(new TextMessage("Jasmine Flower"));
		}
		else {
			System.out.println("Rose flower is clicked!");
			session.sendMessage(new TextMessage("Rose Flower"));
		}
	}

}
