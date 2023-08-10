package assignments;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposited");
	}
	public static void main(String args[]) {
		AxisBank details = new AxisBank();
		details.savings();
		details.fixed();
		details.deposit();
	}

}
