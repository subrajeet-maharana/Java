public class BankAccount {
  private int balance;

  BankAccount(int initialDeposit) {
    balance = initialDeposit;
    System.out.println("Bank Account created successfully with balance: " + balance);
  }

  public BankAccount() {
    // TODO Auto-generated constructor stub
  }

  public void deposit(int amount) {
    balance = balance + amount;
    System.out.println("Updated Balance after deposit: " + balance);
  }

  public void withdraw(int amount) {
    if (amount > balance) {
      System.err.println("Insufficient Balance");
      return;
    }
    balance = balance - amount;
    System.out.println("Updated Balance after withdrawal: " + balance);
  }

  public static void main(String[] args) {
    BankAccount newAcc = new BankAccount(56400);
    newAcc.deposit(8994);
    newAcc.withdraw(500000);
    newAcc.withdraw(8457);

    new BankAccount(); // anonymous obj, created in heap but no stack traced
  }
}
