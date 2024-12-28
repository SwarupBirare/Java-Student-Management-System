import java.util.*;
class Remove{
    public static void removeS(ArrayList<Student> studList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID of the student to remove: ");
        int idRemove = sc.nextInt();
        boolean studentFound = false;
        for (int i = 0; i < studList.size(); i++) {
            if (studList.get(i).getId() == idRemove) {
                studList.remove(i);
                System.out.println("Student with ID " + idRemove + " removed successfully!");
                studentFound = true;
                break;
            }
        }
        if (!studentFound) {
            System.out.println("Student with ID " + idRemove + " not found.");
        }
    }
}
