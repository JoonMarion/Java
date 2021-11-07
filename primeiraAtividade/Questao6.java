package primeiraAtividade;
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {  
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("            [ QUANTIDADE   DE ]");
        System.out.println("            [  REFRIGERANTE   ]");
        System.out.println("            [    CONSUMIDO    ]\n");
        
        System.out.println(">>> Quantas latas de 350ml foram consumidas? ");
        int lata = entrada.nextInt();
        System.out.println(">>> Quantas garrafas de 600ml foram consumidas? ");
        int garrafa = entrada.nextInt();
        System.out.println(">>> Quantas garrafas de 2L foram consumidas? ");
        int garrafa2 = entrada.nextInt();
        
        float resultado = (lata * 350 + garrafa * 600 + garrafa2 * 2000)/1000;
        System.out.println("TOTAL DE REFRIGERANTE CONSUMIDO EM L: "+resultado+"L");
}     
}
