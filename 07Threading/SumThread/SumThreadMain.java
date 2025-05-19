
public class SumThreadMain {

    public static void main(String[] args) {
        int n = 100;
        int nThreads = 4;
        int perThread = n / nThreads;
        SumThread s[] = new SumThread[nThreads];

        for (int i = 1; i <= nThreads; i++) {
            int start = (i - 1) * perThread + 1;
            int end = i * perThread;

            s[i - 1] = new SumThread(start, end);
        }

        int fsum = 0;
        try {
            for (int i = 1; i <= nThreads; i++) {
                s[i - 1].join();
                fsum += s[i - 1].getSum();
            }
        } catch (InterruptedException e) {

        }

        System.out.println(fsum);
    }
}
