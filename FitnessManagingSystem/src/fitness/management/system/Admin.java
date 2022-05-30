package fitness.management.system;

public class Admin {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    public Admin(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void receiveSalary(int salary) {
        salaryEarned += salary;
        FitnessClub.updateTotalMoneySpent(salary);
    }
}
