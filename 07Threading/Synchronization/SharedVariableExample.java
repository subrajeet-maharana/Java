class SharedVariable {
  private int variable = 0;

  public synchronized void increment() {
    variable++;
  }

  public int getVariable() {
    return variable;
  }
}

public class SharedVariableExample {
  public static void main(String[] args) {
    SharedVariable variable1 = new SharedVariable();
    Runnable runnable1 = () -> {
      for (int i = 0; i < 500000; i++) {
        variable1.increment();
      }
    };
    Runnable runnable2 = () -> {
      for (int i = 0; i < 700000; i++) {
        variable1.increment();
      }
    };

    Thread thread1 = new Thread(runnable1);
    Thread thread2 = new Thread(runnable2);

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(variable1.getVariable());
  }
}
