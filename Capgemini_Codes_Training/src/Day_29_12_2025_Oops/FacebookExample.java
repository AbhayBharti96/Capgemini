package Day_29_12_2025_Oops;
class FB{
	String userName;
	String mail;
	String pass;
	FB(String a,String b,String c){
		this.userName = a;
		this.mail= b;
		this.pass=c;
		System.out.println("Username is: "+a);
		System.out.println("Mail is: "+b);
		System.out.println("Pass is: "+c);
		System.out.println("----------");
	}
}
public class FacebookExample {
	public static void main(String[] args) {
		FB f1 = new FB("Abhay","123@gmail.com","123456");
		FB f2 = new FB("Akshat","124@gmail.com","123457");
		FB f3 = new FB("Abhi","125@gmail.com","123458");
	}

}
