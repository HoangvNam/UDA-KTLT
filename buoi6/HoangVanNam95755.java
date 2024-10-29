package buoi6;

import java.util.Scanner;

public class HoangVanNam95755 {
    public static double checkScore() {
        Scanner sc = new Scanner(System.in);
        double score = 0.0;
        while (true) {
            System.out.print("Nhap diem: ");
            String input = sc.nextLine();

            try {
                score = Double.parseDouble(input);
                if (score >= 0.0 && score <= 10.0) {
                    return score;
                }
                else{
                    System.out.println("Diem khong hop le! Vui long nhap lai.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Du lieu khong hop le. Vui long nhap lai dang so thuc!");
            }
        }
    }
    public static int checkAge() {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        while (true) {
            System.out.print("Nhap tuoi: ");
            String input = sc.nextLine();

            try {
                age = Integer.parseInt(input);
                if (age >= 0 && age <= 200) {
                    return age;
                }
                else{
                    System.out.println("Tuoi khong hop le! Vui long nhap lai.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Du lieu khong hop le. Vui long nhap lai dang so nguyen!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten sinh vien: ");
        String name = scanner.nextLine();

        System.out.print("Nhap ngay sinh: ");
        String studentClass = scanner.nextLine();

        double score = checkScore();

        int age = checkAge();

        System.out.printf("\nThông tin sinh viên:\nTen: %s\nNgay sinh: %s\nDiem: %.2f\nTuoi: %d\n",  
                          name, studentClass, score, age);

        scanner.close();
    }
}
