
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Assignment3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of Minutes");
		int minutes = Integer.parseInt(br.readLine());
		int years = minutes/525600;
		int days = (minutes%525600)/1440;
		System.out.println(minutes+" minutes is approximately "+years+" and "+days+"days");
	}
}
