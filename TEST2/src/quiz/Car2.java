package quiz;

class Car2 {

//	내가생각한게 맞음 엄밀히 말하면private써야함 
//	private라고 생각했음 
	int no;
	int speed;
	
	Car2() {
		no = 0;
	} 
	
	Car2(int n) {
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
