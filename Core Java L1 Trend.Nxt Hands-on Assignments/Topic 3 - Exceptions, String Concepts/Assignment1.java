
class ageException extends Exception
{
	ageException(String e)
	{
		super(e);
	}
}
public class Assignment1 {
	public static void main(String[] args) {
		try 
		{
			if(Integer.parseInt(args[0])>=60||Integer.parseInt(args[0])<18)
			{
				throw new ageException("age entered should be >=18 and <60");
			}
			else
			{
				System.out.println("All good....!");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
