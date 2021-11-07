package primeiraAtividade;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); 
        System.out.println("###### CONTROLE DE NOTA ######");
        System.out.println(">> INSIRA O VALOR DO PRODUTO <<");
        
        float valor = entrada.nextInt();
        valor = (float) (valor * 0.9);
        
        System.out.println("O valor do produto com 10% de desconto é: R$"+valor);
        System.out.println("O valor da parcela, de 3x, sem juros é: R$"+(valor/3));
}
}