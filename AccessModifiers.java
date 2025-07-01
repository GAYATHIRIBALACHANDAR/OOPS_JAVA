class Example{
    private int privatevar=10;
    protected int protectedvar=11;
    public int publicvar=13;
    int var=111; //default

    void display(){
        System.out.println("Protected: "+protectedvar);
        System.out.println("Private: "+privatevar);
        System.out.println("Public: "+publicvar);
        System.out.println("Default: "+var);
    }
}

public class AccessModifiers {
    public static void main(String []args){
        Example e=new Example();
      e.display();
//By using the encapsulation method we can access the variable from the outside class 
        System.out.println("Protected: "+e.protectedvar);
        //System.out.println("Private: "+e.privatevar); compile time Error if uncommented
        System.out.println("Public: "+e.publicvar);
        System.out.println("Default: "+e.var);

    }
    
}
