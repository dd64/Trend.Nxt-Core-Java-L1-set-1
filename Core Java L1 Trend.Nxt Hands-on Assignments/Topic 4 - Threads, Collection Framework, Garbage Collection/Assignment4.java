

import java.util.HashMap;

class Hash
{
	HashMap<String, Long> h1 = new HashMap<String,Long>();
	public void add(String name,long number)
	{
		h1.put(name, number);
	}
	public long search(String name)
	{
		if(h1.isEmpty())
		{
			System.out.println("Contact list empty");
			return 0;
		}
		else if(h1.containsKey(name))
		{
			System.out.println("--- Contact Details ---\nName : "+name+"\nContact Number : "+h1.get(name));
			return h1.get(name);
		}
		else
		{
			System.out.println("No such Contact");
			return 0;
		}
	}
}
public class Assignment4 {

	public static void main(String[] args) {
		Hash h1 = new Hash();
		h1.search("name");
		h1.add("Amal", 9567584231l);
		h1.add("Ravi", 6715238741l);
		h1.add("Nirmal", 7692634888l);
		h1.add("Manu", 9567584231l);
		h1.add("Majeed", 9567584231l);
		h1.add("Ammu", 9567584231l);
		h1.add("Nila", 9567584231l);
		h1.add("Malar", 9567584231l);
		h1.add("Amala", 9567584231l);
		h1.add("Mansoor", 9567584231l);
		
		h1.search("Amaaal");
		h1.search("Manu");
	}

}
