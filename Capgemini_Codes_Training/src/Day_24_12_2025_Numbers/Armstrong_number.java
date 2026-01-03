package Day_24_12_2025_Numbers;

public class Armstrong_number {
	public static void main(String[]args) {
	int a = 153;
	int org = a;
	int c =0;
	int temp =a;
	int sum =0;
	
	while(a!=0) {
		a =a /10;
		c++;
	}
	while(temp!=0) {
		int digit = temp%10;
		sum  += (int) Math.pow(digit,c);
		temp = temp/10;
	}
	if( sum==org) {
		System.out.println("Armstrong Number");
	}else {
		System.out.println("Not Armstrong");
	}

}
}