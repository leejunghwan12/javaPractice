package overload;

class Student4{

	String name;
	static int counter = 0;
	
	public Student4() {
		// TODO Auto-generated constructor stub
	}
	
	Student4(String n) {
		name = n;
		counter++;
		System.out.println(name + "desu");
	}
	
	static void display() {
		System.out.println(counter + "desu");
	}
	
}
