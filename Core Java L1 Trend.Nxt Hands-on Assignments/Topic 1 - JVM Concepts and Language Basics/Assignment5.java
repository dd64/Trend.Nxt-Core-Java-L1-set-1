
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Assignment5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the 4 digit number");
		int num = Integer.parseInt(br.readLine());
		int sum=0;
		for(int i =0;i<4;i++)
		{
			sum+=num%10;
			num = num/10;
		}
		System.out.println("The sum of all the digits entered is "+sum);
	}

}
