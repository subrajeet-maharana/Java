class Student {
  String name;
  int marks;
  float rollNo;

  public int getMarks() {
    return marks;
  }
}

public class JavaBasics {
  public static void main(String[] args) {
    // Type declarations
    byte byteVal = 10;
    short shortVal = 1000;
    int intVal = 100000;
    long longVal = 1000000000L;
    float floatVal = 123.45f;
    double doubleVal = 123456.789;
    char charVal = 'Z';
    boolean boolVal = true;

    // Print values and limits
    System.out.println("=== PRIMITIVE VALUES AND LIMITS ===");
    System.out.println("byteVal: " + byteVal + " (Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
    System.out.println("shortVal: " + shortVal + " (Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
    System.out.println("intVal: " + intVal + " (Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");
    System.out.println("longVal: " + longVal + " (Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");
    System.out.println("floatVal: " + floatVal + " (Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");
    System.out.println("doubleVal: " + doubleVal + " (Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");
    System.out.println(
        "charVal: " + charVal + " (Range: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE + ")");
    System.out.println("boolVal: " + boolVal);

    // Type conversions
    System.out.println("\n=== TYPE CONVERSIONS ===");
    // Widening
    int widenedByte = byteVal; // byte to int
    long widenedInt = intVal; // int to long
    float widenedLong = longVal; // long to float
    double widenedFloat = floatVal; // float to double

    System.out.println("Widening byte to int: " + widenedByte);
    System.out.println("Widening int to long: " + widenedInt);
    System.out.println("Widening long to float: " + widenedLong);
    System.out.println("Widening float to double: " + widenedFloat);

    // Narrowing (with casting)
    byte narrowedInt = (byte) intVal; // int to byte
    int narrowedLong = (int) longVal; // long to int
    float narrowedDouble = (float) doubleVal; // double to float

    System.out.println("Narrowing int to byte: " + narrowedInt); // Possible data loss
    System.out.println("Narrowing long to int: " + narrowedLong); // Possible data loss
    System.out.println("Narrowing double to float: " + narrowedDouble); // Possible loss of precision

    // Type promotion in expressions
    System.out.println("\n=== TYPE PROMOTION ===");
    byte b1 = 10;
    byte b2 = 20;
    int promotedSum = b1 + b2; // Result promoted to int

    float f = 10.5f;
    int i = 5;
    float promotedResult = f * i; // i is promoted to float

    System.out.println("Promoted byte + byte = int: " + promotedSum);
    System.out.println("Promoted float * int = float: " + promotedResult);

    // Complex promotion
    double complexResult = byteVal + shortVal * floatVal / charVal - longVal;
    System.out.println("Complex promotion result: " + complexResult);

    // Using literals
    System.out.println("\n=== LITERALS ===");
    int decimalLiteral = 123;
    int octalLiteral = 0173;
    int hexLiteral = 0x7B;
    int binaryLiteral = 0b1111011;

    System.out.println("Decimal literal: " + decimalLiteral);
    System.out.println("Octal literal: " + octalLiteral);
    System.out.println("Hex literal: " + hexLiteral);
    System.out.println("Binary literal: " + binaryLiteral);

    // Floating-point literals
    double d1 = 123.456;
    double d2 = 1.23456e2;
    float f1 = 123.456f;

    System.out.println("Double literal: " + d1);
    System.out.println("Scientific notation: " + d2);
    System.out.println("Float literal: " + f1);

    // Loops
    System.out.println("\n=== LOOPS DEMO ===");

    // while loop
    System.out.println("While loop:");
    int whileCounter = 1;
    while (whileCounter <= 3) {
      System.out.println("  While iteration: " + whileCounter);
      whileCounter++;
    }

    // do-while loop
    System.out.println("\nDo-While loop:");
    int doCounter = 1;
    do {
      System.out.println("  Do-While iteration: " + doCounter);
      doCounter++;
    } while (doCounter <= 3);

    // for loop
    System.out.println("\nFor loop:");
    for (int forCounter = 1; forCounter <= 3; forCounter++) {
      System.out.println("  For iteration: " + forCounter);
    }

    // for-each loop
    System.out.println("\nFor-Each loop:");
    int[] numbersArray = { 1, 2, 3 };
    for (int number : numbersArray) {
      System.out.println("  Array element: " + number);
    }

    // break and continue
    System.out.println("\nBreak and Continue:");
    for (int j = 1; j <= 5; j++) {
      if (j == 2) {
        System.out.println("  Skipping 2 (continue)");
        continue;
      }
      if (j == 4) {
        System.out.println("  Breaking at 4 (break)");
        break;
      }
      System.out.println("  Value: " + j);
    }

    // nested loops with label
    System.out.println("\nNested loops with label:");
    outerLoop: for (int x = 1; x <= 3; x++) {
      for (int y = 1; y <= 3; y++) {
        if (x * y > 4) {
          System.out.println("  Breaking outer loop when x=" + x + ", y=" + y);
          break outerLoop;
        }
        System.out.println("  x=" + x + ", y=" + y + ", product=" + (x * y));
      }
    }

    System.out.println("\n=== Jagged 2D Array with Enhanced For Loop ===");
    // Jagged Array
    int nums[][] = new int[4][];
    nums[0] = new int[3];
    nums[1] = new int[6];
    nums[2] = new int[4];
    nums[3] = new int[8];
    for (int k = 0; k < nums.length; ++k) {
      for (int j = 0; j < nums[k].length; ++j) {
        nums[k][j] = (int) (Math.random() * 100);
      }
    }

    for (int n[] : nums) {
      for (int m : n) {
        System.out.print(m + " ");
      }
      System.out.println();
    }

    System.out.println("\n=== Array of Objects ===");
    Student s1 = new Student();
    s1.name = "Mrunal Thakur";
    s1.marks = 52;
    s1.name.replace("a", "x");

    Student s2 = new Student();
    s2.name = "Meenakshi Choudhary";
    s2.marks = 99;

    Student s3 = new Student();
    s3.name = "Yami Gautam";
    s3.marks = 100;

    Student students[] = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    for (Student stud : students) {
      System.out.println("Name: " + stud.name + " --> Marks: " + stud.getMarks());
    }
  }
}
