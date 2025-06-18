package ua.edu.chnu.kkn.solid_violation.ocp;

public class Engineer implements EmployeeType {
    @Override
    public int calculatePay(int salary, int bonus) {
        return salary;
    }
}