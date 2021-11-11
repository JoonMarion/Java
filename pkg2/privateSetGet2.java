package aula.pkg2;

import java.util.Scanner;

public class privateSetGet2 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        privateSetGet lj = new privateSetGet();
        
        System.out.println("O nome inicialmente do curso é: "+lj.getNome());
        
        System.out.println("Informe o nome do curso: ");
        String nomeNovo = input.nextLine();
        lj.setNome(nomeNovo);
        System.out.println();
        lj.display();
        
}
}
