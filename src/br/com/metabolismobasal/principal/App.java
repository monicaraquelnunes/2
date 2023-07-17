package br.com.metabolismobasal.principal;

import br.com.metabolismobasal.MetabolismoHomem;
import br.com.metabolismobasal.MetabolismoMulher;

public class App {
    public static void main(String[] args) {
        MetabolismoMulher mbPessoa = new MetabolismoMulher();
        // MetabolismoHomem mbPessoa = new MetabolismoHomem();

        String genero = "mulher";
        // String genero = "homem";
        int pesoM = 0;
        int alturaM = 0;
        int idadeM = 0;

        if(genero == "mulher"){
            pesoM = mbPessoa.valPeso(69);
            alturaM = mbPessoa.valAltura(163);
            idadeM = mbPessoa.valIdade(39);
        }else {
            pesoM = mbPessoa.valPeso(101);
            alturaM = mbPessoa.valAltura(180);
            idadeM = mbPessoa.valIdade(48);
        }


        float pessoaMb = mbPessoa.indiceBasal()+
                (mbPessoa.indicePeso()*pesoM)+
                (mbPessoa.indiceAltura()*alturaM)+
                (mbPessoa.indiceIdade()*idadeM);

        System.out.println("Esse metabolismo é de "+genero+": "+pessoaMb);
    }
}
