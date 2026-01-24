package overload;

class Student5 {

	private String name;
	int score;

	Student5(String n) {
		name = n;
	}

	public void setScore(int s) {
		if (0 <= s && s <= 100) {
			score = s;
		} else {
			System.out.println(name + "soteigai");
			score = 0;
		}
	}

	void display() {
		System.out.println(name + "sann" + score + "ten");
	}

}
