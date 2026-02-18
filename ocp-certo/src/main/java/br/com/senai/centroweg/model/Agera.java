package br.com.senai.centroweg.model;

import br.com.senai.centroweg.enums.Anos;

public class Agera {

    double preco = 4000000;

    public double calcularPrecoComAno(Carro carro, Anos anos) {

        return carro.getPreco() - anos.desconto();
    }
}
