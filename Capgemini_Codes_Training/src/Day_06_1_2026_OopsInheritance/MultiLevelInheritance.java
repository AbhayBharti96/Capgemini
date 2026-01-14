package Day_06_1_2026_OopsInheritance;

class X {
    void showA() {
        System.out.println("Hi I am A");
    }
}

class Y extends X {
    void showB() {
        System.out.println("Hi I am B");
    }
}

class C extends Y {
    void showC() {
        System.out.println("Hi I am C");
    }
}

public class MultiLevelInheritance {

    public static void main(String[] args) {
        C c = new C();

        c.showA();  // from A
        c.showB();  // from B
        c.showC();  // from C
    }
}
