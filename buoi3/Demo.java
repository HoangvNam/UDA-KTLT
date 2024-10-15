import java.util.Scanner;

public class Demo {
    // Bai 1
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

    // Bai 2
    public static void printFunction_002() {
        Scanner scanner = new Scanner(System.in);

        // Nhập các thông tin từ bàn phím
        System.out.print("Nhập ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Dòng này để tránh bị lỗi khi đọc chuỗi sau số nguyên

        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
        String dob = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Tránh lỗi đọc chuỗi tiếp theo

        System.out.print("Nhập giới tính (true = Nam, false = Nữ): ");
        boolean sex = scanner.nextBoolean();
        scanner.nextLine(); // Tránh lỗi đọc chuỗi tiếp theo

        System.out.print("Nhập lớp: ");
        String classes = scanner.nextLine();

        System.out.print("Nhập khoa: ");
        String major = scanner.nextLine();

        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        // In thông tin ra màn hình
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
        // printFunction_002();
    }
}
