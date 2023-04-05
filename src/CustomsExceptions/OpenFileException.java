package CustomsExceptions;

import javax.swing.*;

public class OpenFileException extends Exception{

    private String nomeDoArquivo;
    private String diretorio;

    public OpenFileException(String nomeDoArquivo, String diretorio) {
        super(" O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + '/' + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "OpenFileException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}
