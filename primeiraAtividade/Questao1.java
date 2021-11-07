package primeiraAtividade; // pacote
import java.util.Scanner; // scanner

public class Questao1 {
    public static void main(String[] args) {
        
        // definindo variáveis
        Scanner entrada = new Scanner(System.in); 
        float conta = 0f;           
        float chope = 2.80f;
        float pizza = 10f;          
        float cobertura = 2.80f;
        int cob = 0;
        int pessoas = 0;
        float contadiv = 0f;
        float resultadoconta = 0f;
                
        // printar cardápio
        System.out.println("################# CARDÁPIO #################");  
        System.out.println("Chope >>> R$2,80"); 
        System.out.println("Pizza mista grande >>> R$10,00");
        System.out.println("Adição de cobertura na pizza por R$2,80 cada.");
        System.out.println("############################################");
        
        int x = 1; // variável condicional pro while
        
        while(x != 0) // laço para adicionar produtos ao pedido
        {
            System.out.println("\n            > Qual seu pedido? <");
            System.out.println("1 - Chope;                 2 - Pizza;");
            System.out.println("0 - Encerrar pedido;\n");
            
            x = entrada.nextInt();
            
            // switch para selecionar o produto desejado
            switch (x)
            {
            case 1:
            System.out.println("Você adicionou um chope.\n\n");
            conta = conta + chope;
            System.out.println("--------------------------------------------");
            break;

            case 2:
            System.out.println("Você adicionou uma pizza.\n\n");
            conta = conta + pizza;
            System.out.println("Você deseja adicionar cobertura?");
            System.out.println("1 - sim;                 2 - nao;\n");
            
            cob = entrada.nextInt();
                // condição para selecionar cobertura ou não
                if(cob == 1)
                {
                    conta = conta + cobertura;
                }
                else
                {
                    System.out.println("----------------------------------------");
                    break;
                }  
            System.out.println("--------------------------------------------");    
            break;
                
            case 0:
            System.out.println("--------------------------------------------");
            break;
                
            default: 
            System.out.println("Pedido inválido!\n\n");
            System.out.println("--------------------------------------------");
            break;
            }   
        }
        
        // resultado dos pedidos
        System.out.println("Há quantas pessoas na mesa? ");
        pessoas = entrada.nextInt();
        System.out.println("\n");
        contadiv = conta / pessoas;
        contadiv = (float) (contadiv * 1.1);
        
        System.out.println("Sua conta, com os 10% de serviço ficou: R$"+contadiv+";");
}       
}