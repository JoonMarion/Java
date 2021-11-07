package primeiraAtividade;
import java.text.DecimalFormat; // limitar 2 casas decimais
import java.util.Scanner; // scanner

public class Questao4 {
    public static void main(String[] args) {  
    Scanner entrada = new Scanner(System.in); 
    DecimalFormat df = new DecimalFormat();
    df.setMaximumFractionDigits(2); // escolher quantas casas limitar
    
    System.out.println("### CONTROLE DE RENDA ###");
    System.out.println("> Quantos pães franceses foram vendidos hoje?");
    int qtdpaes = entrada.nextInt();
    
    System.out.println("> Quantas broas foram vendidas hoje?");
    int qtdbroas = entrada.nextInt();
    
    float rendapaes = (float) (qtdpaes * 0.25);
    float rendabroas = (float) (qtdbroas * 1.50);
    
    System.out.println("> Total arrecadado com as vendas: R$"+(rendapaes+rendabroas));
    System.out.println("> Deve guardar R$"+df.format((rendapaes+rendabroas)*0.1)+" na conta poupança.");
}    
}
