package Day_29_12_2025_Oops;

class Ini {
	static {
		System.out.println("I am Static 1");
	}
	static {
		System.out.println("I am Static 2");
	}
	{
		System.out.println("I am from Non Static Block");
	}

}

public class IniBlock {

	public static void main(String[] args) {
		Ini i = new Ini();

	}

}
