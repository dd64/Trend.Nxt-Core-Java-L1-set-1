

import java.util.Calendar;

class t11 extends Thread
{
	public void run()
	{
		System.out.println(Calendar.getInstance().getTime());
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		t11 t = new t11();
		t.start();
		try
		{
			for(int i = 0;i<10;i++)
			{
				t.sleep(2000);
				t.run();
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
