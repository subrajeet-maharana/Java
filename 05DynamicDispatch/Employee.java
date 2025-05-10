public abstract class Employee {

    private int id;
    private String name;
    private String office;
    private String designation;

    private static int count = 0;

    public abstract void insert();

    public abstract void delete();

    public Employee(int id, String name, String office, String designation) {
        this.id = id;
        this.name = name;
        this.office = office;
        this.designation = designation;
        count++;
    }

    public static Employee getEmployee(String type) {
        switch (type) {
            case "developer":
                return new Developer(1, "A", "CS");
            case "manager":
                return new Manager(1, "B", "HR");
            default:
                return null;
        }
    }

    public static int getEmployeeCount() {
        return count;
    }
}