package Capgemini22_12_2025_loops;
class MirrorL {
	public static void main(String[] args) {
		int n = 5;
		for(int r=1;r<n;r++) {
			for(int col=1;col<=n;col++) {
				if(r==1 || col == n) {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
		}
}
