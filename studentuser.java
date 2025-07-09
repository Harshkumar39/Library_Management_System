public public class StudentUser extends User {
    private String studentId;

    public StudentUser(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public void displayUserInfo() {
        System.out.println("Student Name: " + name + ", ID: " + studentId);
    }
}
 {
    
}
