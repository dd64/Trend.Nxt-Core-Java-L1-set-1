
public class Assignment3 {

	public static void main(String[] args) {
		int sum = 0;
		try
		{
			for(int i = 0;i<5;i++)
			{
				sum+=Integer.parseInt(args[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e+"\nless than 5 numbers given");
			System.exit(0);
		}
		System.out.println("Average of the 5 numbers is "+sum/5);
	}

}
