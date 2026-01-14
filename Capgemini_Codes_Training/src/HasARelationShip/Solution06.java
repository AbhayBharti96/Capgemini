package HasARelationShip;

class Teacher {
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void show() {
        System.out.println("Teacher name: " + name);
        System.out.println("Subject is: " + subject);
    }
}

class School {
    Teacher[] t;   // HAS-A relationship (Aggregation)

    School(Teacher[] t) {
        this.t = t;
    }

    void show() {
        System.out.println("School Teachers:");
        for (Teacher x : t) {   // ✅ Correct type
            x.show();
            System.out.println();
        }
    }
}

public class Solution06 {
    public static void main(String[] args) {

        // Step 1: Create Teacher objects (independent)
        Teacher t1 = new Teacher("Rahul", "Math");
        Teacher t2 = new Teacher("Anita", "Science");

        // Step 2: Store teachers in array
        Teacher[] teachers = { t1, t2 };

        // Step 3: Pass teachers to School
        School s = new School(teachers);

        // Step 4: Display teachers
        s.show();
    }
}
