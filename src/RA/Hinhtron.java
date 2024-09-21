package RA;

import java.util.Scanner;

public class Hinhtron {
    Scanner src = new Scanner(System.in);
    private final float PI = 3.14F;
    private int radius;
    private String color;

    public Hinhtron(){}
    public Hinhtron(int radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void inputData(){
        System.out.println("Nhập vào bán kinh của đường tròn: ");
        this.radius = Integer.parseInt(src.nextLine());
        System.out.println("Nhập vào màu săc của đường tròn: ");
        this.color= src.nextLine();
    }
    public float periMeter() {
        return 2 * PI * radius;
    }
    public float getArea(){
        return PI * radius * radius;
    }
    public void displayData(){
        System.out.println("Bán kính của đường tròn là : " +radius);
        System.out.println("Màu sắc của đường tròn là : " +color);
        System.out.println("Chu vi của đường tròn là : " +periMeter());
        System.out.println("Diện tích của đường tròn là : " +getArea());
    }
    public static void main(String[] args) {
        Hinhtron lb1 = new Hinhtron();
        lb1.inputData();
        lb1.displayData();
    }
}
