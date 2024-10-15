public class Demo {
    public static void main(String[] args) {
        int c[][][] = {
            {{5, 2, 3}, {4, 5, 6, 8}, {7, 7}},
            {{5, 6, 7, 3}, {8, 9}}
        };

        // Duyệt qua từng phần tử của mảng 3 chiều
        for (int i = 0; i < c.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < c[i].length; j++) {
                System.out.print("Row " + (j + 1) + ": ");
                for (int k = 0; k < c[i][j].length; k++) {
                    System.out.print(c[i][j][k] + " ");
                }
                System.out.println(); // Xuống dòng sau mỗi hàng
            }
            System.out.println(); // Xuống dòng sau mỗi layer
        }
    }
}
