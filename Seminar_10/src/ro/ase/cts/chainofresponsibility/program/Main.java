package ro.ase.cts.chainofresponsibility.program;

import ro.ase.cts.chainofresponsaibility.clase.Cont;
import ro.ase.cts.chainofresponsaibility.clase.ContCredit;
import ro.ase.cts.chainofresponsaibility.clase.ContCurent;
import ro.ase.cts.chainofresponsaibility.clase.ContEconomii;

public class Main {
    public static void main(String[] args) {
        Cont contCurent = new ContCurent(200);
        Cont contEconomii = new ContEconomii(500);
        Cont contCredit = new ContCredit(700);

        contCurent.setCont(contEconomii);
        contEconomii.setCont(contCredit);

        contCurent.realizaeazaPlata(150);
        contCurent.realizaeazaPlata(60);
        contCurent.realizaeazaPlata(490);
        contCurent.realizaeazaPlata(250);
        contCurent.realizaeazaPlata(300);
    }
}
