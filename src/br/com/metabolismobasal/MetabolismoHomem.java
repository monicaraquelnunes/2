package br.com.metabolismobasal;

import br.com.metabolismobasal.interfaces.IBasal;

public class MetabolismoHomem implements IBasal {

    @Override
    public float indiceBasal() {
        return 66;
    }

    @Override
    public float indicePeso() {
        return 13.5f;
    }

    @Override
    public float indiceAltura() {
        return 5;
    }

    @Override
    public float indiceIdade() {
        return 6.75f;
    }
}
