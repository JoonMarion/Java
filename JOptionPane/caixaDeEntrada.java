package joptionpane;
import javax.swing.JOptionPane;

public class caixaDeEntrada {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual seu nome?");
        
        String mensagem = String.format("Bem-vindo ao curso Java, "+ nome);
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
