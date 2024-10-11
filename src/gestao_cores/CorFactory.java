package src.gestao_cores;

import java.util.HashMap;
import java.util.Map;

public class CorFactory {
    private static Map<String, Cor> map = new HashMap<>();

    public static Cor obterCor(
            String nome) {

        Cor cor = map.get(nome);

        if(cor != null) {
            return cor;
        }

        cor = new Cor(nome);
        map.put(nome, cor);

        return cor;
    }

}
