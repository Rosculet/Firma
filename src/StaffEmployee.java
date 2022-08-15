public class StaffEmployee extends Employee{

    private int bonus;

    public StaffEmployee(String employeeName, String position, int salary, int bonus) {
        super(employeeName, position, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }


    @Override
    public int calculateSalary() {;
       return getSalary() + getBonus();
    }
}
