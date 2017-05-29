package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import models.EventModel;
import models.TicketModel;

@Controller
public class TicketController {
	
@PostMapping("/buy_ticket")
	public String buy_ticket()
	{
		return "true";
	}
@GetMapping("/list_events")
	public String list_events()
	{
		EventModel ticket =new EventModel();
		ticket.setId(1);
		ticket.setData("29-05-2017");
		ticket.setName("EventBrite");
		EventModel ticket2 =new EventModel();
		ticket2.setId(2);
		ticket2.setData("29-05-2017");
		ticket2.setName("EventBrite");
		return "["+ticket.toString()+","+ticket2.toString()+"}";
	}
@GetMapping("/ticket_details/{id}")
public String ticket_details(@PathVariable("id") String id)
{
	TicketModel ticket =new TicketModel();
	ticket.setId(Integer.parseInt(id));
	ticket.setData("29-05-2017");
	ticket.setName("EventBrite");
	return ticket.toString();
}
@PostMapping("/cancel_ticket")
public boolean cancel_ticket(@ModelAttribute TicketModel ticket)
{
	return true;
}
}