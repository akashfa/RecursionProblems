public class MaxValue {
    public static int maxNumber(int arr[], int idx, int n) {
        
        if (idx == n - 1)
            return arr[idx];

        return Math.max(arr[idx], maxNumber(arr, idx + 1, n));

    }

    public static void main(String[] args) {
        int arr[] = { 13, 1, -3, 5, 16 };
        int n = arr.length;

        System.out.println(maxNumber(arr, 0, n));
    }
}
