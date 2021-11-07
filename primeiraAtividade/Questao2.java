package primeiraAtividade;
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);        

        System.out.println("Digite o nome do piloto: ");
        String nome = entrada.nextLine();
        
        System.out.println("Qual distância ele percorreu? (Em Km) ");
        float distancia = entrada.nextFloat();
        
        System.out.println("Quanto tempo ele demorou? (Em horas) ");
        float tempo = entrada.nextFloat();
        
        float velocidade = distancia / tempo;
        System.out.println("A velocidade média de " + nome + " foi de " + velocidade +"Km/h");              
}    
}