package ru.gb;

//1. Построить три класса (базовый и 2 потомка),
//        описывающих некоторых работников с почасовой оплатой (один из потомков)
//        и фиксированной оплатой (второй потомок).
//а) Описать в базовом классе абстрактный метод для расчёта среднемесячной заработной платы.
//      Для «повременщиков» формула для расчета такова: «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»,
//      для работников с фиксированной оплатой «среднемесячная заработная плата = фиксированная месячная оплата».
//б) Создать на базе абстрактного класса массив сотрудников и заполнить его.
//в) ** Реализовать интерфейсы для возможности сортировки массива
//      (обратите ваше внимание на интерфейсы Comparator, Comparable)
//г) ** Создать класс, содержащий массив сотрудников,
//      и реализовать возможность вывода данных с использованием foreach.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        EmployeeFabric.fillEmployees(employees, 10);
        Collections.sort(employees);

        for (Employee employee : employees) {
            System.out.println(employee);
        }


        EmployeeRepository employeesRepository = new EmployeeRepository(new Employee[10]);
        employeesRepository.randomFillEmployeesRepository();

        for (Employee employee : employeesRepository) {
            System.out.println(employee);
        }
    }
}
