import CustomsExceptions.Non_ExactDivisionException;

import javax.swing.*;

public class Custom_Exception2 {

    public static void main(String[] args) {

        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {

            try {
                if (numerador[i] % 2 != 0)
                    throw new Non_ExactDivisionException("O programa não pode finalizar devido a erros ", numerador[i], denominador[i]);
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);

            } catch (Non_ExactDivisionException | ArithmeticException | IndexOutOfBoundsException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }

        System.out.println("Continue");

    }
}
