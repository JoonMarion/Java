package vetor;

public class Vetor1 {

    public static void main(String[] args) {
        int[] vetor = {32, 27, 456, 12, 54, 23};
        /*vetor = new int[5];*/
        
        System.out.println("index, value");
        
        for(int contador = 0; contador < vetor.length; contador++){
            System.out.printf("%d         %d \n", contador, vetor[contador]);
        }
    }
    
}
