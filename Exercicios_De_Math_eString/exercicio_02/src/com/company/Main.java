package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double valor=0;
        double produto;
        produto = valor*0.12;


        do{

            Scanner input = new Scanner(System.in);

            System.out.println(" digite o valor produto : ");
            valor = input.nextDouble();

            if(produto==0){
                break;
            }else{
                valor += (12);
                System.out.println("Valor de acréscimo é  "+ Math.round(produto));
            }
        }while(valor!=0);

    }
}