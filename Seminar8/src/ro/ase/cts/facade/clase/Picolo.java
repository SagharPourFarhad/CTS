package ro.ase.cts.facade.clase;

public class Picolo {
    private String nume;

    public Picolo(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public boolean esteDebarasata(Masa masa) {
        return masa.getCod() % 2 == 0;
    }

    public boolean esteAranjata(Masa masa) {
        return masa.getCod() % 5 == 0;
    }
}