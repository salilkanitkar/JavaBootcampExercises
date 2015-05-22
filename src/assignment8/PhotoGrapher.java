package assignment8;

import assignment8.AmateurStrategy;
import assignment8.PhotoStrategy;
import assignment8.ProStrategy;

public class PhotoGrapher {

	private int photoCount = 0;
	
	private PhotoStrategy strategy = new AmateurStrategy();
	
	public void takePhoto() {
		strategy.takePhoto();
		photoCount += 1;
		
		if (photoCount > 75) {
			strategy = new ProStrategy();
		}
	}
	
	public void sendInvoice() {
		strategy.sendInvoice();
	}
}
