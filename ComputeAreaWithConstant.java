import java.util.*;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        double radius = scanner.nextDouble();

        double area = radius * radius * PI;

        System.out.println("The area is " + area);
        scanner.close();
    }
}