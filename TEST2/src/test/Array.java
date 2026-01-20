package test;

class Array{
	public static void main(String[] args){
		int price = Integer.parseInt(args[0]);
		double rate = 0.10;
		int discount, amount;
		
		if( price >= 5000 ) {
			discount = 500;
		} else if ( price >= 3000 ) {
			discount = 300;
		} else {
			discount = 0;
		}
		
		amount = (int)((price - discount) * (1+ rate ));
		System.out.println("discount" + discount );
		System.out.println("amount" + amount );
		
	}
}
