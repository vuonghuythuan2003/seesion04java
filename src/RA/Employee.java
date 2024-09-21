package RA;

import java.util.Scanner;

public class Employee {
    Scanner src = new Scanner(System.in);
    private String employeeId;
    private String employeeName;
    private int age;
    private boolean gender;
    private double rate;
    private double salary;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, int age, boolean gender, double rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
        this.salary = 0;
    }

    public void inputData() {
        System.out.println("Nhập vào mã của nhân viên: ");
        this.employeeId = src.nextLine();
        System.out.println("Nhập vào tên của nhân viên đó: ");
        this.employeeName = src.nextLine();
        System.out.println("Nhập vào tuổi của nhân viên đó: ");
        this.age = Integer.parseInt(src.nextLine());
        System.out.println("Nhập vào giới tính của nhân viên đó: ");
        this.gender = Boolean.parseBoolean(src.nextLine());
        System.out.println("Nhập vào hệ số lương của nhân viên đó: ");
        this.rate = Double.parseDouble(src.nextLine());
    }

    public double calSalary() {
        return salary = rate * 1300000;
    }

    public void displayData() {
        System.out.println(" Mã của nhân viên là: " + employeeId);
        System.out.println("Tên của nhân viên là : " + employeeName);
        System.out.println("Tuổi của nhân viên là : " + age);
        System.out.println("Giới tính của nhân viên là: " + (gender ? "Nam" : "Nữ"));
        System.out.println("Hệ số lương của nhân viên là: " + rate);
        System.out.println("Lương của nhân viên là: " + String.format("%.0f", salary));
    }

    public static void main(String[] args) {
        Employee lb03 = new Employee();
        lb03.inputData();
        lb03.calSalary();
        lb03.displayData();
    }
}
