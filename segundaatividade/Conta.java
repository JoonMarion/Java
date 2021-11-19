package segundaatividade;

public class Conta {
    String titular;
    String conta;
    String agencia;
    Data dataDeAbertura;
    int numero; 
    double saldo;
  
    double sacar(float saque) {
        saldo = (float)saque - saldo;
        return saldo;
    }
    
    double depositar(float deposito) {
        saldo = (float)deposito + saldo;
        return saldo; 
    } 
    
    double calculaRendimento() {
        double rendimento;
        rendimento = saldo * 0.1;
        return rendimento;
    }
    
    String recuperaDadosParaImpressao(){
        String dados = "Titular: "+this.titular;
        dados += "\nAgência: "+this.agencia;
        dados += "\nConta: "+this.conta;
        dados += "\nSaldo: "+this.saldo;
        dados += "\nData de abertura: "+this.dataDeAbertura.formatada();
        return dados; 
    }
}
