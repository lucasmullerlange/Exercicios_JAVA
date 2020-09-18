package com.company;

import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random generator = new Random();
        for (int i = 0; i < 10; i++)

        {
            JOptionPane.showMessageDialog(null,generator.nextInt(10));
        }
    }
}
