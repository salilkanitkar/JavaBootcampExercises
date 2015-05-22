package assignment4;

public class PhotoGrapher {

	private String fName;
	private String lName;
	
	public PhotoGrapher() {
		fName = "FirstName";
		lName = "LastName";
	}
	
	public PhotoGrapher(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void takeAPicture() {
		System.out.println("Stand & Smile Please...");
		System.out.println("Picture Taken !\n");
	}
	
	@Override
	public String toString() {
		return "fName=" + fName + ", lName=" + lName;
	}
}
