package buoi2;

import java.util.Scanner;

public class HoangVanNam95755 {
    public static void main(String[] args) {
        String className = "AI21A1A";
        System.out.printf("Xin chao cac ban tan sinh vien lop %s%n", className);

        int num1 = 10;
        double num2 = 5.5;
        System.out.printf("Gia tri cua num1 la %d%n", num1);
        System.out.printf("Gia tri cua num1 la %.1f%n", num2);

        Scanner sc = new Scanner(System.in);
        System.out.print("Lop: ");
        String newClassName = sc.nextLine();
        System.out.println("Xin chao cac ban tan sinh vien\nlop: " + newClassName);

        System.out.print("Nhap so thu tu: ");
        int soThuTu = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Nhap ho va ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap lop: ");
        String newClassName2 = sc.nextLine();

        System.out.println(soThuTu + " " + hoTen + " " + newClassName2);
    }
}
