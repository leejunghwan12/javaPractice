package quiz;

class Car3 {

	private int no;
	private int speed;
	
	public Car3() {
	}
	
	public Car3(int n) {
		no = n;
	}
	
	public void run(int s) {
		speed = s;
	}

	public void brake() {
		speed = 0;
	}
	
	public void brake(int s) {
		speed = speed - s;
	}
	
	public void display() {
		System.out.println( "no = " + no + "speed = "+ speed );
	}
	
	
}
