package object;

class Student{

	String name;
	int engScore;
	int mathScore;
	
	void display() {
		System.out.println(name);
		System.out.println(engScore+mathScore);
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
