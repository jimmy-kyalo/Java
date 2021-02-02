
// import java.util.Scanner;
// import java.lang.System;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // * double total = 0;
        // double[] myList = new double[10];
        // double max = myList[0];
        // int indexOfMax = 0;

        // System.out.print("Enter " + myList.length + " values: ");
        // for (int i = 0; i < myList.length - 1; i++) {
        // myList[i] = input.nextDouble();
        // total += myList[i];
        // if (myList[i] > max) {
        // max = myList[i];
        // indexOfMax = i;
        // }
        // int j = (int) (Math.random() * myList.length);

        // double temp = myList[i];
        // myList[i] = myList[j];
        // myList[j] = temp;

        // }
        // System.out.println("Total: " + total + "\nMax: " + max);

        // *! String[] months = { "January", "February", "March", "April", "May",
        // "June",
        // "July", "August", "September",
        // "October", "November", "December" };
        // System.out.print("Enter a month number (1 - 12): ");
        // for (String e : months) {
        // int monthNumber = input.nextInt();

        // System.out.println("The month is " + months[monthNumber - 1]);
        // break;
        // }

        // input.close();

        int[] source = { 1, 2, 3 };
        int[] target = new int[source.length];
        System.arraycopy(source, 0, target, 0, source.length);
        Arrays.stream(target).forEach(System.out::println);
        // printArr(new int[] { 1, 2, 3, 4, 5 });

    }

    // public static void printArr(int[] arr) {
    // Arrays.stream(arr).forEach(System.out::println);
    // }
}

// import java.util.*;

// public class Test {

// public static void main(String[] args) {
// // double[] numbers = { 6.0, 4.4, 1.9, 2.9, 3.4, 3.5 };
// // System.out.println("Unsorted array: " + Arrays.toString(numbers));
// // Arrays.sort(numbers);
// // System.out.println("Sorted array: " + Arrays.toString(numbers));
// // System.out.println("2.9 index is " + Arrays.binarySearch(numbers, 2.9));
// // Arrays.fill(numbers, 0, 3, 1.1);
// // System.out.println(Arrays.toString(numbers));

// Date date = new Date();
// System.out.println("The elapsed time sin Jan 1 1970 is " + date.getTime() + "
// milliseconds.");
// System.out.println(date.toString());
// }
// }