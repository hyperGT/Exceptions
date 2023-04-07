package CustomsExceptions;

public class Non_ExactDivisionException extends Exception {

    private int numerador;
    private int denominador;

    public Non_ExactDivisionException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Non_ExactDivisionException(String message) {
        super(message);
    }
}
