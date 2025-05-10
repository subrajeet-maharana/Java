public class DynamicDispatch {
    public static void main(String[] args) {
        Employee emp;
        emp = Employee.getEmployee("developer");
        emp.insert();
        emp.delete();
        System.out.println("Employee Count: " + Employee.getEmployeeCount());
        emp = Employee.getEmployee("manager");
        emp.insert();
        emp.delete();
        System.out.println("Employee Count: " + Employee.getEmployeeCount());
    }
}