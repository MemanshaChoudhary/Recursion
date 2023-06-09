// check whether the array is sorted or not
public class ArrayisSorted {
    static boolean isSorted(int[] arr, int i) {
        if (arr.length - 1 == i) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;

        }

        return isSorted(arr, i + 1);

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        if (isSorted(arr, 0)) {
            System.out.println("sorted");
        } else {
            System.out.println("not sorted");
        }
    }
}
