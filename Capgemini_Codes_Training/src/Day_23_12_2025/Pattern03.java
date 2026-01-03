package Day_23_12_2025;

public class Pattern03 {
	public static void main(String []args) {
		int n = 4;
		for(int i=1;i<n*2;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j && i+j<=n*2 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
