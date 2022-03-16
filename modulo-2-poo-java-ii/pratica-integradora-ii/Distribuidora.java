
import model.NaoPereciveis;
import model.Pereciveis;
import model.Produto;

public class Distribuidora {
    public static void main(String[] args) {

        double valorTotal = 0;
        Pereciveis maca = new Pereciveis("Maca",10,5);
        Pereciveis banana = new Pereciveis("Banana",10,2);
        Pereciveis leite = new Pereciveis("Leite",10,1);
        Pereciveis pera = new Pereciveis("Pera",100,5);
        Pereciveis abacate = new Pereciveis("Abacate",100,2);


        NaoPereciveis arroz = new NaoPereciveis("arroz",10);
        NaoPereciveis feijao = new NaoPereciveis("feijao",10);
        NaoPereciveis polenta = new NaoPereciveis("polenta",10);
        NaoPereciveis lentilha = new NaoPereciveis("lentilha",10);
        NaoPereciveis trigo = new NaoPereciveis("trigo",10);

        Produto[] produtoArray = new Produto[]{maca,banana,leite,pera,abacate,arroz,feijao,polenta,lentilha,trigo};

        for(Produto produto : produtoArray){
            valorTotal += produto.calcular(1);
        }


        System.out.println("O valor total da lista de produtos é: " + valorTotal);



    }
}
