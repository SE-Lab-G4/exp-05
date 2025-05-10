
### نسخه بهینه‌شده:

```java
public static void findPrimes() {
    int count = 0;

    if (1_000_000 >= 2) {
        count++;  // 2 is prime
    }

    for (int i = 3; i < 1_000_000; i += 2) {
        boolean isPrime = true;
        int sqrt = (int) Math.sqrt(i);

        for (int j = 3; j <= sqrt; j += 2) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) count++;
    }

    System.out.println("Primes found: " + count);
}
```
![پروفایل findPrimes](./images/4.png)

### نتایج نهایی

پس از اعمال بهینه‌سازی:
- زمان اجرای کلی کاهش یافت.
- مصرف CPU تابع `()findPrimes` کمتر شد.

---

