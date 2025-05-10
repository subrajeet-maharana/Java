public class Developer extends Employee {

    public void insert() {
        System.out.println("Data inserted in Developer database");
    }

    public void delete() {
        System.out.println("Data deleted from Developer database");
    }

    public Developer(int id, String name, String office) {
        super(id, name, office, "developer");
    }
}