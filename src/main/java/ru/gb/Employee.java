package ru.gb;

public abstract class Employee implements Comparable<Employee> {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract int getSalary();

    @Override
    public int compareTo(Employee o) {
        if (this.getSalary() == o.getSalary()) {
            return this.getName().compareTo(o.getName());
        }
        return Integer.compare(o.getSalary(), this.getSalary());
    }
}
