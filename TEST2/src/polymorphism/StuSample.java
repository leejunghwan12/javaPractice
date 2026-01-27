package polymorphism;

public class StuSample {

	public static void main(String[] args) {
		Person5 test = new Person5("lee");
		test.display();
		// TODO Auto-generated method stub
		Student5 stu1 = new Student5("kim",1);
//		자식을 부모에 대입 -> 형변환 필요없다.
		Person5 psn = stu1;
		psn.display();
//		psn.chgStuNo(001);
		
//		ostanceof키워드 오브젝트의 클래스를 특정한다.
//		대상 오브젝트 인스턴스 오브 클래스명 으로 작성
		if (psn instanceof Student5) {
			Student5 stu2 = (Student5)psn;
			stu2.chgStuNo(1001);
			stu2.display();		
			
		}
		

	}

}
