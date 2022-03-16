package model;

import model.Produto;

public class NaoPereciveis extends Produto {
    private String tipo;

    public NaoPereciveis(String nome, double preco) {
        super(nome, preco);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "model.NaoPereciveis{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
