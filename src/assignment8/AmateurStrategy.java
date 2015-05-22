package assignment8;

import assignment8.PhotoStrategy;

public class AmateurStrategy implements PhotoStrategy {

	@Override
	public void takePhoto() {
		System.out.println("Say Cheese!");
	}
	
	@Override
	public void sendInvoice() {
		// default is free - no invoice
	}
}
