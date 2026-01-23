package test2;

class car {

	int no, speed;
	
	void setNo(int n) {
		no = n;
	}
	void run(int s) {
		speed = s;
	}
	
	void stop() {
		speed = 0;
	}
	
	void display() {
		System.out.println( "no = " + no + "speed = "+ speed );
	}
	
	
}
