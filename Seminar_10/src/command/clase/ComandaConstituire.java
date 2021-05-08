package command.clase;

public class ComandaConstituire extends ComandaAbstracta{


    public ComandaConstituire(ContBancar contBancar, float suma) {
        super(contBancar, suma);
    }

    @Override
    public void executa() {
        super.contBancar.constituire(suma);
    }
}
