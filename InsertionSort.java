public class InsertionSort {
    public static void main(String[] args) {
        int[] inputArray = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            inputArray[i] = Integer.parseInt(args[i]);
        }
        for (int i = 1; i < inputArray.length; i++) {
            int key = inputArray[i], j;
            for (j = i - 1; j >= 0;) {
                if (inputArray[j] > key) {
                    inputArray[j + 1] = inputArray[j];
                    j--;
                } else
                    break;
            }
            inputArray[j + 1] = key;
        }
        System.out.print("Sorted array in ascending order: ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
    }
}
