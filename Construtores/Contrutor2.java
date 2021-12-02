package contrutor2;

import java.util.Scanner;

public class Contrutor2 {

    public static void main(String[] args) {
        Pera pr1 = new Pera(50.00);
        Pera pr2 = new Pera(-7.53);
        
        System.out.println("Objeto 1 > Saldo: "+pr1.getSaldo());
        System.out.println("Objeto 2 > Saldo: "+pr2.getSaldo());
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com a quantia para deposito na primeira conta: ");
        double quantiadeposito = input.nextDouble();
        pr1.credito(quantiadeposito);
        
        System.out.println("Entre com a quantia para deposito na segunda conta: ");
        double quantiadeposito2 = input.nextDouble();
        pr2.credito(quantiadeposito2);
        
        System.out.println("Saldo 1: "+pr1.getSaldo());
        System.out.println("Saldo 2: "+pr2.getSaldo());
     }
 
}
