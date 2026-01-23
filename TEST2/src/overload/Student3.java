package overload;

class Student3{

	String name;
	int engScore;
	int mathScore;
	
	public Student3() {
		// TODO Auto-generated constructor stub
	}
	
	Student3(String n) {
		name = n;
	}
	
	Student3(String n, int e, int m) {
		name = n;
		engScore = e;
		mathScore =m;
	}
	
//	void setData(String n) {
//		name = n;
//	}
//	
//	void setData(String n,int eng, int math) {
//		name = n;
//		engScore = eng;
//		mathScore = math;		
//	}
	
	void setScore(int eng, int math) {
		engScore = eng;
		mathScore = math;
	}

	double getAvg() {
		double avg = (engScore + mathScore) / 2.0;
		return avg;
	}

	
	void display() {
		System.out.println(name);
		System.out.println(engScore+mathScore);
	}
	
}
