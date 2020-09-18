package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Random gerador = new Random(1098765421);
            String mes;
            Scanner x;
            x = new Scanner(System.in);
            mes = x.nextLine();

        for (int i = 0;  i < 10; i++) {
            System.out.println(gerador.nextInt(10) + mes );

        }
    }
}