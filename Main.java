import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;

public  class Main{
    static void main(String[] args) {

// user input id,name and marks
        int Student_id;
        String Student_name;
        int Student_marks;

        char choice;
        char repeated;
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<>();
        // user according data input

        // System.out.println("4.exite program");

        do {
            System.out.println("follow to intrasction...");
            System.out.println("1.insert data");
            System.out.println("2.view data");
            System.out.println("3.delete data");

            int steps = sc.nextInt();
            if (steps == 1) {
                do {
                    System.out.println("enter student id");
                    Student_id = sc.nextInt();

                    System.out.println("enter student name");
                    Student_name = sc.next();

                    System.out.println("enter student marks");
                    Student_marks = sc.nextInt();

                    // create object
                    Student Studentobj = new Student(Student_id, Student_name, Student_marks);
                    list.add(Studentobj);

                    System.out.println("Do you want to continue? (y/n)");
                    choice = sc.next().charAt(0);
                    sc.nextLine();  // buffer clear

                } while (choice == 'y' || choice == 'Y');
                System.out.println("Program Ended");

            } else if (steps == 2) {
                // student information show
                for (Student st : list) {
                    System.out.println(st.id + "," + st.name + "," + st.marks + "," + st.Grade());
                }
            }
            // detele user information

            else if (steps == 3) {


                System.out.print("Enter ID to delete: ");
                int deleteId = sc.nextInt();
                boolean found = false;

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).id == deleteId) {
                        list.remove(i);
                        found = true;
                        System.out.println("Student deleted successfully.");
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found.");
                }

            }
            System.out.println("Do you want to Exite (y/n)");
            repeated = sc.next().charAt(0);
            sc.nextLine();  // buffer clear
        }
        while (repeated == 'n' || repeated == 'N');
        System.out.println("Program Ended");

    }
}
