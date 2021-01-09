
class NumberFormatException extends Exception
{
	public NumberFormatException(String e) 
	{
		super(e);
	}
}
class Student
{
	String name;
	int subject1,subject2,subject3;
	public Student(String n,String s1,String s2,String s3)
	{
		try {
			if (isNotNumber(s1)||isNotNumber(s2)||isNotNumber(s3))
			{
				throw new NumberFormatException("Marks entered Are not all Valid format");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.exit(0);
		}
		name = n;
		subject1 = Integer.parseInt(s1);
		subject2 = Integer.parseInt(s2);
		subject3 = Integer.parseInt(s3);
	}
	public boolean isNotNumber(String str)
	{
		try {
			Integer.parseInt(str);
		}
		catch(Exception e)
		{
			return true;
		}
		return false;
	}
	public void findAverage(Student s1)
	{
		int sum =subject1+subject2+subject3+s1.subject1+s1.subject2+s1.subject3;
		int average = sum/2;
		System.out.println("Average of the marks of "+name+" and "+s1.name+" is "+average);
	}
}
public class Assignment2 {
	public static void main(String[] args) {
		String name;
		String s1,s2,s3;
		Student ss1,ss2;
		name = args[0];
		s1 = args[1];
		s2 = args[2];
		s3 = args[3];
		ss1 = new Student(name,s1,s2,s3);
		name = args[4];
		s1 = args[5];
		s2 = args[6];
		s3 = args[7];
		ss2 = new Student(name,s1,s2,s3);
		ss2.findAverage(ss1);
	}

}
