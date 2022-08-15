public abstract class Employee {

    private String employeeName;
    private String position;
    private int salary;

    public Employee(String employeeName, String position, int salary) {
        this.employeeName = employeeName;
        this.position = position;
        this.salary = salary;
    }

    public abstract int calculateSalary();

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
       return getEmployeeName() + " " + getPosition() + " " + calculateSalary();
    }
}
