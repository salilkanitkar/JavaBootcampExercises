package assignment8;

import assignment8.PhotoStrategy;

public class ProStrategy implements PhotoStrategy {

	@Override
	public void takePhoto() {
		System.out.println("Set up lights, take meter readings, take photo...");
	}
	
	@Override
	public void sendInvoice() {
		System.out.println("Send Money .... ");
	}
}
