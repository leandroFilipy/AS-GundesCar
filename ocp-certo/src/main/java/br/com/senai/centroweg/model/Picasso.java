package br.com.senai.centroweg.model;

import br.com.senai.centroweg.enums.Anos;

public class Picasso {

    double preco = 30000;

    public double calcularPrecoComAno(Carro carro, Anos anos){

        return carro.getPreco() - anos.desconto();
    }


}
