package primeiraAtividade;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {  
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("####### RESTAURANTE BEM-BÃO ########");
        System.out.println(">>> INSIRA O PESO DO PRATO EM KG <<<");
        float pesoPrato = entrada.nextFloat();
        System.out.println(">>> O PRATO CUSTA R$"+(pesoPrato*12));
}
}
