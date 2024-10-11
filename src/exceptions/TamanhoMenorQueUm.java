package src.exceptions;

public class TamanhoMenorQueUm extends Exception {

    @Override
    public String toString() {
        return "O tamanho deve ser maior que zero!";
    }
}
