import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;

 public  class Main{
    static void main(String[] args){

// user input id,name and marks
        int Student_id;
        String Student_name;
        int Student_marks;

         char choice;
        Scanner sc = new Scanner(System.in);
       // user according data input


        do {
            System.out.println("enter student id");
             Student_id = sc.nextInt();

            System.out.println("enter student name");
             Student_name = sc.next();

            System.out.println("enter student marks");
             Student_marks = sc.nextInt();


            System.out.println("Do you want to continue? (y/n)");
            choice = sc.next().charAt(0);
            sc.nextLine();  // buffer clear

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program Ended");

       Student Studentobj  = new Student(Student_id,Student_name,Student_marks);


        ArrayList <Student> list = new ArrayList <>();
        list.add(Studentobj);


        // student information show

        for (Student st : list){

            System.out.println(" student id :" + st.id);
            System.out.println(" student name :" + st.name);
            System.out.println(" student marks :" + st.marks);
            System.out.println(" student grade :" + st.Grade());
        }

        // detele user information

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
}