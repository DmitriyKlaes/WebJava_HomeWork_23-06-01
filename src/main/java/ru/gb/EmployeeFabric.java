package ru.gb;

import java.util.List;
import java.util.Random;

public class EmployeeFabric {
    private static final String[] employeeNames = {"Dmitriy", "Ekaterina", "Alexey", "Sergey", "Anna"};
    private static final Random rnd = new Random();

    public static void fillEmployees(List<Employee> listForFill, int amountEmployee) {
        for (int i = 0; i < amountEmployee; i++) {
            listForFill.add(getRandomEmployee());
        }
    }

    public static void fillEmployees(Employee[] arrayForFill) {
        for (int i = 0; i < arrayForFill.length; i++) {
            arrayForFill[i] = getRandomEmployee();
        }
    }

    private static Employee getRandomEmployee() {
        Employee resultEmployee = null;
        int employeeType = rnd.nextInt(2);
        String employeeName = employeeNames[rnd.nextInt(employeeNames.length)];
        int employeeSalary = rnd.nextInt(4, 10);
        switch (employeeType) {
            case 0 -> resultEmployee = new FixedSalaryEmployee(employeeName, employeeSalary * 10000);
            case 1 -> resultEmployee = new HourlySalaryEmployee(employeeName, employeeSalary * 100);
        }
        return resultEmployee;
    }
}
