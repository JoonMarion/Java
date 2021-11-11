package aula.pkg2; // pacote

public class Metodo1 { // classe 
    void metodoUm() {
        System.out.println("Método sem argumentos!");
    }
    
    int metodoDois() {
        int valor1 = 10, valor2= 13;
        int total = valor1 * valor2;
        return total;
    }
    
    double metodo3(int arg1, int arg2){
        double total;
        total = (double)arg1/(double)arg2;
        return total;
    }
    
    public static void main(String[] args) {  // classe principal 
        Metodo1 mt1 = new Metodo1();          // criando objeto "mt1"
        mt1.metodoUm();                       // chamando método 1
        System.out.println(mt1.metodoDois()); // printando retorno do método 2
        double total = mt1.metodo3(10, 5);    // passando parâmetros para o método 3
        System.out.println(total);
}  
}
