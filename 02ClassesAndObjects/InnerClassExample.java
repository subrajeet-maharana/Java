public class InnerClassExample {
    private int val;

    public void showDetails() {
        System.out.println("Inside the Outer Class");
    }

    class InnerClass {
        public void show() {
            System.out.println("Inside the Inner Class");
        }
    }

    public static void main(String[] args) {
        InnerClassExample obj = new InnerClassExample();
        obj.showDetails();

        InnerClassExample.InnerClass newObj = obj.new InnerClass();
        newObj.show();

        // Anonymous Inner Class
        InnerClassExample brandNewObj = new InnerClassExample() {
            public void showDetails() {
                System.out.println("Inside the Brand New Inner Class");
            }
        };
        brandNewObj.showDetails();
    }
}
