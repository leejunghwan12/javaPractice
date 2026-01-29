package inter_practice;

public class Student7 implements Englishable{

	private String name;
	
	public Student7(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("name= "  + name);
		
	}
	
	public void displayEng() {
		System.out.println(Englishable.LANGUAGE);
		System.out.println("name:" + name);
	}
	
}
