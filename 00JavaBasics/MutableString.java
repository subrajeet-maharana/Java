public class MutableString {
  public static void main(String[] args) {
    String nameOne = "Subrajeet";
    String nameTwo = "subrajeet";
    String nameThree = "Subrajeet"; // Here the nameOne and nameThree in Stack points to the same address in heap
                                    // String Constant Pool
    // By default String are immutable, a new location Constant is created in the
    // heap and referenced back to the variable
    // To create Mutable string we use the StringBuffer and StringBuilder
    StringBuffer mutableStr1 = new StringBuffer("SomeValue");
    mutableStr1.insert(mutableStr1.length(), " Added Value");
    System.out.println(mutableStr1);
  }
}
