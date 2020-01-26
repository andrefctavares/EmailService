package com.iban.demo;

import java.util.HashMap;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.iban.support.IncomingMessage;
import com.iban.support.NewsLetter;

@Service
public class RabbitMQListner implements MessageListener {

	public void onMessage(Message message) {
		
		/*
		 * THIS IS ONLY FOR DEMONSTRATION!
		 */
    	
        NewsLetter nl1 = new NewsLetter("1", "Title1", "1/1/2020", "This is a news letter description 1");
        NewsLetter nl2 = new NewsLetter("2", "Title1", "2/1/2020", "This is a news letter description 2");
        NewsLetter nl3 = new NewsLetter("3", "Title1", "2/1/2020", "This is a news letter description 3");
        NewsLetter nl4 = new NewsLetter("4", "Title1", "2/1/2020", "This is a news letter description 4");
        NewsLetter nl5 = new NewsLetter("5", "Title1", "2/1/2020", "This is a news letter description 5");
        
        HashMap<String, NewsLetter> NewsLetterHashMap = new HashMap<String, NewsLetter>();
        NewsLetterHashMap.put(nl1.getId(), nl1);
        NewsLetterHashMap.put(nl2.getId(), nl2);
        NewsLetterHashMap.put(nl3.getId(), nl3);
        NewsLetterHashMap.put(nl4.getId(), nl4);
        NewsLetterHashMap.put(nl5.getId(), nl5);
    	
		/*
		 * THIS IS ONLY FOR DEMONSTRATION!
		 */
        
		String msg = new String(message.getBody());
		ObjectMapper obj = new ObjectMapper();
		IncomingMessage inc = new IncomingMessage();
		
		try {
			inc = obj.readValue(msg, IncomingMessage.class);
					
			 NewsLetterHashMap.get(inc.getNewsletterId());
			

			 System.out.println("NEWSLETTER " + NewsLetterHashMap.get(inc.getNewsletterId()).getTitle() + " WILL BE SENT TO " + inc.getFirstName() + " (" + inc.getEmail() + ")");
			 
			 
			 /*
			 THIS SECTION WILL BE CALLING AND SEND EMAIL METHOD			  
			  */
		
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			System.out.println("Error occurred, "+e);
		}	
	}

}