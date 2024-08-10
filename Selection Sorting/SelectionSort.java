class sorting {
    public int[] selectionSorting(int[] arr, int n) {

        int[] Arr = arr;

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {

                if (Arr[j] > Arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = Arr[minIndex];
            Arr[minIndex] = Arr[i];
            Arr[i] = temp;

        }
        return Arr;
    }
}
public class selectionSort {
    public static void main(String[] args) {

        int[] arr = {9, 8, 7, 11, 5, 15, 10};
        int n = 7;

        sorting s = new sorting();
        int[] k = s.selectionSorting(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(k[i]+" ");
        }
    }
}
