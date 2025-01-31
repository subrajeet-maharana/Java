public class Vehicle {
  String brand = "TATA RIDER";
  String model = "F514";

  public static void main(String[] args) {
    Car myCar = new Car();
    System.out.println(myCar.numberOfDoors);
  }
}

class Car extends Vehicle {
  int numberOfDoors = 4;
}
