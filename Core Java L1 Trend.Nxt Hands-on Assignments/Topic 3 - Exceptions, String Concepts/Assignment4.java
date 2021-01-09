

import java.util.Locale;

public class Assignment4 {

	public static void main(String[] args) {
		String str = args[0];
		str = str.toUpperCase();
		int len = str.length(),low = 0,up = len-1;
		System.out.println(str);
		for(int i = 0;i<len/2;i++)
		{
			char c1 = str.charAt(low);
			char c2 = str.charAt(up);
			if(c1 != c2)
			{
				System.out.println("Not Palindrome");
				System.exit(0);
			}
		}
		System.out.println("Number is Palindrome");
	}

}
