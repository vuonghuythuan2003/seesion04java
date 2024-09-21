package RA;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Kết quả không tham số getRadius: " + c.getRadius());
        System.out.println("Kết quả không tham số getArea" + c.getArea());

        Circle c1 = new Circle(7);
        System.out.println("Kết quả có tham số getRadius: " + c1.getRadius());
        System.out.println("Kết quả không tham số getArea" + c1.getArea());
    }
}
