package br.com.senai.centroweg.model;

import br.com.senai.centroweg.enums.Anos;

public class Opala {

    public double calcularPrecomComAno(Carro carro, Anos anos){

        return carro.getPreco() - anos.desconto();
    }
}
