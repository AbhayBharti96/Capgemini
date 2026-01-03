package Day_29_12_2025_Oops;

class AB {

    int age = 20;

    AB() {
        this(20);// This will execute first
        System.out.println("I am from Constructor 1");
    }

    AB(int age) {
        this.age = age;
        System.out.println("Age is: " + age);
    }
}

class X extends AB {

    X() {
        super(); // optional (called implicitly)
        System.out.println("I am from X class Constructor");
    }
}

public class ConstructorChaining02 {

    public static void main(String[] args) {
        AB a = new AB();
        System.out.println("----");
        X x = new X();
    }
}
// Flow is : A() → this(20) → A(int)

