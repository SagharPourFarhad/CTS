package ro.ase.cts.chainofresponsibility.clase;

public class ContCredit extends ro.ase.cts.chainofresponsaibility.clase.Cont {
    public ContCredit(float sold) {
        super(sold);
    }

    @Override
    public void realizaeazaPlata(float suma) {
        if(suma < super.getSold()){
            System.out.println("Plata a fost efectuata din contul de credit pentru suma de "+ suma);
            super.setSold(super.getSold()-suma);
        } else if(super.getCont() != null){
            super.getCont().realizaeazaPlata(suma);
        } else {
            System.out.println("Plata a fost refuzata");
        }
    }
}
