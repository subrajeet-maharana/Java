abstract class Shape {
  abstract void calculateArea();
}

class Circle extends Shape {
  int radius;

  Circle(int radius) {
    this.radius = radius;
  }

  void calculateArea(){
    System.out.println("Area is: " + 3.14*radius*radius);
  }
}

public class Abstraction {
  public static void main(String[] args){
    Circle c1 = new Circle(7);
    c1.calculateArea();
  }
}
