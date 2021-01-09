
class Book
{
	int isbn;
	float price,discount;
	String author,title;
	public Book(int i,float p,String a, String t)
	{
		isbn = i;
		price = p;
		author = a;
		title = t;
	}
	public void displayDetails()
	{
		System.out.println("ISBN : "+isbn+"\nTitle : "+title+"\nAuthor : "+author+"\nPrice : "+price+"\nDiscounted Price : "+discount);
	}
	public void discountedPrice(float percent)
	{
		discount =price-(price*(percent/100));
	}
	
}
public class Assignment1 {
	public static void main(String args[])
	{
		Book book;
		book = new Book(1001,500,"Harris John","Make Me Rich");
		book.discountedPrice(12);
		book.displayDetails();
		
	}
}
