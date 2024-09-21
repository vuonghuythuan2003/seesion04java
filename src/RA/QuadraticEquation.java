package RA;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.sqrt(delta)) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta)) / (2 * a);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Vui long nhap he so a: ");
        double a = Double.parseDouble(src.nextLine());
        System.out.println("Vui long nhap he so b: ");
        double b = Double.parseDouble(src.nextLine());
        System.out.println("Vui long nhap he so c: ");
        double c = Double.parseDouble(src.nextLine());
        QuadraticEquation lb3 = new QuadraticEquation(a, b, c);
        double delta = lb3.getDiscriminant();
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt : ");
            System.out.println("Nghiệm thứ nhất là : " + lb3.getRoot1());
            System.out.println("Nghiệm thứ hai là : " + lb3.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có 1 nghiêm duy nhất là : " + lb3.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiêm");
        }

    }
}
