package structural.facade;

import structural.facade.email.*;

public class Client {

	public static void main(String[] args) {

		EmailFacade emailFacade = new EmailFacade();
		Order order = new Order("101", 99.99);
		
		boolean result = emailFacade.sendOrderEmail(order);
		
		System.out.println("Order Email "+ (result?"sent!":"NOT sent..."));
		
	}

	
}
