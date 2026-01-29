package inter_practice;

public class Baseball implements Englishable{

	public void display() {
		System.out.println("catchball -nippon");
		System.out.println("seat knock-nippon ");
		System.out.println("batting-nippon");
	}
	
	public void displayEng() {
		System.out.println(Englishable.LANGUAGE);
		System.out.println("catchball");
		System.out.println("seat knock ");
		System.out.println("batting");
	}
	
}
