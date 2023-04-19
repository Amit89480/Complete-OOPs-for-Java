class Myemployee {
    private String name;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int Id) {
        id = Id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}

class CreatingClass {

    public static void main(String args[]) {
        Myemployee Amit=new Myemployee();
        Amit.setName("Amit Pandey");
        Amit.setId(89445);
        System.out.println(Amit.getName());
        System.out.println(Amit.getId());
    }
}