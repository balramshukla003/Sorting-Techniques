class sorting {
    public int[] selectionSorting(int[] arr, int n) {
        int[] Arr = arr;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Arr[i] > Arr[j]) {
                    int temp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = temp;
                }
            }
        }
        return Arr;
    }
}
public class selectionSort {
    public static void main(String[] args) {

        int[] arr = {9, 8, 7, 6, 5, 4, 3};
        int n = 7;

        sorting s = new sorting();
        int[] k = s.selectionSorting(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(k[i]);
        }
    }
}
