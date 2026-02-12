package br.com.senai.centroweg.model;

public class Picasso {

    public double calcularPrecoComAno(Carro carro, Ano2024 ano2024){

        return carro.getPreco() - ano2024.getDesconto();
    }


}
