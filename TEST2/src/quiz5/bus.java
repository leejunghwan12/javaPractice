package quiz5;

public class bus extends Vehicle{

  public bus(int crewNum){
    this.crewNum = crewNum;
  }
  public void showCrewNum(){
    System.out.println("電車の乗客：" + crewNum + "名");
  }
  
  public void stop() {
	  System.out.println("次で止まります");
  }
  
}
