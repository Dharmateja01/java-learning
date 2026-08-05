package oops.MultiLevelInheritance;

public class FullTimeEmpy extends EmployeeMulti {
    double salary;

    public FullTimeEmpy(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }
}
