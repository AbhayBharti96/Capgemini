package Day_23_12_2025;

public class ButterflyPattern {

	public static void main(String[] args) {
			int n = 4;
System.out.println("Pattern is: ");
			    for(int i = 1; i<n*2; i++) {
			        for(int j =  1; j<n*2; j++) {
			            if((i>=j || i+j>=n*2) && (i+j<=n*2 || i<=j)) {
			                System.out.print("*");
			            }else {
			                System.out.print(" ");
			            }
			            
			        }
			        System.out.println("");
			        
			    }
	}
}

//Output: 
/*
  
*     *
**   **
*** ***
*******
*** ***
**   **
*     *

*/