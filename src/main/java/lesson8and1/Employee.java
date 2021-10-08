package lesson8and1;

public class Employee {
    private String name;
    private int employeeID;
    private String company;

    public Employee(String name, int employeeID, String company) {
        this.name = name;
        this.employeeID = employeeID;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getCompany() {
        return company;
    }
}
