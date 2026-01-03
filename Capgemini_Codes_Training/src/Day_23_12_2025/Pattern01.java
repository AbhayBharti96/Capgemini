package Day_23_12_2025;

public class Pattern01 {
	public static void main(String []args) {
		int a = 8;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<a*2;j++) {
				if(i+j>=a+1 && j-i<=a-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
// Output : 
//       *       
//      ***      
//     *****     
//    *******    
//   *********   
//  ***********  
// ************* 
//***************
