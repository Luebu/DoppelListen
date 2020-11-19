public class Main {

    public static void main(String[] args) {
        Liste ls = new Liste();
        Person p1 = new Person(1, "Erster");
        Person p2 = new Person(2, "zweiter");
        Person p3 = new Person(3, "dritter");
        Person p4 = new Person(4, "vierter");
        ls.add(p1);
        ls.add(p2);
        ls.add(p3);
        ls.add(p4);
        System.out.println(ls);
        ls.removeN(4);
        System.out.println(ls);
    }
}
