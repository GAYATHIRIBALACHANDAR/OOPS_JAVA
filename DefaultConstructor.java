class Student{
  //object's data
  String name;
  String dept;
  //Default constructor
  Student(){
    name="Gayathiri";
    dept="cse";
  }
  void displaydata(){
    System.out.println("The name is "+name);
    System.out.println("Her department is: "+dept);
  }

}
public class DefaultConstructor {
    public static void main(String[]args){
        //default constructor:
       Student stu=new Student();
       stu.displaydata();
    }
    
}
