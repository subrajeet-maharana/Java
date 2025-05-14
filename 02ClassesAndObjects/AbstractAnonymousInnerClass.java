abstract class DataBaseConnection {
    public abstract void connector();
}

public class AbstractAnonymousInnerClass {
    DataBaseConnection mySQLConnector = new DataBaseConnection() {
        @Override
        public void connector() {
            System.out.println("My SQL Connection Successful");
        }
    };
    // useful when we want to create only one
}
