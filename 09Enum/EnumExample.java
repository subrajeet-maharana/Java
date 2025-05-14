
enum Status {
    Running, Failed, Pending, Success
};

public class EnumExample {

    public static void main(String[] args) {
        Status s = Status.Failed;
        System.out.println(s + ": " + s.ordinal());

        Status[] sArray = Status.values();
        for (Status x : sArray) {
            System.out.printf(x.name() + ": " + x.ordinal() + " | ");
        }

        System.out.println("");
        if (s == Status.Failed) {
            System.err.println("Try Again");
        } else if (s == Status.Pending) {
            System.out.println("Wait for some time...");
        } else if (s == Status.Running) {
            System.out.println("Successfully running...");
        } else {
            System.out.println("Done");
        }

        switch (s) {
            case Failed:
                System.err.println("Try Again");
                break;
            case Pending:
                System.out.println("Wait for some time...");
                break;
            case Running:
                System.out.println("Successfully running...");
                break;
            default:
                System.out.println("Done");
                break;
        }
    }
}
