
public class PraticaExcecoes {
    int a = 0;
    int b = 300;

    public void calculaRazao() {
        try {
            int result = a / b;
        } catch (IllegalArgumentException e) {
            System.out.println("Nao pode ser dividido por zero");
        }
    }

    public static void main(String[] args) {

        PraticaExcecoes praticaExcecoes = new PraticaExcecoes();

        praticaExcecoes.calculaRazao();

        System.out.println("Programa finalizado");

    }
}
