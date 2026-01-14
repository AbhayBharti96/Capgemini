package AbstractionPractice;

abstract class Employee {
    double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    abstract double calculateSalary();
    abstract String getEmployeeType();

    void displayDetails() {
        System.out.println(getEmployeeType() + " Salary is: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(double salary) {
        super(salary);
    }

    @Override
    double calculateSalary() {
        return salary * 5;
    }

    @Override
    String getEmployeeType() {
        return "Full-Time";
    }
}

class PartTimeEmployee extends Employee {

    PartTimeEmployee(double salary) {
        super(salary);
    }

    @Override
    double calculateSalary() {
        return salary;
    }

    @Override
    String getEmployeeType() {
        return "Part-Time";
    }
}

public class Solution04 {
    public static void main(String[] args) {

        Employee e = new FullTimeEmployee(20000);
        Employee e1 = new PartTimeEmployee(15000);

        e.displayDetails();
        e1.displayDetails();
    }
}
