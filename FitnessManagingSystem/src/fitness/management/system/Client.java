package fitness.management.system;

public class Client {
    private int id;
    private String name;
    private int monthsSubscription;

    private int feesPaid;

    private int feesTotal;


    public Client(int id, String name, int monthsSubscription, int feesTotal) {
        this.feesPaid = 0;
        this.id = id;
        this.name = name;
        this.monthsSubscription = monthsSubscription;
        this.feesTotal = feesTotal;
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }

    public void setMonthsSubscription(int monthsSubscription) {
        this.monthsSubscription = monthsSubscription;
    }

    public void payFees(int fees) {
        feesPaid += fees;
        FitnessClub.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMonthsSubscription() {
        return monthsSubscription;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", monthsSubscription=" + monthsSubscription +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal +
                '}';
    }
}
