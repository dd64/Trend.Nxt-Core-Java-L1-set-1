
class Payment
{
	private double amount;
	public Payment(double a)
	{
		setAmount(a);
	}
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void paymentDetails()
	{
		System.out.print(amount+" rupees paid ");
	}
}
class CashPayment extends Payment
{
	String name;
	public CashPayment(String n,double a)
	{
		super(a);
		name = n;
	}
	public void paymentDetails()
	{
		super.paymentDetails();
		System.out.println(" in Cash by "+name+"\n======================\n\n");
	}
}
class CreditCardPayment extends Payment
{
	String end,name;
	long number;
	public CreditCardPayment(String e,String n,double a,long num)
	{
		super(a);
		end = e;
		name = n;
		number = num;
	}
	public void paymentDetails()
	{
		super.paymentDetails();
		System.out.println(" Using Card Payment\nName of Card Holder : "+name+
				"\nValid Upto : "+end+
				"\nCard Number : "+number+"\n======================\n\n");
	}
}
public class Assignment4 {

	public static void main(String[] args) {
		CashPayment c1,c2;
		c1 = new CashPayment("Daison Davis",1000);
		c2 = new CashPayment("Harish John", 20000);
		CreditCardPayment cc1,cc2;
		cc1 = new CreditCardPayment("2025/10","Daison Davis",15000,2121212121212121l);
		cc2 = new CreditCardPayment("2030/06","Hasheeb Munir",45000,3243325432213243l);
		c1.paymentDetails();
		c2.paymentDetails();
		cc1.paymentDetails();
		cc2.paymentDetails();
		
	}

}
