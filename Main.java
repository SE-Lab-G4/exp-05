import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Attach profiler and press enter to start...");
        scanner.nextLine();

        long start = System.currentTimeMillis();
        for (int repeat = 0; repeat < 50; repeat++) {
            findPrimes();
        }
        long end = System.currentTimeMillis();

        System.out.println("Execution time: " + (end - start) + " ms");
    }

    public static void findPrimes() {
        int count = 0;
        for (int i = 2; i < 1_000_000; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++;
        }
        System.out.println("Primes found: " + count);
    }
}

