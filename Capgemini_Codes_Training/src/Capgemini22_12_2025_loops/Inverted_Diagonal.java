package Capgemini22_12_2025_loops;

public class Inverted_Diagonal {

	public static void main(String[] args) {
		int a = 6;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				if (i + j == a) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}