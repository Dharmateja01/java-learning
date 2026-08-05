package oops.HeirarchialInheritEg;

public class PartTimeEmployee extends EmployeeDetails {
    int WorkingHours;
    double salary;
    public PartTimeEmployee(int empId, String empName,int WorkingHours) {
        super(empId, empName);
//        this.Type = Type;
        this.salary = salary;
        this.WorkingHours = WorkingHours;
    }
    public void details() {
        System.out.println("================================");
        System.out.println("empId: " + empId);
        System.out.println("empName: " + empName);
        System.out.println("WorkingHours: " + WorkingHours);
        System.out.println("salary: " + WorkingHours * 100);
        System.out.println("================================");
    }
    public static void main(String[] args) {
        PartTimeEmployee P=new PartTimeEmployee(102,"abc",100);
        P.details();
        FullTimeEmployee F=new FullTimeEmployee(101,"xyz",50000);
        F.details();

    }
}
