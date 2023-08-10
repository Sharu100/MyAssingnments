package assignments;

import week3.day5.Student;

public class student extends Department{
	public void studentName() {
		System.out.println("Gopikasree");
	}
	public void studentID() {
		System.out.println("pm2345");
	}
	public void studentDept() {
		System.out.println("IT");
	}
	public static void main(String args[]) {
		Student data = new Student();
		data.collegeName();
		data.collegeCode();
		data.collegeRank();
		data.deptName();
		data.studentName();
		data.studentName();
		data.studentDept();
		
		
		
	}

}
