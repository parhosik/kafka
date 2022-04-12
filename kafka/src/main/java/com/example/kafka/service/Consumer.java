package com.example.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	@KafkaListener(topics="TestTopic",groupId="mygroup" )
	public void consume( String message ) {
		System.out.println( message );
	}

}
