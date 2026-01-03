package Day_30_12_2025_OopsEncapsulation;

public class Demo {
	Demo Demo1() {
		return this;
	}

	Demo Demo2() {
		return this;
	}

	Demo Demo3() {
		return this;
	}

	Demo Demo4() {
		return this;
	}

	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.Demo1().Demo2().Demo3().Demo4();
		System.out.println(d1);
	}

}
