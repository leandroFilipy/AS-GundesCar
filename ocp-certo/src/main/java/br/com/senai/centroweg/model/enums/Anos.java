package br.com.senai.centroweg.model.enums;

public enum Anos {

    Ano2023{
        @Override
        public double desconto(){
            return 1000;
        }
    },
    Ano2024{
        @Override
        public double desconto(){
            return 500;
        }
    },
    Ano2025{
        @Override
        public double desconto(){
            return 100;
        }
    };

    public double desconto() {
        return 0;
    }
}
