import java.util.Scanner;
class Student{
    String name;
    int age;
    String dept;
    char grade;
    //parameterized constructor
    Student(String name,int age,String dept,char g){
        this.name=name;
        this.age=age;
        this.dept=dept;
        this.grade=g;

    }
    void show(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Department: "+dept);
        System.out.println("Grade: "+grade);

    }

}
public class thisKeyword {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("--------------Enter the student details--------");
        System.out.println("Enter the name: ");
        String name= sc.nextLine();

        System.out.println("Enter the age: ");
        int age= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the department: ");
        String dept=sc.nextLine();

        System.out.println("Enter the Grade: ");
        char grade=sc.next().charAt(0);

        Student s=new Student(name,age,dept,grade);//parameter passing
       System.out.println("-------------The Entered details are:----------");
        s.show();
        sc.close();

    }

    
}

