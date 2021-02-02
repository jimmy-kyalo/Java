public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numerOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numerOfStudents] = student;
        numerOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumerOfStudents() {
        return numerOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
    }
}