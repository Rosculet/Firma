import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StaffEmployee staffEmployee1 = new StaffEmployee("Oleg","C#", 1000,500);
        StaffEmployee staffEmployee2 = new StaffEmployee("Pavel","C+", 1022,522);
        ContractEmployee contractEmployee1 = new ContractEmployee("Sania", "PHP",1000);
        ContractEmployee contractEmployee2 = new ContractEmployee("Vasia", "CSS",1111);

        Department developers = new Department("IT Developers",1000);
        developers.addEmployee(staffEmployee1);
        developers.addEmployee(staffEmployee2);
        developers.addEmployee(contractEmployee1);
        developers.addEmployee(contractEmployee2);

        developers.printEmployeeSalary();
    }
}
