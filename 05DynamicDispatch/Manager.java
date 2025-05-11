public class Manager extends Employee {

    public void insert() {
        System.out.println("Data inserted in Manager database");
    }

    public void delete() {
        System.out.println("Data deleted from Manager database");
    }

    public Manager(int id, String name, String office) {
        super(id, name, office, "manager");
    }
}
