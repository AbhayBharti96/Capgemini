package Day_30_12_2025_OopsEncapsulation;

class PUBLIC {
	public static void PUB() {
		System.out.println("I am Public Method");
	}
}

class P1 extends PUBLIC {
	private void PR() {
		PUB();// Calling Public Method
		System.out.println("I am private method");
	}

	public void PrintPR() {
		PR();
	}

}

public class AcessModifier {

	public static void main(String[] args) {
		PUBLIC.PUB();//
		// P1.PR;// Not Allowing to acess it is allowed only within the same class;
		P1 p = new P1();
		p.PrintPR();
		ProtectedMethod m = new ProtectedMethod();
		System.out.println("-- I am called from Protected Method in the Same Package: ");
		m.Show();

	}

}
