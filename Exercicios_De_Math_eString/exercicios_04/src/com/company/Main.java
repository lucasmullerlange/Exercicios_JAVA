package com.company;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        
        String frase = JOptionPane.showInputDialog(null, "Entre com uma frase qualquer:");
        StringBuffer sb = new StringBuffer(frase); JOptionPane.showMessageDialog(null, "frase invertida: " + sb.reverse());

    }
}
