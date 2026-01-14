package Day_06_1_2026_OopsInheritance;
// To achieve generalisation We use Upcasting 
class Student {
    int id;

    Student(int id) {
        this.id = id;
    }

    void show() {
        System.out.println("Student ID: " + id);
    }
}

class Person extends Student {

    Person(int id) {
        super(id);
    }

    void display() {
        System.out.println("Person class method");
    }
}

public class UpCastingNonPrimitive {

    public static void main(String[] args) {

        Student s = new Person(23);   // ✅ UPCASTING

        s.show();   // accessible

        // s.display(); ❌ not accessible (reference is Student)
    }
}
