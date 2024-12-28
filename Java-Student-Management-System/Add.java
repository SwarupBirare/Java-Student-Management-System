import java.util.*;
class Add{
    public static void addS(ArrayList<Student> studList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nAdd a new student:");
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        studList.add(new Student(id, name, marks));
        System.out.println("Student added successfully!");
    }
}