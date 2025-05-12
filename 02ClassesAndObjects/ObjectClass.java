class Laptop {
  int price;
  String model;

  @Override
  public String toString() {
    return "Price: " + price + " | Mode: " + model;
  }

  public boolean equals(Laptop other) {
    return this.price == other.price && this.model == other.model;
  }
}

public class ObjectClass {
  public static void main(String[] args) {
    Laptop lap1 = new Laptop();
    lap1.price = 68400;
    lap1.model = "HP Omen";

    Laptop lap2 = new Laptop();
    lap2.price = 68400;
    lap2.model = "HP Omen";

    System.out.println(lap1);
    System.out.println(lap1.toString());
    System.out.println(lap2);
    System.out.println(lap2.toString());

    System.out.println(lap1 == lap2);
    System.out.println(lap1.equals(lap2));
  }
}
