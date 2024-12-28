import java.util.*;
class Contain{
    public static void checkS(ArrayList<Student> studList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID of the student to check: ");
        int idCheck = sc.nextInt();
        boolean studentFound = false;

        for (Student student : studList) {
            if (student.getId() == idCheck) {
                System.out.println("Student found:");
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Marks: " + student.getMarks());
                studentFound = true;
                break;
            }
        }
        if (!studentFound) {
            System.out.println("Student with ID " + idCheck + " not found.");
        }
    }
}
