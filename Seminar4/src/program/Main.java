package program;

import ro.ase.cts.singletone.AsigurareMedicala;


public class Main {

    public static void main(String[] args) {
        AsigurareMedicala asigurareMedicala1 = AsigurareMedicala.getInstance();
        AsigurareMedicala asigurareMedicala2 = AsigurareMedicala.getInstance();

        asigurareMedicala1.setNumeAsigurati("Paul");
        asigurareMedicala2.setContributie(350.5f);
        System.out.println(asigurareMedicala1.toString());
        System.out.println(asigurareMedicala2.toString());

        ro.ase.cts.singletonLazy.AsigurareMedicala asigurareMedicala3 = ro.ase.cts.singletonLazy.AsigurareMedicala.getInstance(100,"Bogdan",255.5f);
        ro.ase.cts.singletonLazy.AsigurareMedicala asigurareMedicala4 = ro.ase.cts.singletonLazy.AsigurareMedicala.getInstance(101,"Alex",100.5f);
        System.out.println(asigurareMedicala3);
        System.out.println(asigurareMedicala4);

    }
}
