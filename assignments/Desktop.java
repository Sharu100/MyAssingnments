package assignments;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("24 inches");
	}
	public static void main(String args[]) {
		Desktop ele = new Desktop();
		ele.computerModel();
		ele.desktopSize();
		
	}

}
