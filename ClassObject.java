import java.util.Scanner;
class Student{//==>defined as class
    //inside class we need two things
    //1. data(fields)
    String name;
    int rollno;
    String dept;
    char grade;
    //2. methods(properties)
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name: ");
        name=sc.nextLine();
        
        System.out.println("Enter the rollno: ");
        rollno=sc.nextInt();
        sc.nextLine();


        System.out.println("Enter the department: ");
        dept=sc.nextLine();
        
        System.out.println("Enter the grade: ");
        grade=sc.next().charAt(0);
        sc.close();
    }

    void displaydata(){
        System.out.println("The entered details are:");
        System.out.println("Name: "+name);
        System.out.println("Rollno: "+rollno);
        System.out.println("Department: "+dept);
        System.out.println("Grade: "+grade);

    } 
    
}   

public class ClassObject {//Main class
    public static void main(String args[]){//Main method
        Student stu=new Student();
        System.out.println("---------Enter Student Details--------");
        stu.getdata();
        System.out.println("----------Students Details---------");
       stu.displaydata();
    }
    
}
