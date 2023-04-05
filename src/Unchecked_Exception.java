import javax.swing.*;

public class Unchecked_Exception {

    public static void main(String[] args) throws Exception {


        // excessões possiveis: Numerador ou denominador serem informados como Strings ou tentar dividir o numerador por zero
        boolean continueLooping = true;
        do {

            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {

                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

                continueLooping = false;

            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Insira um valor válido! ");
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossivel dividir por 0! ");
            } finally {
                System.out.println("Finally");
            }
        } while (continueLooping);


        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

}
