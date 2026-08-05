package oops.MultiLevelInheritance;

public class EmployeeMulti {
    int id;
    String name;
    public EmployeeMulti(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}
