

/**
 * Main.java
 * [jelaskan kegunaan file ini]
 * @author [18220054] [Salimatussholati Az Zahra]
 */
import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        double baseSalary = scanner.nextDouble();
        double currentPoints = scanner.nextDouble();
        double targetPoints = scanner.nextDouble();
        Employee employee = new Employee(name, baseSalary);
        EmployeePerformance empPer = new EmployeePerformance(employee, currentPoints, targetPoints);
        if (empPer.isPromotable() == true) {
            System.out.println("YES");
            System.out.printf("%.2f\n", empPer.getCurrentSalary());
        } else {
            System.out.println("NO");
            System.out.printf("%.2f\n", 2*targetPoints - currentPoints);
        }
    }
}
