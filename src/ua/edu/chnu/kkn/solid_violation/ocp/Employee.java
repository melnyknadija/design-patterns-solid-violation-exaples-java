package ua.edu.chnu.kkn.solid_violation.ocp;

public class Employee {

    private int salary;
    private int bonus;
    private EmployeeType type;

    Employee(int salary, int bonus, EmployeeType type) {
        this.salary = salary;
        this.bonus = bonus;
        this.type = type;
    }

    public int payAmount() {
        return type.calculatePay(salary, bonus);
    }
}

