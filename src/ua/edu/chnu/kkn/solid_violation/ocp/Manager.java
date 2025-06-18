package ua.edu.chnu.kkn.solid_violation.ocp;

public class Manager implements EmployeeType {
    @Override
    public int calculatePay(int salary, int bonus) {
        return salary + bonus;
    }
}
