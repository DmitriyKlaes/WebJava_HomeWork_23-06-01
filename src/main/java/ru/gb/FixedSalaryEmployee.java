package ru.gb;

public class FixedSalaryEmployee extends Employee {

    private int salary;

    public FixedSalaryEmployee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    int getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "FixedSalaryEmployee{" +
                "salary=" + this.salary +
                " name='" + this.getName() + '\'' +
                '}';
    }
}
