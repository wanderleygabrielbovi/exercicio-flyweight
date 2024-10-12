package src.exceptions;

public class CorIndefinida extends Exception {

    @Override
    public String toString() {
        return "É obrigatório definir uma cor!";
    }
}
