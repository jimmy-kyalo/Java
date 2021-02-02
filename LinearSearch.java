import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] list = { 1, 4, 4, 2, 5, -3, 6, 2 };
        System.out.println("The list contains { 1, 4, 4, 2, 5, -3, 6, 2 }");
        System.out.print("Enter an element in the list to find out its index: ");
        int key = in.nextInt();
        System.out.println("Element " + key + " is found at index " + linearSearch(list, key));
        in.close();
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}