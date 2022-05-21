package com.github.nms.javaee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.nms.javaee.dto.Message;
import com.github.nms.javaee.service.MessageService;

@RestController
@RequestMapping
public class HomeController {
	
	@Autowired
	MessageService msgService;
	
	@GetMapping
	public Message home() {
		return msgService.getMessage();
	}
	
	/*
	 * @GetMapping public Message home() { return new
	 * Message("Hello from Spring boot!!!"); }
	 */
}
