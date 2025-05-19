
@FunctionalInterface
interface Validator {

    void show();
}

class LicenseValidator implements Validator {

    public void show() {
        System.out.println("Inside the license validator.");
    }
}

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        Validator obj = new Validator() {
            @Override
            public void show() {
                System.out.println("Iniside Validator Interface");
            }
        };
        obj.show();

        Validator obj2 = new LicenseValidator();
        obj2.show();
    }
}
