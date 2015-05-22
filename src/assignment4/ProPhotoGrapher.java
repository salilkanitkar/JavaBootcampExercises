package assignment4;

import assignment4.PhotoGrapher;

public class ProPhotoGrapher extends PhotoGrapher {
	
	private int proCode;
	
	public ProPhotoGrapher() {
		super();
		this.proCode = 0;
	}
	
	public ProPhotoGrapher(String fName, String lName, int proCode) {
		super(fName, lName);
		this.proCode = proCode;
	}

	public void takeAPicture() {
		System.out.println("Setup lights, Setup positioning etc ...");
		System.out.println("Picture Taken !");
	}
	
	public void sendInvoice() {
		System.out.println("Sending Invoice .... \n");
	}
	
	@Override
	public String toString() {
		return "fName=" + getfName() + ", lName=" + getlName() + ", proCode=" + this.proCode;
	}

}
