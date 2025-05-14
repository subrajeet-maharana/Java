
interface Computer {

    String org = "Amdocs"; // Equivalent to final and static

    void code(); // Equivalent to public abstract void
}

class Laptop implements Computer {

    public void code() {
        System.out.println("Coding in Laptop");
    }
}

class Desktop implements Computer {

    public void code() {
        System.out.println("Coding in Desktop");
    }
}

class Person {

    public void work(Computer item) {
        item.code();
    }
}

public class Interface {

    public static void main(String[] args) {
        Computer laptop = new Laptop();
        Person subrajeet = new Person();
        subrajeet.work(laptop);
    }
}
