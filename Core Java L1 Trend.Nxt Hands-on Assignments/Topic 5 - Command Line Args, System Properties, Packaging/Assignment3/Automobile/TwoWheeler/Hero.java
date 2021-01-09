package Automobile.TwoWheeler;
import Automobile.*;
public class Hero extends Vehicle{
	String model,owner,reg;
	private int speed = 6;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Hero(String m, String o,String r)
	{
		model = m;
		owner = o;
		reg = r;
	}
	@Override
	public String modelName() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public String ownerName() {
		// TODO Auto-generated method stub
		return owner;
	}

	@Override
	public String registrationNumber() {
		// TODO Auto-generated method stub
		return reg;
	}
	public int speed()
	{
		return getSpeed();
	}
	public void radio()
	{
		System.out.print("Playing radio");
	}
	public void start()
	{
		System.out.println("\n\n=======================\n-- Hero vehicle Details --"+
	"\nModel : "+modelName()+
	"\nOwner : "+ownerName()+
	"\nRegistration Number : "+registrationNumber()+
	"\nSpeed : "+speed()+
	"\nRadio status : ");
		radio();
	}
	
}

