package br.com.metabolismobasal;

import br.com.metabolismobasal.interfaces.IBasal;

public class MetabolismoMulher implements IBasal {
    @Override
    public float indiceBasal() {
        return 665;
    }

    @Override
    public float indicePeso() {
        return 9.56f;
    }

    @Override
    public float indiceAltura() {
        return 1.85f;
    }

    @Override
    public float indiceIdade() {
        return 4.68f;
    }
}
