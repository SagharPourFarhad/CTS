package command.clase;

public class ComandaDepunere extends ComandaAbstracta{

    public ComandaDepunere(ContBancar contBancar, float suma) {
        super(contBancar, suma);
    }

    @Override
    public void executa() {
        super.contBancar.depunere(super.suma);
    }
}
