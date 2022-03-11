package exercicios;

public class Pessoa {
    private String nome;
    private int idade;
    private String id;
    private double peso;
    private double altura;
    private String imc;


    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, int idade, String id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoa(String nome, int idade, String id, double peso, double altura, String imc) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
    }


    public int calcularIMC() {
        double result = peso/(Math.pow(altura,2));
        if(result < 20) return -1;
        else if (result <= 25){
            return 0;
        } else {
            return 1;
        }
    }

    public boolean ehMaiorIdade(){
        if(idade<18){
            return false;
        }
        return true;
    }



    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", id='" + id + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", imc='" + imc + '\'' +
                '}';
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setImc(String imc) {
        this.imc = imc;
    }
}
