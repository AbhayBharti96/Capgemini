package Day_30_12_2025_OopsEncapsulation;
class Soltuion {

    // Person class
    static class Person {
        String name;
        int age;

        void displayPerson() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    // Staff class
    static class Staff extends Person {
        int staffId;
        String department;

        void displayStaff() {
            System.out.println("Staff ID: " + staffId);
            System.out.println("Department: " + department);
        }
    }

    // Doctor class
    static class Doctor extends Staff {
        String specialization;

        void treatPatient() {
            System.out.println("Doctor is treating a patient");
        }
    }

    // Nurse class
    static class Nurse extends Staff {
        String shift;

        void assistDoctor() {
            System.out.println("Nurse is assisting the doctor");
        }
    }

    // Main method
    public static void main(String[] args) {

        // Doctor data
        Doctor d = new Doctor();
        d.name = "Dr. Karthik";
        d.age = 42;
        d.staffId = 301;
        d.department = "Cardiology";
        d.specialization = "Heart Surgery";

        d.displayPerson();
        d.displayStaff();
        System.out.println("Specialization: " + d.specialization);
        d.treatPatient();

        System.out.println();

        // Nurse data
        Nurse n = new Nurse();
        n.name = "Suma";
        n.age = 29;
        n.staffId = 302;
        n.department = "Cardiology";
        n.shift = "Night";

        n.displayPerson();
        n.displayStaff();
        System.out.println("Shift: " + n.shift);
        n.assistDoctor();
    }
}
