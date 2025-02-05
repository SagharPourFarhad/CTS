package ro.ase.cts.composite.composite;

public class Item extends ComponentaMeniu {

    public Item(String nume) {
        super(nume);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Item: " + super.getNume());
    }

    @Override
    public ComponentaMeniu getComponenta(int poz) throws Exception {
        throw new Exception("Nu se poate");
    }

    @Override
    public void adaugaComponenta(ComponentaMeniu componenta) {
        throw new IllegalArgumentException();
    }

    @Override
    public void stergeComponenta(ComponentaMeniu componenta) {
        throw new IllegalArgumentException();
    }
}