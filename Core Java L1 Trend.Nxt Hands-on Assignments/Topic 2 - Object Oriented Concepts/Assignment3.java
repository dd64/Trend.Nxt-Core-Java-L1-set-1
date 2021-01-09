

class Book1
{
	int isbn;
	float price;
	String title;
	public Book1(int i,float p, String t)
	{
		isbn = i;
		price = p;
		title = t;
	}
	public void displayDetails()
	{
		System.out.println("ISBN : "+isbn+"\nTitle : "+title+"\nPrice : "+price);
	}
}

class Novel extends Book1
{
	String Author;
	public Novel(int i,float p,String t,String a)
	{
		super(i,p,t);
		Author = a;
	}
	public void displayDetails()
	{
		System.out.println("\n--- Details of the Novel ---");
		super.displayDetails();
		System.out.println("Author : "+Author);
	}
}
class Magazine extends Book1
{
	String Type;
	public Magazine(int i,float p,String t,String a)
	{
		super(i,p,t);
		Type = a;
	}
	public void displayDetails()
	{
		System.out.println("\n--- Details of the Magazine ---");
		super.displayDetails();
		System.out.println("Type : "+Type);
	}
}

public class Assignment3 {
	public static void main(String args[])
	{
		Magazine m1 = new Magazine(1001,125,"Once Upon A time","Lifestyle");
		Novel n1 = new Novel(1004,200,"Thers That girl","Harris John");
		m1.displayDetails();
		n1.displayDetails();
		
	}
}
