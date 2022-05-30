package fitness.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Trainer lizzy = new Trainer(1,"Lizzy", 3000);
        Trainer maxim = new Trainer(2,"Maxim",3500);
        Trainer seraphim = new Trainer(3,"Seraphim", 2500);

        List<Trainer> trainerList = new ArrayList<>();
        trainerList.add(lizzy);
        trainerList.add(maxim);
        trainerList.add(seraphim);

        Client grigory = new Client(1,"Grigory",6, 12000);
        Client rahim = new Client(2,"Rahim", 3,6000);
        Client picasso = new Client(3,"Picasso",12,14000);

        List<Client> clientList = new ArrayList<>();
        clientList.add(grigory);
        clientList.add(rahim);
        clientList.add(picasso);

        Admin alexa = new Admin(1,"Alexa", 200);
        Admin evgexa = new Admin(2,"Evgeha",230);

        List<Admin> adminList = new ArrayList<>();
        adminList.add(alexa);
        adminList.add(evgexa);

        FitnessClub rusFitness = new FitnessClub(clientList, trainerList, adminList);

        grigory.payFees(3000);
        System.out.println("RUSFITNESS has earned " + rusFitness.getTotalMoneyEarned());
        picasso.payFees(6000);
        System.out.println("RUSFITNESS has earned " + rusFitness.getTotalMoneyEarned());

        System.out.println("-----Making FitnessClub pay salary-----");
        seraphim.receiveSalary(seraphim.getSalary());
        System.out.println("RUSFITNESS has spent for salary to " + seraphim.getName()
        + " and now has " + rusFitness.getTotalMoneyEarned());
        alexa.receiveSalary(alexa.getSalary());
        System.out.println("RUSFITNESS has spent for salary to " + alexa.getName()
                + " and now has " + rusFitness.getTotalMoneyEarned());

        System.out.println(grigory);
    }
}
