final class FinalClass {
  private int value;
  private String name;

  public int getValue() {
    return value;
  }
}

// class inheritTrial extends FinalClass {
// can't inherit from final class
// }

class PropietaryClass {
  private String methodName;
  private int val;

  public final void showCredits(){
    System.out.println("This Class belongs to subrajeet-maharana");
  }
}

class InheritPropietaryClass extends PropietaryClass {
  //@Override -- can't override
  //public void showCredits(){
  //  System.out.println("This Class belongs to rocky-sarkar");
  //}
}

public class FinalKeyword {
  public static void main(String[] args) {
    final int val = 45;
    //val = 64; can't reassign it
    InheritPropietaryClass obj = new InheritPropietaryClass();
    obj.showCredits();
  }
}
