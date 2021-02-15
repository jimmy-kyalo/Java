import java.util.*;

public class ProcessPersonArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] person;
        person = new Person[5];

        // create person array
        String name, inpStr;
        int age;
        char gender;

        for (int i = 0; i < person.length; i++) {
            System.out.println("Enter name: ");
            name = scanner.next();

            System.out.println("Enter age: ");
            age = scanner.nextInt();

            System.out.println("Enter gender: ");
            inpStr = scanner.next();
            gender = inpStr.charAt(0);

            person[i] = new Person();
            person[i].setName(name);
            person[i].setAge(age);
            person[i].setGender(gender);

        }
    }
}
