//demontrating interface

interface speedUp {
    void speed();
}

interface Brakes {
    void Brake();
}

class car implements speedUp, Brakes {
    public void speed() {
        System.out.println("Speeding up");
    }

    public void Brake() {
        System.out.println("Braking");
    }
}

public class Interface {
    public static void main(String[] args) {
        car c = new car();
        c.speed();
        c.Brake();
    }

}
