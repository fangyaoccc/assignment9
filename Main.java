public class Main {
    public static void main(String[] args) {
        EngClass engClass = new EngClass();
        engClass.addStudent(new Student(1, "Fred", "Chang"));
        engClass.addStudent(new Student(2, "Joe", "Eric"));
        engClass.addStudent(new Student(3, "Bob", "David"));
        engClass.printStudents();
        System.out.println("After Deleting a student");
        engClass.deleteStudent(2); 
        engClass.printStudents();
    }
}
