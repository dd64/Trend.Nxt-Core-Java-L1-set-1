

import java.util.HashSet;
import java.util.Iterator;

public class Assignment5 {

	public static void main(String[] args) {
		HashSet<String> EmpName = new HashSet<String>();
		EmpName.add("Amal Wilson");
		EmpName.add("Ammu Wilson");
		EmpName.add("Shimal Wilson");
		EmpName.add("Simal Wilson");
		EmpName.add("Renil Wilson");
		Iterator<String> itr = EmpName.iterator();
		while(itr.hasNext())
		{
			System.out.print("\n"+itr.next());
		}
		
	}

}
