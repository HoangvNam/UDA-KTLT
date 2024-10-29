package buoi3;

import java.util.Scanner;

public class HoangVanNam95755 {

    public static void printFunction(int id, String name, String dob, int age, boolean sex, String classes, String major, String adress) {
        System.out.println("ID: " + id);
        System.out.println("Ten: " + name);
        System.out.println("Ngay sinh: " + dob);
        System.out.println("Tuoi: " + age);
        System.out.println("Gioi tinh: " + sex);
        System.out.println("Lop: " + classes);
        System.out.println("Khoa: " + major);
        System.out.println("Dia chi: " + adress);
    }

    public static void printFromKeyboard() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();

        System.out.print("Nhap ngay sinh (dd/mm/yyyy): ");
        String dob = scanner.nextLine();

        System.out.print("Nhap tuoi: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Nhap gioi tinh (true = Nam, false = Nữ): ");
        boolean sex = scanner.nextBoolean();
        scanner.nextLine(); 

        System.out.print("Nhap lop: ");
        String classes = scanner.nextLine();

        System.out.print("Nhap khoa: ");
        String major = scanner.nextLine();

        System.out.print("Nhap dia chi: ");
        String address = scanner.nextLine();


        System.out.println("\n--- Thong tin vua nhap ---");
        System.out.println("ID: " + id);
        System.out.println("Ten: " + name);
        System.out.println("Ngay sinh: " + dob);
        System.out.println("Tuoi: " + age);
        System.out.println("Gioi tinh: " + (sex ? "Nam" : "Nữ")); // Hiển thị Nam nếu true, Nữ nếu false
        System.out.println("Lop: " + classes);
        System.out.println("Khoa: " + major);
        System.out.println("Dia chi: " + address);

        // Đóng scanner sau khi sử dụng
        scanner.close();
    }

    public static void main(String[] args) {
        printFunction(95755, "Nam", "29/01/2003", 21, true, "AI21A1A", "AI", "Da Nang");
        printFromKeyboard();
    }
}
