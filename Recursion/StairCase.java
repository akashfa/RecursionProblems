public class StairCase {
    public static int countStair(int n) {
        if (n <= 1) {
            return n;
        }
        return countStair(n - 1) + countStair(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        // calling method count stair
        int count = countStair(n + 1);
        System.out.println("Stair:" + n + " of is " + count);
    }
}
