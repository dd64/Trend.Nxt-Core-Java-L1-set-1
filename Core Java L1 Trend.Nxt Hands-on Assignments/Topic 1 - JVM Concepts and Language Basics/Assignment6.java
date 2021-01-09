
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Assignment6 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[5];
		int temp;
		System.out.println("Enter 5 numbers of the array");
		for(int i=0;i<5;i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i =0;i<4;i++)
		{
			for(int j = i+1;j<5;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("Greatest Number in the Given Array is "+arr[4]);
	}

}
