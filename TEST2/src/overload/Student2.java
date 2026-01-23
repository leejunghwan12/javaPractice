package overload;

class Student2{

	String name;
	int engScore;
	int mathScore;
	
	void display() {
		System.out.println(name);
		System.out.println(engScore+mathScore);
	}
	
	void setData(String n) {
		name = n;
	}
	
	void setData(String n,int eng, int math) {
		name = n;
		engScore = eng;
		mathScore = math;		
	}
	
	void setScore(int eng, int math) {
		engScore = eng;
		mathScore = math;
	}

	
	double getAvg() {
		double avg = (engScore + mathScore) / 2.0;
		return avg;
	}

}
