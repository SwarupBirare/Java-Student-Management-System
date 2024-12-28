import java.util.*;
class App{
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		ArrayList<Student> studList=new ArrayList<Student>(); 
		studList.add(new Student(1,"Ajay",55));   
		studList.add(new Student(2,"Sujay",65));
		studList.add(new Student(3,"Romit",75));
		studList.add(new Student(4,"Rohit",85));
		studList.add(new Student(5,"Tejas",95));
		while(true){
		System.out.println("------------------------------------");
		System.out.println("1.Add");
		System.out.println("2.Remove");
		System.out.println("3.Contain");
		System.out.println("4.Display");
		System.out.println("5.Exit");
		System.out.println("------------------------------------");
		System.out.print("Select choice: ");
		int choice=sc.nextInt();
		System.out.println("------------------------------------");
		switch(choice)
		{
		case 1:	System.out.println("Adding...");
			 	Add.addS(studList);
			break;
		case 2: System.out.println("Removing...");
				Remove.removeS(studList);
			break;
		case 3: System.out.println("Checking...");
				Contain.checkS(studList);
			break;
		case 4: System.out.println("Displaying...");
				Display.displayS(studList);
			break;
		case 5: System.out.println("Exiting...");
                sc.close();
                System.exit(0);
            break;
        default: System.out.println("Invalid input try again");
        }
		}
	}
}
