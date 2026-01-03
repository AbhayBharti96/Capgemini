package Day_29_12_2025_Oops;

public class StaticMethod {
	static int x = 20;
	
	static {
		x = x+30;
	}
	public static int AreaOfRect(int a,int b) {
		return a*b*x;
	}
public static int Update() {
	x= x+10;
	return x ;
}
	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		
		
	System.out.println("Area is: "+AreaOfRect(a,b));
	System.out.println("Updated x is: "+Update());
	}

}
