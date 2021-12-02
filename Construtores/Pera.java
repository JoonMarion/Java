package contrutor2;

public class Pera {
    private double saldo;
    
    public Pera(double saldoinicial){
        if(saldoinicial > 0.0) {
            saldo = saldoinicial;
        }
    }
    public void credito(double quantia){
        saldo = quantia + saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
