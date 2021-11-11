package aula.pkg2;

public class privateSetGet {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }
    
    public void display() {
        System.out.println("O nome do curso é: "+nome);

    } 

}
