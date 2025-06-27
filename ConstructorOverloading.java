/*-------CONSTRUCTOR OVERLOADING--------
Creating multiple constructors in the same class with the name but different parameters
 * 
 */
class Book{
    //data--- fields
    String title;
    String author;
    double price;
    int pages;
    //defaut constructor
    Book(){
         title="Not Available";
         author="Unknown";
         price=0.0;
         pages=0;
    }
    Book(String t,String author){
        this.title=t;
        this.author=author;
        price=0.0;
        pages=0;
    }
    Book(String n,String a,double p,int pa){
        this.title=n;
        this.author=a;
        this.price=p;
        this.pages=pa;
    }
    void display(){
        System.out.println("Title: "+title+"\nAuthor: "+author+ "\nPrice: "+price+"\nPages: "+pages);
    }
}

public class ConstructorOverloading {
    public static void main(String []args){
    
        Book book= new Book();//default constructor
    System.out.println("By using the default constructor:");
    book.display();
    System.out.println("---------------------------------------------");
    
    Book book1=new Book("Java Mastery","Gayathiri");
    System.out.println("By using the 2 parameters");
    book1.display();
     System.out.println("---------------------------------------------");
    
     Book book2=new Book("Python Basics","Kiruba",399.0,240);
      System.out.println("By using all parameters");
    book2.display();
    }
    
}
// By using the default constructor:
// Title: Not Available
// Author: Unknown
// Price: 0.0
// Pages: 0
// ---------------------------------------------
// By using the 2 parameters
// Title: Java Mastery
// Author: Gayathiri
// Price: 0.0
// Pages: 0
// ---------------------------------------------
// By using all parameters
// Title: Python Basics
// Author: Kiruba
// Price: 399.0
// Pages: 240