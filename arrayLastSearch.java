public class arrayLastSearch {
    static int search(int[] arr, int i, int x) {
        if (i == 0) {

            return 0;
        }
        if (x == arr[i]) {
            return 1;
        }

        search(arr, i - 1, x);
        return i;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 40, 30, 10 };
        int i = arr.length;
        int ans = search(arr, i - 1, 10);
        if (ans == 0) {
            System.out.println("not found");
        } else {
            System.out.println("found");
        }
    }
}
