public class T001 {
    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static int sort01(int[] arr) {
        int N = arr.length, p = -1, itr = 0;
        while (itr < N) {
            if (arr[itr] == 0) {
                swap(arr, ++p, itr);
            }
            itr++;
        }

        return p;
    }

    public static void main(String... args) {
        // int[] arr = { 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1 };
        int[] arr = { 0,0,0};
        System.out.println(sort01(arr));
        for(int val : arr) System.out.print(val + " ");
    }
}