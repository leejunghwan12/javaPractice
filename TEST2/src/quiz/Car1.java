package quiz;

class Car1 {

	int no, speed;
	
	void setNo(int n) {
		no = n;
	}
	void run(int s) {
		speed = s;
	}

	void brake() {
		speed = 0;
	}
	
	void brake(int s) {
		speed = speed - s;
	}
	
	void display() {
		System.out.println( "no = " + no + "speed = "+ speed );
	}
	
	
}
