class Mobile {
  String name;
  int price;
  static String mobileType;

  Mobile() {
    name = "";
    price = 10000;
    System.out.println("Inside the Constructor");
  }

  static {
    mobileType = "Smart Phone (Constructor Added)";
    System.out.println("Inside the static block");
  }

  public void showDetails() {
    System.out.println("Name: " + name + "| Price: " + price + "| MobileType: " + mobileType);
  }
}

public class StaticClass {
  public static void main(String[] args) throws ClassNotFoundException {
    // main is Static coz otherwise we had to create obj of class to initialize
    // main, and without main the obj can't be created.. Deadlock
    //Mobile m1 = new Mobile();
    //m1.name = "Vivo";
    //m1.price = 16367;
    //m1.mobileType = "Smart Phone";

    //Mobile m2 = new Mobile();
    //m2.name = "Samsung";
    //m2.price = 12467;

    //m2.mobileType = "AI Enabled SmartPhone";
    //m1.showDetails();
    //m2.showDetails();

    //Mobile.mobileType = "SmartPhone"; // Right way to access the static variables
    
    // If no obj is created then static value is not initalized hence we need
    Class.forName("Mobile");
  }
}
