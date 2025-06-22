public class MVCPatternTest {
    public static void main(String[] args) {
        Student model = new Student("John", "101", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}