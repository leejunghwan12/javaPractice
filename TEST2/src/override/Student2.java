package override;

public class Student2 extends Person2 {
	private int stuNo;
	
	public void setStuNo(int s) {
		stuNo = s;
	}
	
	public void displayStuNo() {
		System.out.println("stuno=" + stuNo);
	}
	
//	이번의 포인트는여기!! 이름을 get으로 가져온다.
//	getName으로 하는이유 네임은 안된다. 프라이베잇이라서 퍼슨2에서만 참조가능하기때문
//	
	public void display() {
		System.out.println("overrride name=" + getName());
		System.out.println("overrride student=" + stuNo);
	}

}
