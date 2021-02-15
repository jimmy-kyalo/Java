import java.security.PublicKey;

public class RecursiveSelectionSort {

    public static void sort(double[] list) {
        sort(list, 0, list.length - 1);
    }

    private static void sort(double[] list, int low, int high) {
        // find the smallest number and its index in list[low.. high]
        if (low < high) {
            int indexOfMin = low;
            double min = list[low];
            for (int i = low + 1; i <= high; i++) {
                if (list[i] < min) {
                    min = list[i];
                    indexOfMin = i;
                }
            }

            // swap the smallest in list[low .. high] with list[low]
            list[indexOfMin] = list[low];
            list[low] = min;

            // sort the remaining list[low+1 .. high]
            sort(list, low + 1, high);
        }
    }
}