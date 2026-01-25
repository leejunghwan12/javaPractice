package quiz;
class Car4{
	  private int no;
	  private static int count = 0;

	  public Car4(){
	    no = 0;
	    count++;
	    System.out.println("ナンバーなしを作りました");
	  }
	  public Car4(int n){
	    no = n;
	    count++;
	    System.out.println("ナンバー" + no + "を作りました");
	  }
//	  여기가 틀림 static으로 하자인스턴스 안쓰고도 부를수있다.
	  public static void display(){
	    System.out.println(count + "台作成済です");
	  }                                                                                                                                                                                                                  
	}

