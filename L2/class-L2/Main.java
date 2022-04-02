public class Main {
    public static void main(String[] args) {
        System.out.println("Roles: ");

        Student student = new Student();
        student.role();

        Teacher teacher = new Teacher();
        teacher.role();

        Employee employee = new Employee();
        employee.role();
    }
}
