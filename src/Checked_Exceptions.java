import javax.swing.*;
import java.io.*;

public class Checked_Exceptions {

    public static void main(String[] args){


        String nomeDoArquivo = "Texto.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Algo deu errado, revise o nome do arquivo");
            JOptionPane.showMessageDialog(null,
                    "arquivo inserido: " + nomeDoArquivo);
        } catch (IOException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado!" + e.getCause());
        }


    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {

        File file = new File(nomeDoArquivo);
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        }while (line != null);
        bw.flush();
        br.close();
    }
}
