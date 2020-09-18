package com.company;

import java.util.Random;


public class Dado {
    private int numero;
    public Dado(){
        this.setNumero(1);
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        if(numero > 0 && numero < 7){
            this.numero = numero;
        }else{
            this.numero = 1;
        }
    }
    public void JogarDado(){
        Random gerador = new Random();
        this.setNumero(gerador.nextInt(6)+1);
    }
}