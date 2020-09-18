package com.company;

public class Main {


        public static void main (String args[])
        {

            int array [] =  {2,5,8,9,7,12,15,18,20};
            int par;
            int impar;
            for (int i = 0; i < array.length; i++) {
                if (Par(array[i])) {
                    System.out.println(array[i] + " É Par.");
                }
                if (!Par(i)) {
                    System.out.println(i + " é impar " );
                }
            }
        }
        public static boolean Par(int numero) {
            return (numero % 2 == 0);
        }



}


