/**
 * Inheritance
 */

class Employee {
    int salary = 30000;

    void gross_salary() {
        double da = salary * .05;
        double hra = salary * .12;
        System.out.println("Gross Salary = " + (salary + da + hra));
    }
}

public class Inheritance extends Employee {

    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        System.out.println("Salary = " + obj.salary);
        obj.gross_salary();
    }
}