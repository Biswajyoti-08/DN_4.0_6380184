 public class Main {
    public static void main(String[] args) {
        Student model = new Student("Papun", "3331", "S");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Payal");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}

