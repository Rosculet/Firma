public class Department {

    private String departmentName;
    private int employeesNumber;
    Employee [] employees;
    int count = 0;

    public Department(String departmentName, int employeesNumber) {
        this.departmentName = departmentName;
        this.employeesNumber = employeesNumber;
        employees = new Employee[employeesNumber];
    }

    public void addEmployee (Employee employee) {
        if (count<employeesNumber) {
            employees[count] = employee;
            count++;
        }
        else throw new IndexOutOfBoundsException(" Требуйте расширение штата отдела ");
    }


    public void printEmployeeSalary(){
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
