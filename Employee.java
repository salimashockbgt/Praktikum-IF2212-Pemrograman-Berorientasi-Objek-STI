//package com.tutorial;

/**
 * Employee.java
 * Kelas ini untuk mengidentifikasi employee sesuai dengan atribut dan fungsi yg diperintahkan
 * @author [18220054 Salimatussholati Az Zahra]
 */

public class Employee {
    private static int employeeCount;

    private String name;
    private double baseSalary;

    /**
     * Konstruktor
     * @param name
     * @param baseSalary
     */
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        employeeCount = employeeCount + 1;
    }

    /**
     * Menambahkan gaji pegawai
     * @param amount jumlah peningkatan, asumsi amount >= 0
     */
    public void increaseSalary(double amount) {
        this.baseSalary = this.baseSalary + amount;
    }

    /**
     * Getter name
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter baseSalary
     * @return baseSalary
     */
    public double getBaseSalary() {
        return this.baseSalary;
    }

    /**
     * @return jumlah karyawan
     */
    public static int getEmployeeCount() {
        return employeeCount;
    }
}