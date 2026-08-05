package oops.HeirarchialInheritEg;

public class FullTimeEmployee extends EmployeeDetails {
    double salary;

    public FullTimeEmployee(int empId, String empName,double salary) {
        super(empId, empName);
        this.salary = salary;
    }

    public void details() {
        System.out.println("empId: " + empId);
        System.out.println("empName: " + empName);
        System.out.println("salary: " + salary);
        System.out.println("================================");System.out.println();
    }
}
//    public static void main(String[] args) {
//        FullTimeEmployee F=new FullTimeEmployee(101,"teja",500000);
//        F.details();
//    }

