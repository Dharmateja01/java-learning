package oops.MultiLevelInheritance;

public class TeamLead1 extends FullTimeEmpy{
    int teamsize;
    String projectname;
    public TeamLead1(int id,String name,double salary,int teamsize, String projectname) {
        super(id,name,salary);
        this.teamsize = teamsize;
        this.projectname = projectname;
    }
    public void display() {
        super.display();
        System.out.println("Team Size: " + teamsize);
        System.out.println("Project Name: " + projectname);
    }
    public static void main(String[] args) {
        TeamLead1 T=new TeamLead1(1,"Teja",50000.0,5,"Java Project");
        T.display();
        EmployeeMulti E=new EmployeeMulti(2,"Ravi");
        E.display();
        FullTimeEmpy F=new FullTimeEmpy(3,"John",60000.0);
        F.display();
    }
}
