public class SumArrayValue {
    public static int sum(int arr[], int idx, int n) {

        if (idx == n - 1) {
            return arr[idx];
        }
        return arr[idx] + sum(arr, idx + 1, n);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 3, 2, 1, 2 };
        int n = arr.length;
        System.out.println(sum(arr, 0, n));
    }
}
