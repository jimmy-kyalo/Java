public class TestCourse {

    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Data Systems");

        course1.addStudent("Jimmy Kyalo");
        course1.addStudent("John Doe");
        course1.addStudent("Mary Ann");

        course2.addStudent("Jane Deere");
        course2.addStudent("Peter Parker");

        System.out.println("Number of students in course1: " + course1.getNumerOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumerOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }

        System.out.println();
        System.out.println("Number of students in course2: " + course2.getNumerOfStudents());
    }
}