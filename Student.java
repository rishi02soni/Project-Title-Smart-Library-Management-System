public class Student extends User {
    private int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }
//
    @Override
    public void displayUser() {
        System.out.println("Student: " + name + " | ID: " + studentId);
    }
}
