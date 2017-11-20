package com.example.demo;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("message")
public class MeeagesContorller {
	final List<Message> messages = new CopyOnWriteArrayList<>();
	
	@RequestMapping(method = RequestMethod.GET)
	
	public List<Message> getMessages(){
		return messages;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Message postMessages(@RequestBody Message message) {
		messages.add(message);
		return message;
		
	}
}
