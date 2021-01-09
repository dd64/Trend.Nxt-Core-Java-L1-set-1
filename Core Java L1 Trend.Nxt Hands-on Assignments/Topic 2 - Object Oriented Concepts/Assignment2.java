
class Document
{
	String text;
	public String toString()
	{
		return text;
	}
	public void setText(String str)
	{
		text = str;
	}
}
class Email extends Document
{
	private String sender,recipient,title;
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSender()
	{
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public void setText(String s,String r,String t,String b)
	{
		super.setText(b);
		setSender(s);
		setRecipient(r);
		setTitle(t);
	}
	public String toString()
	{
		return ("\nSender : "+getSender()+
				"\nRecipient : "+getRecipient()+
				"\nTitle : "+getTitle()+
				"\nBody : "+super.toString());
	}
	
}
public class Assignment2 {

	public static void main(String[] args)  {
		Email mail = new Email();
		mail.setText("daison64@gmail.com","harrisjohn32@gmail.com","Application for Job","Hi, i need a Job . Please Help Me.");
		System.out.println(mail.toString());
	}

}
