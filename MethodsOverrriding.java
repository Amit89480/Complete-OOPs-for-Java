class A{
    int a;

    public void method1(){
        System.out.println("hello I am Class A method 1");
    }

    
    public void method2(){
        System.out.println("hello I am Class A method 2");
    }
}

class B extends A{
    int b;

    public void method1(){
        System.out.println("hello I am Class B method 1");
    }

    @Override
    public void method2(){
        System.out.println("hello I am Class B method 2");
    }
}


public class MethodsOverrriding {
    public static void main(String[] args) {
        A a=new A();
        a.method2();

        B b = new B();
        b.method2();
        
    }
}
