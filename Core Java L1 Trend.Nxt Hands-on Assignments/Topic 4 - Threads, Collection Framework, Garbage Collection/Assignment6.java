
import java.lang.runtime.*;
class A1
{
	int n;
	public A1(int num)
	{
		System.out.println("Class "+num+" Started");
		n = num;
	}

	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("Finalize method of class "+n+" called");
	}
	
}
public class Assignment6 {

	public static void main(String[] args) {
		A1 a = new A1(1);
		a = new A1(2);
		a = new A1(3);
		Runtime.getRuntime().gc();
	}

}
