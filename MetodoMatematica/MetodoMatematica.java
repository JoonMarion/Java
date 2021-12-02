package metodomatematica;

import java.util.Scanner;

public class MetodoMatematica {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira dois valores: ");
        double numero1 = input.nextDouble();
        double numero2 = input.nextDouble();
        
        double resultadoMaximo = Math.max(numero1, numero2);
        double resultadoMinimo = Math.min(numero1, numero2);
        double resultadoAbsoluto = Math.abs(numero1);
        double resultadoPotencia = Math.pow(numero1, numero2);
        double resultadoRaizQuadrada = Math.sqrt(numero1);
        
        System.out.println("Valor máximo é: "+resultadoMaximo);
        System.out.println("Valor mínimo é: "+resultadoMinimo);
        System.out.println("Valor absoluto do número 1 é: "+resultadoAbsoluto);
        System.out.println("Numero 1 elevado ao número 2 é: "+resultadoPotencia);
        System.out.println("Valor da raiz quadrada do valor 1 é: "+resultadoRaizQuadrada);
    }
    
}
