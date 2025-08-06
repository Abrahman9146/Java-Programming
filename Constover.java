public class Constover {
    int roll;
    String name;
    int marks;

    Constover() {
        roll = 91;
        name = "AB";
        marks = 96;
        System.out.println("Roll No: " + roll + " Name: " + name + " Marks: " + marks);
    }

    Constover(int r) {
        roll = r;
        System.out.println("Roll No: " + roll);
    }

    Constover(int r, String n) {
        roll = r;
        name = n;
        System.out.println("Roll No: " + roll + " Name: " + name);
    }

    Constover(int r, String n, int m) {
        roll = r;
        name = n;
        marks = m;
        System.out.println("Roll No: " + roll + " Name: " + name + " Marks: " + marks);
    }

    public static void main(String[] args) {
        Constover c1 = new Constover();
        Constover c2 = new Constover(98);
        Constover c3 = new Constover(76, "ED");
        Constover c4 = new Constover(96, "XY", 42);
    }
}
