package TDD;

public class Filme {

    private String nome;
    private float valor;

    public Filme(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public float getValor() {
        return this.valor;
    }
}