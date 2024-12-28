import java.util.*;
class Display{
    public static void displayS(ArrayList<Student> studList) {
        System.out.println("ID   NAME    MARKS");
        System.out.println("_________________________");
        for (Student stud : studList) {
            System.out.print(stud.getId() + "  ");
            System.out.print(stud.getName() + "  ");
            System.out.println(stud.getMarks());
        }
    }
}