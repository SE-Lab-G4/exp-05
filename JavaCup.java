import java.util.ArrayList;
import java.util.Scanner;

public class JavaCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press number1: ");
        int i = scanner.nextInt();
        System.out.println("Press number2: ");
        int j = scanner.nextInt();
        System.out.println("Press number3: ");
        int k = scanner.nextInt();
        temp();
        eval(i, j, k);
    }

    public static void eval(int i, int j, int k) {
        if (i * i + j * j == k * k || i * i == j * j + k * k || j * j == i * i + k * k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void temp() {
        int row = 10000;
        int col = 20000;

        ArrayList<Integer> a = new ArrayList<>(row * col); // Preallocate

        for (int i = 0; i < row; ++i) {
            int base = i;
            for (int j = 0; j < col; ++j) {
                a.add(base + j);
            }
        }
    }

}

