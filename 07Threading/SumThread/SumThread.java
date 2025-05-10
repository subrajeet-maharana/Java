public class SumThread implements Runnable {
    private int start;
    private int end;
    private Thread t;
    private int sum;

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;

        this.t = new Thread(this);
        t.start();
    }

    public void run() {
        for(int i=start; i <= end; i++)
            sum += i;
    }

    public int getSum() {
        return sum;
    }

    public void join() throws InterruptedException {
        t.join();
    }
}
