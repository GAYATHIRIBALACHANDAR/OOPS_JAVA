class Student{
    //data fields
    String name;
    int age;
    //passing the constructor with the values
    Student(String n,int a){
        name=n;
        age=a;

    }
    void displayInfo(){
        System.out.println("Name:"+name+"\nAge:"+age);
    }

}
public class ParameterizedConstructor{
    public static void main(String []args){
        //creating the constructor and the object
        Student s=new Student("Gayathiri",20);
        s.displayInfo();
        
    }
}