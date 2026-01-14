package CapPractice03_01_2026;
class Address{
	private String city;
	private String state;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	Address(String city,String state){
		this.city = city;
		this.state = state;
	}
	
	
}
class Student{
	String name;
	String RegNo;
	Student(String name , String RegNo){
		this.name = name;
		this.RegNo=RegNo;
		
	}
	void show() {
		System.out.println("Name is: "+name+" Reg No is: "+RegNo);
	}
	Address a = new Address("Sambhal","UttarPradesh");
	
}




public class HasARelationShip {

	public static void main(String[] args) {
		Student s = new Student("Abhay","12323137");
		System.out.println(s.a.getCity());
		System.out.println(s.a.getState());
		s.show();
		
		
	}

}
