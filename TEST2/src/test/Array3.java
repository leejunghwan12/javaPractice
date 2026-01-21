package test;

//??
class Array3 {
	public static void main(String[] args){

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		if (a > b) {
			System.out.println("큰건 " + a +"입니다");
		}else if (a < b) {			
			System.out.println("큰건 " + b +"입니다");
		}else {
			System.out.println("똑같아여");
		}
	}
}
