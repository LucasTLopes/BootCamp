package exercicios.herencaPolimorfismoEncapsulamento;

public class Pereciveis extends Produto {
    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                '}';
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        if (diasParaVencer >=3){
            return super.calcular(quantidadeDeProdutos) - 0.50*getPreco();
        } else if(diasParaVencer == 2){
            return super.calcular(quantidadeDeProdutos) - 0.70*getPreco();
        } else {
            return super.calcular(quantidadeDeProdutos) - 0.75*getPreco();
        }
    }
}
