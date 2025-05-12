class A extends Object {
  public A() {
    super();
    System.out.println("Inside Default A");
  }

  public A(int val) {
    super();
    System.out.println("Inside Para A");
  }
}

class B extends A {
  public B() {
    super();
    System.out.println("Inside Default B");
  }

  public B(int val) {
    this();
    //super();
    System.out.println("Inside Para B");
  }
}

public class ThisAndSuper {
  public static void main(String[] args) {
    //B obj = new B();
    B newObj = new B(34);
  }
}
