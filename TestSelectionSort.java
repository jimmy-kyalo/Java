public class TestSelectionSort {

    public static void main(String[] args) {
        double[] list = { 1, 9, 4.5, 6.6, 5.7, -4.5 };
        System.out.println("Before selection sort");
        for (double i : list)
            System.out.print("\t" + i + " ");
        System.out.println();
        SelectionSort.selectionSort(list);
        System.out.println("After selection sort");
        for (double i : list)
            System.out.print("\t" + i + " ");
        System.out.println();
    }
}