package kyu6;

public class DigitalRoot {
    public static int digital_root(int n) {
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }

    // Digital Root 최적화
    public static int solution1(int n) {
        return (n == 0) ? 0 : 1 + (n - 1) % 9;
    }

    public static int solution2(int n) {
        while (n > 9) {
            n = n / 10 + n % 10;
        }
        return n;
    }

    public static int solution3(int n) {
        return n < 10 ? n : digital_root(digital_root(n / 10) + n % 10);
    }

}
