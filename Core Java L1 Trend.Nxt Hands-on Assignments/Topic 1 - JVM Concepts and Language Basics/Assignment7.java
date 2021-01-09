

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment7 {

	public static int fact(int e)
	{
		if(e<=1) return 1;
		else return e*fact(e-1);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number to find Factorial");
		int num = Integer.parseInt(br.readLine());
		System.out.println("Factorial of "+num+" = "+fact(num));
	}

}
