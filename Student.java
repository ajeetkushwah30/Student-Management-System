import java.lang.String;
public class Student{
    int id;
    String name;
    int marks;

    Student(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    public void Show() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(marks);

    }

    public String Grade(){
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else {
            return "D";
        }
    }
}
