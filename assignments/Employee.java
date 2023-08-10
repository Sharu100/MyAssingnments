package assignments;

public class Employee {
	public void getEmployeeInfo(int id) {
		System.out.println(id);
	}
	public void getEmployeeInfo(int id,String name) {
		System.out.println(id+" "+name);
	}
	public void getEmployeeInfo(int id,String name,String email) {
		System.out.println(id+" "+name+" "+email);
	}
	public void getEmployeeInfo(int id,String name,String email,long phonenumber) {
		System.out.println(id+" "+name+" "+email+" "+phonenumber);
	}
	public static void main(String args[]) {
		Employee details = new Employee();
		details.getEmployeeInfo(5);
		details.getEmployeeInfo(5, "Ridhu");
		details.getEmployeeInfo(5, "Ridhu","varshini@gmail.com");
		details.getEmployeeInfo(5, "Ridhu","varshini@gmail.com",67484976);
		
	}

}
