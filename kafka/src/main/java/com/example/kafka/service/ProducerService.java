package com.example.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;

@Service
@Getter
@Setter
public class ProducerService {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void publishToTopic( String message ) {
		kafkaTemplate.send("TestTopic", message);
	}

}
