package Day_24_12_2025_Numbers;

public class Factors {

	public static void main(String[] args) {
		int a = 12;
		int f = 1;
		System.out.print("factors are: ");
		for (int i = 1; i <= 10; i++) {
			if (a % i == 0) {
				System.out.print(i + " ");

			}
		}

	}

}
