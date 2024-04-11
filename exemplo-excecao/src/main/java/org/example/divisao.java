package org.example;

import javax.swing.*;

public class divisao {

    public static void main(String[] args) {

        String snum1, snum2;

        snum1 = JOptionPane.showInputDialog("Digite um número");
        snum2 = JOptionPane.showInputDialog("Digite outro número");

        try {
            int num1 = Integer.parseInt(snum1);
            int num2 = Integer.parseInt(snum2);

            JOptionPane.showMessageDialog(null, num1 / num2);
        }
        catch (ArithmeticException erro) {
            JOptionPane.showMessageDialog(null,
                    "Divisão por zero!\n" + "Erro",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
        catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null,
                    "Digite apenas números!\n" + "Erro",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
        finally {
            JOptionPane.showMessageDialog(null, "Fim de processamento!");
            System.exit(0);
        }
    }
}