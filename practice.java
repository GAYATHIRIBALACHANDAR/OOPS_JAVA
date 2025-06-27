import java.util.Scanner;
class Book{
    String title;
    String author;
    double price;

    void getDetails(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the title of the book: ");
        title =sc.nextLine();
        System.out.println("Enter the author of the book: ");
        author=sc.nextLine();
        System.out.println("Enter the price of the book: ");
        price=sc.nextDouble();
        sc.close();
    }
    void displayDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);

    }

}
public class practice {
    public static void main(String []args){
        Book book=new Book();
        System.out.println("----------Enter the details----");
        book.getDetails();
        System.out.println("----------Display Details-----");
        book.displayDetails();
    }
    
}
