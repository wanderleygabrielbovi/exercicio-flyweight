package src.gestao_cores;

public class Forma {

    private Cor cor;
    private String posicao = "0,0";
    private int tamanho = 10;

    public Forma(Cor cor, String posicao, int tamanho) {
        this.cor = cor;
        this.posicao = posicao;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "cor=" + cor.getNome() +
                ", posição=" + posicao +
                ", tamanho=" + tamanho +
                '}';
    }
}
