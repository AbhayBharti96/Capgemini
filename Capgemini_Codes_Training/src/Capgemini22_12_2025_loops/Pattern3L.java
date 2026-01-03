package Capgemini22_12_2025_loops;

public class Pattern3L {

	public static void main(String[] args) {
		int a = 5;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(j== a|| i==1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}

}
