package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.Bilet;
import ro.ase.cts.decorator.clase.OperatorBilet;

public abstract class AbstractDecoratorEx2 implements OperatorBilet {

    private OperatorBilet bilet;

    public AbstractDecoratorEx2(OperatorBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void rezervaBilet() {
        bilet.rezervaBilet();
    }

    @Override
    public String getNumeEchipaGazda() {
        return bilet.getNumeEchipaGazda();
    }

    @Override
    public String getNumeEchipaOaspeti() {
        return bilet.getNumeEchipaOaspeti();
    }
}