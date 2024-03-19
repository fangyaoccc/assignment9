import java.util.ArrayList;
import java.util.List;

public class EngClass {
    private List<Student> students;
    public EngClass() {
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        this.students.add(student);
    }
    public boolean deleteStudent(int studentId) {
        return students.removeIf(student -> student.getStudentId() == studentId);
    }
    public void printStudents() {
        if (students.isEmpty()) {
            System.out.println("No students");
        } else {
            System.out.println("List of students in class:");
            students.forEach(System.out::println);
        }
    }
}