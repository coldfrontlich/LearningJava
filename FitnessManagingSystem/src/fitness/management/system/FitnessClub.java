package fitness.management.system;

import java.util.List;

public class FitnessClub {

    private List<Client> clients;
    private List<Trainer> trainers;
    private List<Admin> admins;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public FitnessClub(List<Client> clients,
                       List<Trainer> trainers,
                       List<Admin> admins) {
        this.clients = clients;
        this.trainers = trainers;
        this.admins = admins;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void addTrainer(Trainer trainer) {
        trainers.add(trainer);
    }

    public List<Admin> getAdmins() {
        return admins;
    }

    public void addAdmin(Admin admin) {
        admins.add(admin);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
