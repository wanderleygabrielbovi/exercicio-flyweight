package src.gestao_cores;

import src.exceptions.CorIndefinida;
import src.exceptions.TamanhoMenorQueUm;
import java.util.ArrayList;
import java.util.List;

public class FormaManager {
    private List<Forma> formas = new ArrayList<>();

    public FormaManager() {}

    public void addForma(String nomeCor, String posicao, int tamanho) {
        try {
            if (nomeCor.isEmpty()) {
                throw new CorIndefinida();
            }
            else if (tamanho < 1) {
                throw new TamanhoMenorQueUm();
            }
            Cor cor = CorFactory.obterCor(nomeCor);
            Forma forma = new Forma(cor, posicao, tamanho);

            this.formas.add(forma);

        } catch (CorIndefinida e) {
            e.printStackTrace();
        } catch (TamanhoMenorQueUm e) {
            e.printStackTrace();
        }
    }

    public void apresentar() {
        for (Forma forma : formas) {
            System.out.println(forma.toString());
        }
    }
}