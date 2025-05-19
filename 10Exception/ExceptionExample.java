
public class ExceptionExample {

    public static void main(String[] args) {
        int i = 0;
        String val = null;
        int nums[] = new int[5];

        try {
            // int j = 34 / i;
            System.out.println(val.length());
            // System.out.println(nums[5]);
        } catch (ArithmeticException e) {
            System.out.println("Can't be divided by zero. Error:" + e);
        } catch (NullPointerException e) {
            System.out.println("Can't print the null string. Error:" + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds. Stay in your limits...  Error:" + e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
