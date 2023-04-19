class Student {
    String name;
    int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void getDetails() {
        System.out.println(this.name);
        System.out.println(this.roll);
    }
}

public class WorkingWithConstructor {
    public static void main(String[] args) {
        Student Amit = new Student("Amit Pandey",42);
        Amit.getDetails();

    }

}
