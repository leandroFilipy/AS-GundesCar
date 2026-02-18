package br.com.senai.centroweg.model;

import br.com.senai.centroweg.model.enums.Anos;

public class RollsRoyce {

    public double calcularPrecoComAno(Carro carro, Anos anos){

        return carro.getPreco() - anos.desconto();

    }
}
