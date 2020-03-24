package aula3;

public class Singleton {

	private static Singleton sc = new Singleton ();
	private Singleton () { }
	public static Singleton getInstance () {
		return sc;
	}


}
