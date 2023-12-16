class FibonacciSeries {
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        // calling the method calculate fibonacci
        for (int i = 0; i <= n; i++) {
            int fib = fibonacci(i);
            System.out.println("Fibonacci " + i + " " + "of is: " + fib);
        }
    }
}