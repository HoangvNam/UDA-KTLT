package buoi4;

import java.util.Scanner;

public class HoangVanNam95755 {
    public static void baiTap4_1(int[] array) {
        System.out.println("Bai tap 4.1:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("arr[%d] = %d   ", i, array[i]);
        }
        System.out.println("\n");
    }

    public static void baiTap4_2(String[] array) {
        System.out.println("Bai tap 4.2:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("nguHanh[%d] = %s   ", i, array[i]);
        }
        System.out.println("\n");
    }

    public static void baiTap4_3(int[][] array) {
        System.out.println("Bai tap 4.3:");
        System.out.print("Cac phan tu cua arr1: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("arr1[%d][%d]   ", i, j);
            }
        }
        System.out.println("\n");
    }

    public static void baiTap4_4(int[][] array) {
        System.out.println("Bai tap 4.4:");
        System.out.print("Cac phan tu cua arr2: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("arr2[%d][%d] = %d   ", i, j, array[i][j]);
            }
        }
        System.out.println("\n");
    }

    public static void print1_n() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Buoi 4 bai tap nang cao. In cac gia tri tu 1 den n:");
        System.out.print("Nhap gia tri n: ");
        int limit = scanner.nextInt();
        System.out.print("Cac gia tri tu 1 den " + limit + " la: ");
        for (int i = 0; i < limit; i++) {
            System.out.print((i + 1) + "   ");
        }
        System.out.println("\n");
    }

    public static void printEven() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Buoi 4 bai tap nang cao. In cac so chan 1 den n :");
        System.out.print("Nhap gia tri n: ");
        int limit1 = scanner1.nextInt();
        System.out.print("Cac so chan tu 1 den " + limit1 + " la: ");
        for (int i = 0; i < limit1; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.print((i + 1) + "   ");
            }
        }
        System.out.println("\n");    
    }

    public static void printOdd() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Buoi 4 bai tap nang cao. In cac so le 1 den n :");
        System.out.print("Nhap gia tri n: ");
        int limit2 = scanner2.nextInt();
        System.out.print("Cac so le tu 1 den " + limit2 + " la: ");
        for (int i = 0; i < limit2; i++) {
            if ((i + 1) % 2 != 0) {
                System.out.print((i + 1) + "   ");
            }
        }
        System.out.println("\n");    
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 10, 14, 25};
        baiTap4_1(arr);

        String[] nguHanh = { "Kim", "Moc", "Thuy", "Hoa", "Tho" };
        baiTap4_2(nguHanh);

        int[][] arr1 = new int[2][3];
        baiTap4_3(arr1);

        int[][] arr2 = {{1,2,3},{4,5,6},{7}};
        baiTap4_4(arr2);

        print1_n();

        printEven();

        printOdd();
    }
}
