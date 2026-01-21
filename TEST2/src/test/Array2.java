package test;
//??
class Array2{
	public static void main(String[] args){

		int radius = Integer.parseInt(args[0]);

		double pi = 3.141592;
		double area;
//		소수점 3자리이하 잘라버리기 
		area = (radius * radius* pi);
		
		
		
		System.out.println("Cricle= " + radius);
		System.out.println("area= " + area);
		
		
	}
}
