public class WrapperClass {
  public static void main(String[] args) {
    int num = 34;
    Integer numNew = num; // AutoBoxing
    System.out.println(numNew);

    Integer numWrapped = 45;
    int numSmall = numWrapped; // AutoUnboxing
    System.out.println(numSmall);

    String numStr = "345";
    int val = Integer.parseInt(numStr);
    System.out.println(val*34);
  }
}
