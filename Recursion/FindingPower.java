public class FindingPower {
    public static int power(int a, int b) {
        if (b == 0)
            return 1;
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        // calling mathod calculate power

        int pow = power(a, b);
        System.out.println(a + " to power " + b + " is " + pow);
    }

}
