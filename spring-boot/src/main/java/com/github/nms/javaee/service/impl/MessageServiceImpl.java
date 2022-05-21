package com.github.nms.javaee.service.impl;

import org.springframework.stereotype.Service;

import com.github.nms.javaee.dto.Message;
import com.github.nms.javaee.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

	@Override
	public Message getMessage() {
		return new Message("Message from Bussiness service!!!!");
	}

}
