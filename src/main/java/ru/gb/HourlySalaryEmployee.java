package ru.gb;

public class HourlySalaryEmployee extends Employee {

    private int salaryPerHour;

    public HourlySalaryEmployee(String name, int salaryPerHour) {
        super(name);
        this.salaryPerHour = salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    int getSalary() {
        return (int)(20.8 * 8 * this.salaryPerHour);
    }

    @Override
    public String toString() {
        return "HourlySalaryEmployee{" +
                "salary=" + this.getSalary() +
                " name='" + this.getName() + '\'' +
                '}';
    }
}
