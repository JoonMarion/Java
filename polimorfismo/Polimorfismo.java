package polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
        Animais animais = new Peixe();
        animais.mover();
        
        Animais animais2 = new Passaro();
        animais2.mover();
        
        relatorio(animais2);
    }
    
    static void relatorio(Animais anim) {
        anim.mover();
    }
}
