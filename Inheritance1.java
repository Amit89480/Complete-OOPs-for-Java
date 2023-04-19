class Base {
    String name;

    public void setName(String name) {
        this.name = name;
    }

}

class derieved extends Base {
    int age;
}

public class Inheritance1 {

    public static void main(String[] args) {
        derieved obj = new derieved();
        obj.setName("Amit Pandey");
        System.out.println(obj.name);

    }
}