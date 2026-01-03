package Day_29_12_2025_Oops;

class A {

 int a;
    A() {
        System.out.println("I am Default Constructor");
    }
    A(int a){
    	this.a = a;
    	
    }
}

public class ConstructorDefualt {

    public static void main(String[] args) {
        A a = new A();  // Constructor is called here
        A a1= new A(25);
        System.out.println(a1.a);
    }
}
