package ru.gb;

import java.util.Iterator;

public class EmployeeRepository implements Iterable<Employee> {

    private Employee[] employees;

    public EmployeeRepository(int amountEmployee) {
        this.employees = new Employee[amountEmployee];
    }

    public EmployeeRepository(Employee[] arrayEmployee) {
        this.employees = arrayEmployee;
    }

    public void randomFillEmployeesRepository() {
        EmployeeFabric.fillEmployees(employees);
    }

    @Override
    public Iterator<Employee> iterator() {
        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < employees.length;
            }

            @Override
            public Employee next() {
                return employees[index++];
            }
        };
    }
}
