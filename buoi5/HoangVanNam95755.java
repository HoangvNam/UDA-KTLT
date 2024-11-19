package buoi5;

public class HoangVanNam95755 {
    public static void bai5_1(int number1, int number2) {
        int max = number1 > number2 ? number1 : number2;
        System.out.println("So lon nhat trong hai so la: " + max);
        System.out.println();
    }

    public static void viDu1() {
        System.out.println("Vi Du 1: ");
        int a = 3;
        System.out.println("a++: " + a++);
        System.out.println("++a " + ++a);
        System.out.println("a++ + 1: " + a++ + 1);
        System.out.println("++a + 1: " + ++a + 1);
        System.out.println();
    }

    public static void viDu2() {
        System.out.println("Vi Du 2: ");
        int a = 0, b, c;
        a++;
        b = a;
        c = a++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println();
    }

    public static void viDu3() {
        System.out.println("Vi Du 3: ");
        int a = 0, b, c;
        ++a;
        b = a;
        c = ++a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println();
    }

    public static void viDu4() {
        System.out.println("Vi Du 4: ");
        int a = 0, b, c;
        ++a;
        b = ++a;
        c = b++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println();
    }

    public static void viDu5() {
        System.out.println("Vi Du 5: ");
        int a = 0, b, c;
        ++a;
        b = ++a;
        c = a++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println();
    }

    public static void viDu6() {
        System.out.println("Vi Du 6: ");
        int a = 0, b, c;
        ++a;
        b = ++a;
        c = b++;
        c += c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println();
    }

    public static void main(String[] args) {
        int number1 = 10, number2 = 20;
        bai5_1(number1, number2);
        
        viDu1();
        viDu2();
        viDu3();
        viDu4();
        viDu5();
        viDu6();
    }
}
