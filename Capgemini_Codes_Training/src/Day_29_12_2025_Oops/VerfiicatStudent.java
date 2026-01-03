package Day_29_12_2025_Oops;

class Student{
	String PAN;
	String ADHAAR;
	String  VC;
	Student(String A, String B ,String C){
		this .ADHAAR =A;
		this.PAN= B;
		this.VC= C;
		System.out.println("Student is Having all things: "+A+" "+B+" "+C);
	}
	Student(String A, String B){
		this .ADHAAR =A;
		this.PAN= B;
		System.out.println("Student is Having PAN and ADHAAR things: "+A+" "+B);
	}
	Student(String A){
		this .ADHAAR =A;
		System.out.println("Student is Having only ADHAAR things: "+A);
	}
}
public class VerfiicatStudent {

	public static void main(String[] args) {
		
		
		Student s1 = new Student("123","456","987");
		Student s2 = new Student("GNH123","8415");
		Student s3 = new Student("841256");
		
		
		

	}

}
