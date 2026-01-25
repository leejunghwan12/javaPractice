package inheritance;

public class Student extends Person {
	private int stuNo;
	private String name;
	
	public void setStuNo(int s) {
		stuNo = s;
	}
	
	public void displayStuNo() {
		System.out.println("stuno=" + stuNo);
	}


}
