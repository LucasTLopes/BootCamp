package exercicios.herencaPolimorfismoEncapsulamento;

public class NaoPereciveis extends Produto{
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
        return "NaoPereciveis{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
