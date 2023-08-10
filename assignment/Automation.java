package week4.assignment;

public class Automation extends MultipleLanguage{

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby");
		
	}
	public static void main(String args[]) {
		Automation auto = new Automation();
		auto.java();
		auto.Selenium();
		auto.ruby();
	}
	

}
