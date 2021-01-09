
abstract class Instrument
{
	abstract void play();
}
class Piano extends Instrument
{
	public void play()
	{
		System.out.println("Piano is Playing tan tan tan tan");
	}
}
class Flute extends Instrument
{
	public void play()
	{
		System.out.println("Flute is Playing toot toot toot toot");
	}
}
class Guitar extends Instrument
{
	public void play()
	{
		System.out.println("Guitar is Playing tin tin tin");
	}
}
public class Assignment5 {

	public static void main(String[] args) {
		Instrument arr[]= new Instrument[10];
		arr[0] = new Piano();
		arr[1] = new Flute();
		arr[2] = new Guitar();
		arr[4] = new Piano();
		arr[3] = new Flute();
		arr[5] = new Guitar();
		arr[6] = new Piano();
		arr[9] = new Flute();
		arr[7] = new Guitar();
		arr[8] = new Piano();
		String p,f,g;
		p = "Piano is stored in the Instrument Array at indexes : ";
		f = "Flute is stored in the Instrument Array at indexes : ";
		g = "Guitar is stored in the Instrument Array at indexes : ";
		for (int i = 0; i<10;i++)
		{
			arr[i].play();
			if(arr[i] instanceof Piano) p = p+i+" ";
			else if(arr[i] instanceof Flute) f = f+i+" ";
			else g = g+i+" ";
		}
		System.out.println("\n"+p+"\n"+f+"\n"+g);
	}

}
