package command.clase;

public abstract class ComandaAbstracta {

    public ContBancar contBancar;
    protected float suma;

    public ComandaAbstracta(ContBancar contBancar, float suma) {
        this.contBancar = contBancar;
        this.suma = suma;
    }

    public abstract void executa();

}
