class base{
    int x;

    base(){
        System.out.println("I am a base class constructor");
    }

    base(int x){
        System.out.println("I am a base class constructor with argument "+x);
    }
}

class child extends base{
    int y;

    child(){
        System.out.println("I am a child constructor");
    }


    child(int x,int y){
        super(x);
        System.out.println("I am a child class constructor with a value "+y);
    }
}


public class ConstructorInInheritance {
    public static void main(String[] args) {
        // child c= new child();

        child c= new child(80,90);
        
        
    }
}
