//package com.tutorial;
//import java.util.Scanner;
/*
public class Main {
    /*public static void main(String[] args){
        Mahasiswa mahasiswa1 = new Mahasiswa("Ima", 18220054);
        mahasiswa1.show();
        mahasiswa1.setOrg2(16520025, "Soli");
        System.out.println(mahasiswa1.Nama);
        System.out.println(mahasiswa1.NIM);
        /*
        Scanner userInput = new Scanner(System.in);
        int panjang = userInput.nextInt();
        System.out.println("panjang = " + panjang);
        //System.out.println("hello world");
        int lebar = userInput.nextInt();
        System.out.println("lebar = " + lebar);
        int luas = lebar * panjang;
        System.out.println("Luas = " + luas);
        userInput.close();
    }
}
*/
/**
 * Main.java
 * [jelaskan kegunaan file ini]
 * @author [NIM] [Nama]
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