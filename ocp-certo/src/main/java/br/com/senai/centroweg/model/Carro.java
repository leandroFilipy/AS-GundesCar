package br.com.senai.centroweg.model;

public class Carro {

    private String id;
    private String modelo;
    private String marca;
    private String cor;
    private double preco;
    private double peso;

    public Carro(String id, String modelo, String marca, String cor, double preco, double peso){
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.preco = preco;
        this.peso = peso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
