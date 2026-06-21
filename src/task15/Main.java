package task15;

import java.util.HashMap;
import java.util.Map;

public class Main {
    // Константа
    private static final String TARGET_PROFESSION = "Плотник";

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Иван", "Петров", 30, 50000);
        Employee emp2 = new Employee(2, "Мария", "Сидорова", 25, 45000);
        Employee emp3 = new Employee(3, "Алексей", "Иванов", 35, 60000);
        Employee emp4 = new Employee(4, "Елена", "Козлова", 28, 48000);
        Employee emp5 = new Employee(5, "Дмитрий", "Смирнов", 40, 70000);
        Employee emp6 = new Employee(6, "Ольга", "Васильева", 32, 55000);
        Employee emp7 = new Employee(7, "Сергей", "Николаев", 38, 65000);
        Employee emp8 = new Employee(8, "Анна", "Фёдорова", 27, 47000);

        Map<Employee, String> employees = new HashMap<>();
        employees.put(emp1, "Плотник");
        employees.put(emp2, "Бухгалтер");
        employees.put(emp3, "Плотник");
        employees.put(emp4, "Маркетолог");
        employees.put(emp5, "Директор");
        employees.put(emp6, "Бухгалтер");
        employees.put(emp7, "Плотник");
        employees.put(emp8, "Маркетолог");

        System.out.println("--- Сотрудники ДО повышения ---");
        printEmployees(employees);


        raiseSalaryForProfession(employees, 200);

        System.out.println("\n--- Сотрудники ПОСЛЕ повышения ---");
        printEmployees(employees);
    }


    private static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease) {
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            Employee employee = entry.getKey();
            String currentProfession = entry.getValue();

            if (currentProfession.equals(TARGET_PROFESSION)) {
                employee.setSalary(employee.getSalary() + amountOfIncrease);
            }
        }
    }

    private static void printEmployees(Map<Employee, String> employees) {
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " | Профессия: " + entry.getValue());
        }
    }
}
