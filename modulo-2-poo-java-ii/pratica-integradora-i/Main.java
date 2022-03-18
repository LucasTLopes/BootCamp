import model.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        Pessoa pessoa1 = new Pessoa("Lucas", 24, "123");

        Pessoa pessoa2 = new Pessoa("Lucas", 12, "4321", 74, 1.71);

        int imc = pessoa2.calcularIMC();

        switch (imc) {
            case -1:
                pessoa2.setImc("Abaixo do peso");
                break;
            case 0:
                pessoa2.setImc("Saudavel");
                break;
            case 1:
                pessoa2.setImc("Sobrepeso");
                break;
        }

        if (pessoa2.ehMaiorIdade())
            System.out.println(pessoa2 + " esta pessoa e maior de idade ");
        else
            System.out.println(pessoa2 + " esta pessoa e menor de idade ");
    }

}
