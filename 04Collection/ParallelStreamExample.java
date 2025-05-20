import java.util.*;

public class ParallelStreamExample {
  public static void main(String[] args) {
    int SIZE = 10_000;
    List<Integer> nums = new ArrayList<Integer>();
    Random rnd = new Random();

    for (int i = 0; i < SIZE; ++i) {
      nums.add(rnd.nextInt(1000));
    }

    // System.out.println(nums);

    long startStream = System.currentTimeMillis();
    int sum1 = nums.stream()
        .map(i -> {
          try {
            Thread.sleep(1);
          } catch (Exception e) {
            // TODO: handle exception
          }
          return i * 2;
        })
        .mapToInt(i -> i)
        .sum();
    long endStream = System.currentTimeMillis();

    long startParStream = System.currentTimeMillis();
    int sum2 = nums.parallelStream()
        .map(i -> {
          try {
            Thread.sleep(1);
          } catch (Exception e) {
            // TODO: handle exception
          }
          return i * 2;
        })
        .mapToInt(i -> i)
        .sum();
    // int sum2 = nums.parallelStream().map(n -> n * 2).mapToInt(n -> n).sum();
    long endParStream = System.currentTimeMillis();

    System.out.println(sum1 + " : " + sum2 + "\nStream Time: " + (endStream - startStream) + "\nParallel Stream Time: "
        + (endParStream - startParStream));
  }
}
