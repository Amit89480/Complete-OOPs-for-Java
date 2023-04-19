abstract class base{
    public void printhello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}


 

class child extends base{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
}


public class AbstractClass {



    public static void main(String[] args){
base obj = new child();
obj.greet();

    }
}