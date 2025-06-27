import java.util.Scanner;
class Employee{
    //data fields
    String name;
    int EmpId;
    String dept;
    double Salary;
    char Shift;

    Employee(String n,int e,String d,double s,char sh){
        this.name=n;
        this.EmpId=e;
        this.dept=d;
        this.Salary=s;
        this.Shift=sh;
    }
    //copy constructor
     Employee(Employee emp) {
        this.name = emp.name;
        this.EmpId = emp.EmpId;
        this.dept = emp.dept;
        this.Salary = emp.Salary;
        this.Shift = emp.Shift;
    }
    void showdata(){
        System.out.println("Name: "+name+"\nEmpId: "+EmpId+"\nDepartment: "+dept+"\nSalary: "+Salary+"\nShift: "+Shift);
    }


}
public class CopyConstructor {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name=sc.nextLine();

        System.out.println("Enter the Employee Id: ");
        int EmpId=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Department: ");
        String dept=sc.nextLine();

        System.out.println("Enter the salary: ");
        double Salary=sc.nextDouble();
        
        System.out.println("Enter the shift of working(N or D)");
        char Shift=sc.next().charAt(0);

        //creating the constructor:
        Employee e=new Employee(name,EmpId,dept,Salary,Shift);
        Employee e2=new Employee(e); //copied constructor
        e.showdata();
        e2.showdata();
        sc.close();

    }
    
}
