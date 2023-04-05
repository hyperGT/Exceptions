import javax.swing.*;

public class Unchecked_Exception {

    public static void main(String[] args) throws Exception {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {

        int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
        System.out.println("Resultado: " + resultado);

        }catch (NumberFormatException e){
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }


        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

}
