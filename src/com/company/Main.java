package com.company;

import java.util.Arrays;

public class Main {

    private static Employee [] employees = new Employee[10];

    private static void displayNames(){
        for (Employee employees:employees) {
            System.out.println(employees.getFullName());
        }
    }

    private static void displayEmployees() {
         for (Employee employees : employees) {
              System.out.println(employees);
         }
    }
    private static double salaryMean() {
               return (double) montSalaries()/ employees.length;
        }

    private static  int montSalaries() {
        int monthSalaries = 0;
                for (Employee employees:employees) {
                    monthSalaries += employees.getSalary();
                }
                        return  monthSalaries;
    }
    private static Employee employeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        for (Employee employees:employees) {
            if (employeeWithMinSalary == null || employees.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employees;
            }
        }
         return employeeWithMinSalary;
    }

    private static Employee employeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        for (Employee employees:employees) {
            if (employeeWithMaxSalary == null || employees.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employees;
            }
        }
        return employeeWithMaxSalary;
    }




    public static void main(String[] args) {

        employees[0] = new Employee("Горецких Виталий Николаевич", 2, 34_640);
        employees[1] = new Employee("Левадная Ксения Борисовна", 3, 69_500);
        employees[2] = new Employee("Кургузикова Александра Глебовна", 2, 48_020);
        employees[3] = new Employee("Ахматов Алмаз Нурсултанович", 5, 92_392);
        employees[4] = new Employee("Сазанов Григорий Петрович", 3, 69_599);
        employees[5] = new Employee("Бодрикова Снежанна Робертовна", 4, 80_800);
        employees[6] = new Employee("Тяжких Георгий Юрьевич", 1, 17_929);
        employees[7] = new Employee("Озорных Евгений Тимофеевич", 2, 40_200);
        employees[8] = new Employee("Каримова Надежда Георгиевна", 1, 24_444);
        employees[9] = new Employee("Ротшильд Стас Ефимович", 5, 154_223);

         displayEmployees();
        System.out.println("Сумма зарплат всех сотрудников = " + montSalaries());
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeWithMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой: "  + employeeWithMaxSalary());
        System.out.println("Средняя зарплата сотрудника = " + salaryMean());
        displayNames();
    }
    }


