public class Usethiskey {
    int id;
    String name;
    int salary;

    Usethiskey(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Id: "+id + " " + "Name: "+name + " " + "Salary: " +salary);
    }

    public static void main(String args[]) {
        Usethiskey u1 = new Usethiskey(54, "AB", 87000);
        u1.display();

    }

}
