package RA;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Student7 {
    private int studentId;
    private String studentName;
    private boolean sex;
    private String className;
    private int age;
    private String address;

    public Student7(int studentId, String studentName, boolean sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public Student7() {

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputData() {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        this.studentId = Integer.parseInt(src.nextLine());
        System.out.println("Nhập tên sinh viên: ");
        this.studentName = src.nextLine();
        System.out.println("Nhập giới tính sinh viên: ");
        this.sex = Boolean.parseBoolean(src.nextLine());
        System.out.println("Nhập vào lớp của sinh viên đó: ");
        this.className = src.nextLine();
        System.out.println("Nhập tuổi sinh viên: ");
        this.age = Integer.parseInt(src.nextLine());
        System.out.println("Nhập vào địa chỉ của sinh viên đó: ");
        this.address = src.nextLine();
    }

    public void displayData() {
        System.out.println("Mã sinh viên là : " + this.studentId);
        System.out.println("Tên sinh viên là : " + this.studentName);
        System.out.println("Giới tính sinh viên là : " + (this.sex ? "Nam" : "Nữ"));
        System.out.println("Lớp của sinh viên là : " + this.className);
        System.out.println("Tuổi của sinh viên là : " + this.age);
        System.out.println("Địa chỉ của sinh viên là: " + this.address);
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        ArrayList<Student7> students = new ArrayList<>();

        while (true) {
            System.out.println("\n--------------------Menu-------------------");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3.Update sinh viên theo mã sinh viên");
            System.out.println("4.Xóa sinh viên theo mã sinh viên");
            System.out.println("5.Thoát khỏi chương trình");
            System.out.println("Chọn chức năng: ");

            int choose = Integer.parseInt(src.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Hiển thị danh sách sinh viên :\n");
                    for(Student7 student : students) {
                        student.displayData();
                        System.out.println("--------------------");
                    }
                    break;

                case 2:
                    System.out.println("Thêm mới sinh viên");
                    Student7 newStudent = new Student7();
                    newStudent.inputData();
                    students.add(newStudent);
                    System.out.println("Thêm sinh viên thành công");
                    break;
                case 3:
                    System.out.println("Update sinh viên theo mã sinh viên");
                    int updateStudentId = Integer.parseInt(src.nextLine());
                    boolean found = false;
                    for(Student7 student : students) {
                        if(student.getStudentId() == updateStudentId) {
                            System.out.println("Nhập mới cho sinh viên");
                            student.inputData();
                            System.out.println("Update sinh viên thành công");
                            found = true;
                            break;
                        }
                    }
                    if(!found) {
                        System.out.println("Không tìm thấy mã sinh viên");
                    }
                    break;
                case 4 :
                    System.out.println("Xóa sinh viên theo mã sinh vien");
                    System.out.println("Nhập mã sinh viên mà bạn muốn xóa");
                    int deleteStudentId = Integer.parseInt(src.nextLine());
                    boolean result = false;
                    Iterator<Student7> iterator = students.iterator();
                    while(iterator.hasNext()) {
                        Student7 student = iterator.next();
                        if(student.getStudentId() == deleteStudentId) {
                            iterator.remove();
                            System.out.println("Xóa sinh viên thành công");
                            result = true;
                            break;
                        }
                    }
                    if(!result) {
                        System.out.println("Không tìm thấy mã sinh viên để xóa");
                    }
                    break;
                case 5 :
                    System.out.println("Thoát khỏi chương trình");
                    return;
                default:
                    System.err.println("Nhập sai chương trình vui lòng nhập lại");
            }
        }
    }
}
