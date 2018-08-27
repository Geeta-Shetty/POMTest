package Inheritance;

public class BaseBicycle {
	
	public int gear;
	public  int speed;
	
	public BaseBicycle(int Gear, int Speed)
	{
		this.gear=Gear;
		this.speed=Speed;
	}
	
	public void applyBreak(int brk)
	{
		speed=speed-brk;
	}
	
	public int speedUP(int speedInc)
	{
		return speed=speed-speedInc;
	}
	
	public String toString()
	{
		return ("No of gears are :"+gear +"\n"+ "Speed of Bicysle is :"+speed);
		
	}
	
	/*public static void main(String[] args) {
		BaseBicycle b=new BaseBicycle(10, 100);
		System.out.println(b.toString());
		
	}*/
}
