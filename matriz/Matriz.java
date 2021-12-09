package matriz;

public class Matriz {

    public static void main(String[] args) 
    {
        int[][] vetor1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] vetor2 = {{1, 2}, {3}, {4, 5, 6}};
    
        System.out.println("vetor1");
        SaidaVetor(vetor1);
        
        System.out.println("vetor2");
        SaidaVetor(vetor2);
    }
    
    public static void SaidaVetor(int[][] vetor)
    {
        for(int linha = 0; linha < vetor.length; linha++)
        {
            for(int coluna = 0; coluna < vetor[linha].length; coluna++)
            {
                System.out.println(vetor[linha][coluna]);
            }
            System.out.println();
        }
    }
    
}
