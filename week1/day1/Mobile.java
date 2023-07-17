package week1.day1;

public class Mobile {
	
	public void installApp() {
		System.out.println("installApp");
	}
	public void sendMessage() {
		System.out.println("sendMessage");
	}
	public void shareDocument() {
		System.out.println("shareDocument");
	}
	public void makeCall() {
		System.out.println("makeCall");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile myMobile = new Mobile();
		myMobile.installApp();
		myMobile.sendMessage();
		myMobile.shareDocument();
		myMobile.makeCall();
		

	}

}
