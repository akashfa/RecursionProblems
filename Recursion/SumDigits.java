public class SumDigits {
    public static int digitSum(int n) {
        if (n <= 9)
            return n;
        int a = digitSum(n % 10);
        int b = digitSum(n / 10);
        return a + b;
    }

    public static void main(String[] args) {
        int n = 12345;
        // calling method sum of digit
        int sum = digitSum(n);
        System.out.println("Digits " + n + "  of sum is :" + sum);
    }
}
