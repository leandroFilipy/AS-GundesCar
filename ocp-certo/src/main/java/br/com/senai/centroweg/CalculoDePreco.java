package br.com.senai.centroweg;

import br.com.senai.centroweg.model.Ano2024;
import br.com.senai.centroweg.model.Carro;
import br.com.senai.centroweg.enums.Anos;

public interface CalculoDePreco {

    double calcularPreco(Carro carro, Anos anos);

}

