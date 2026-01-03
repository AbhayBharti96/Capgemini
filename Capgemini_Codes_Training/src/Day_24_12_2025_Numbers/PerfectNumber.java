package Day_24_12_2025_Numbers;

public class PerfectNumber {

	public static void main(String[] args) {
		int a = 6;
		int sum  = 0;
		for(int i=1;i<=6;i++) {
			if(a%i==0) {
				sum += i;
			}
		}
		System.out.println(sum);
		if(sum==a) {
			System.out.println("PerfectNumber");
		}else {
			System.out.println("Not PerfectNumber");
		}

	}

}
