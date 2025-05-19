
interface Adder {

    void add(int i, int j);
}

interface Printer {

    void print(String z);
}

interface ReturnSubtracter {

    int subtract(int i, int k);
}

public class LambdaExpressionExample {

    public static void main(String[] args) {
        Adder addObj = (i, j) -> System.out.println("Addition of " + i + " & " + j + " is: " + (i + j));
        addObj.add(-989, 478721);

        Printer obj = x -> System.out.println("The Text Printed is: " + x);
        obj.print("Subrajeet");

        ReturnSubtracter objSub = (i, j) -> i - j;
        int result = objSub.subtract(56, 34);
        System.out.println("The result is: " + result);
    }
}
