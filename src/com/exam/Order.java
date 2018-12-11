package com.exam;

import java.util.ArrayList;

public class Order {
	ArrayList order = new ArrayList();
	public Order(){
		Ticket t = new Ticket("Taipei", "Keelung", 37, 2);
		order.add(t);
	}
	

	public void add(Ticket ticket) {
		
	}

	public void print() {
	
	}
	
	
}
