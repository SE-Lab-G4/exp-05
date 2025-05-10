import java.util.Scanner;

public class Optimized {
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

        if (1_000_000 >= 2) {
            count++;  // 2 is prime
        }

        for (int i = 3; i < 1_000_000; i += 2) {
            boolean isPrime = true;
            int sqrt = (int) Math.sqrt(i);  // optimize: calculate sqrt once

            for (int j = 3; j <= sqrt; j += 2) {  // only odd divisors
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

