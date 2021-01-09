
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Assignment4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of Month");
		int month = Integer.parseInt(br.readLine());
		String monthStr ;
		switch(month)
		{
		case 1:	monthStr = "January";
				break;
		case 2:	monthStr = "february";
				break;
		case 3:	monthStr = "March";
				break;
		case 4:	monthStr = "April";
				break;
		case 5:	monthStr = "May";
				break;
		case 6:	monthStr = "June";
				break;
		case 7:	monthStr = "July";
				break;
		case 8:	monthStr = "August";
				break;
		case 9:	monthStr = "September";
				break;
		case 10:monthStr = "October";
				break;
		case 11:monthStr = "November";
				break;
		case 12:monthStr = "December";
				break;
		default:monthStr = "Not a valid number of month";
				break;
		}
		System.out.println(monthStr);
	}

}
