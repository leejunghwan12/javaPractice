package object;

public class StuSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		stu1.name = "lee";
		stu1.setScore(90, 80);
		
		stu1.display();
		System.out.println(stu1.getAvg());

	}

}
