package RA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private int studentAge;
    private boolean studentGender;
    private String address;
    private String phone;

    public Student() {}

    public Student(String studentId, String studentName, int studentAge, boolean studentGender, String address, String phone) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.address = address;
        this.phone = phone;
    }

    public void inputData() {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhập vào mã sinh viên: ");
        this.studentId = src.nextLine();
        System.out.println("Nhập vào tên sinh viên: ");
        this.studentName = src.nextLine();
        System.out.println("Nhập vào tuổi của sinh viên: ");
        this.studentAge = Integer.parseInt(src.nextLine());
        System.out.println("Nhập vào giới tính của sinh viên: ");
        this.studentGender = Boolean.parseBoolean(src.nextLine());
        System.out.println("Nhập vào địa chỉ của sinh viên: ");
        this.address = src.nextLine();
        System.out.println("Nhập vào số điện thoại của sinh viên: ");
        this.phone = src.nextLine();
    }

    public void displayData() {
        System.out.println("Mã sinh viên là: " + this.studentId);
        System.out.println("Tên sinh viên là: " + this.studentName);
        System.out.println("Tuổi sinh viên là: " + this.studentAge);
        System.out.println("Giới tính của sinh viên là: " + (this.studentGender ? "Nam" : "Nữ"));
        System.out.println("Địa chỉ của sinh viên là: " + this.address);
        System.out.println("Số điện thoại của sinh viên là: " + this.phone);
    }

    // Main method
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n--------------------Menu-------------------");
            System.out.println("1. Hiển thị tất cả sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa thông tin dựa trên mã sinh viên");
            System.out.println("4. Xóa học sinh dựa vào mã sinh viên");
            System.out.println("5. Thoát khỏi chương trình\n");
            System.out.print("Bạn vui lòng chọn một trong những chức như trên: ");
            int choose = Integer.parseInt(src.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("Hiển thị tất cả sinh viên là:");
                    for (Student student : students) {
                        student.displayData();
                        System.out.println("--------------------");
                    }
                    break;
                case 2:
                    System.out.println("Thêm mới sinh viên:");
                    Student newStudent = new Student();
                    newStudent.inputData();
                    students.add(newStudent);
                    System.out.println("Thêm mới sinh viên thành công");
                    break;
                case 3:
                    System.out.println("Sửa thông tin dựa trên mã sinh viên: ");
                    System.out.print("Vui lòng nhập mã sinh viên cần sửa: ");
                    String editStudentId = src.nextLine();
                    boolean found = false;
                    for (Student student : students) {
                        if (student.studentId.equals(editStudentId)) {
                            System.out.println("Nhập thông tin mới cho sinh viên: ");
                            student.inputData();
                            System.out.println("Sửa thông tin thành công");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy mã sinh viên: " + editStudentId);
                    }
                    break;
                case 4:
                    System.out.println("Xóa thông tin sinh viên dựa theo mã sinh viên");
                    System.out.print("Vui lòng nhập mã sinh viên để xóa thông tin: ");
                    String deleteStudentId = src.nextLine();
                    boolean foundDelete = false;
                    Iterator<Student> iterator = students.iterator();
                    while (iterator.hasNext()) {
                        Student student = iterator.next();
                        if (student.studentId.equals(deleteStudentId)) {
                            iterator.remove();
                            System.out.println("Xóa sinh viên thành công!");
                            foundDelete = true;
                            break;
                        }
                    }
                    if (!foundDelete) {
                        System.out.println("Không tìm thấy mã sinh viên cần xóa: " + deleteStudentId);
                    }
                    break;

                case 5:
                    System.out.println("Thoát khỏi chương trình.");
                    return;
                default:
                    System.out.println("Tùy chọn không hợp lệ! Vui lòng chọn lại.");
            }
        }
    }
}
