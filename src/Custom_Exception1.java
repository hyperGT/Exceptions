import CustomsExceptions.OpenFileException;

import javax.swing.*;
import java.io.*;

public class Custom_Exception1 {

    public static void main(String[] args) {

        //using customize Exceptions

        String nomeDoArquivo = JOptionPane.showInputDialog("Insira o nome do Arquivo a ser Exibido: ");
        imprimirArquivoNoConsole(nomeDoArquivo);


    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {

        try {

            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();

        } catch (OpenFileException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Algo deu errado! " + e.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado!" + ex.getCause());
        }
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws OpenFileException {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new OpenFileException(file.getName(), file.getPath());
        }

    }
}
