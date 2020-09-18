package com.company;

class Main {
    public static void main(String[] args) {

        Double[] array;//declaração do nosso array
        array = new Double[12]; //cria e reserva o espaço para o nosso array
        //0..9
        for ( int i = 3; i ++ <= 10 ;  ){

            System.out.printf("%5d%7d\n", i, array[i]);
        }
    }
}
