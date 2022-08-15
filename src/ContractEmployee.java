public class ContractEmployee extends Employee{

    public ContractEmployee(String employeeName, String position, int salary) {
        super(employeeName, position, salary);
    }
    @Override
    public int calculateSalary() {
        return getSalary();
    }

}
