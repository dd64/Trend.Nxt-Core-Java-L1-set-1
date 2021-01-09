package Automobile.TwoWheeler;

import Automobile.Vehicle;

public class Honda extends Vehicle
{
	String model,owner,reg;
	private int speed = 7;
	int song = 5;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Honda(String m,String o,String r)
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
	public int cdplayer()
	{
		return song;
	}
	public void start()
	{
		System.out.println("\n\n=======================\n-- Honda vehicle Details --"+
	"\nModel : "+modelName()+
	"\nOwner : "+ownerName()+
	"\nRegistration Number : "+registrationNumber()+
	"\nSpeed : "+speed()+
	"\nCd Player Song Number : "+cdplayer());
	}
}
