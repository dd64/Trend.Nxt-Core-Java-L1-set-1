

public class Assignment5 {
	public static int check(String str,char c,int i)
	{
		if(str.charAt(1)==c)i++;
		str = str.substring(1);
		if(str.length()==1)
		{
			return i;
		}
		else
		{
			
			return check(str,c,i);
		}
	}
	public static void main(String[] args) {
		String str = "Waaaa asdfa afagag";
		int i=0;
		char c = 'A';
		str = str.toUpperCase();
		if(str.charAt(0)==c)
		{
			i++;
		}
		i = check(str,c,i);
		System.out.println(i);
	}

}
