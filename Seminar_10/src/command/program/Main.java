package command.program;

import ro.ase.cts.command.clase.*;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();
        ContBancar contBancar = new ContBancar("Saghar");
        managerComenzi.invocaComanda(new ComandaConstituire(contBancar, 100));
        managerComenzi.invocaComanda(new ComandaDepunere(contBancar, 50));
        managerComenzi.executaComanda();
        managerComenzi.invocaComanda(new ComandaRetragere(contBancar, 20));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.invocaComanda(new ComandaRetragere(contBancar, 150));
        managerComenzi.executaComanda();
    }
}
