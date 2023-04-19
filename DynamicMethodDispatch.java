class A{
    public void greet(){
        System.out.println("In A");
    }

    public void name(){
        System.out.println("I am java");
    }
}

class B extends A{

    public void name(){
        System.out.println("I am python");
    }

    public void music(){
        System.out.println("Playing music.....");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
 

        //Dyanamic method dispatch
A obj= new B();
obj.name();

obj.music();//Not allowed this is called dynamic method dispatch


    }
}