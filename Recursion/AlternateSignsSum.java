public class AlternateSignsSum {
    public static int sum(int n) {
        int totleAdd = 0;

        if (n <= 1)
            return n;
        if (n % 2 == 0)
            sum(n - 1);
        return n - sum(n - 1);

    }

    public static void main(String[] args) {
        int n = 5;
        int sumAlternate = sum(n);
        System.out.println("Alternate signs sum: " + sumAlternate);
    }
}
