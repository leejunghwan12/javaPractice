package overload;

public class StuSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 stu1 = new Student3("kim", 80, 90);
		Student3 stu2 = new Student3();
		stu1.display();
		System.out.println(stu1.getAvg());

	}

}
