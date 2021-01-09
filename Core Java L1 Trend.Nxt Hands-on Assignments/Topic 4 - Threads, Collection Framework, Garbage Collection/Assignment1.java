
class Fact
{
	int num;
	int fact;
	synchronized void random()
	{
		num = (int)(Math.random()*10);
		System.out.println("Random Number is "+num);
	}
	synchronized void factorial()
	{
		fact = facto(num);
		System.out.println("factorial of "+num+" is "+fact);
	}
	int facto(int num1)
	{
		int f=1;
		for(int i =1;i<=num1;i++)
		{
			f=f*i;
		}
		return f;
	}
}
class t1 extends Thread
{
	Fact f1;
	t1(Fact f)
	{
		f1 =f;
		new Thread(this).start();
	}
	public void run()
	{
		f1.random();
	}
}
class t2 extends Thread
{
	Fact f1;
	t2(Fact f)
	{
		f1 = f;
		new Thread(this).start();
	}
	public void run()
	{
		f1.factorial();
	}
}
public class Assignment1 {


	int facto(int num1)
	{
		if(num1==1)
		{
			return 1;
		}
		else
		{
			return num1*facto(num1-1);
		}
	}
	
	public static void main(String[] args) {
		Fact f1 = new Fact();
		t1 t01;
		t2 t02;
		for(int i = 0;i<5;i++)
		{
			t01 = new t1(f1);
			t02 = new t2(f1);
		}
		System.exit(0);
		
	}

}
