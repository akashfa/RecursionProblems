class Factorial {
    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 6;
        // call the method to calculate factorial
        int calculateFact = calculateFactorial(n);
        System.out.println("Factorial is " + n + " " + "of: " + calculateFact);
    }
}