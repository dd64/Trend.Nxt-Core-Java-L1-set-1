package test;
import test.Foundation;
public class Goodclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foundation f1 = new Foundation();
		System.out.println("private variable var1 = 'Not Accessible'"+
		"\nPublc variable var2 = "+f1.var2+
		"\nprotected variable var3 = "+f1.var3+
		"\ndefault variable var4 = "+f1.var4);
	}

}
