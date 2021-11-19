package segundaatividade;

public class TestaConta {

    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        c1.titular = "joon";
        c1.saldo = 100;
        c1.agencia = "792";
        c1.conta = "32545";
        Data data = new Data();
        c1.dataDeAbertura = data;
        c1.dataDeAbertura.dia = 20;
        c1.dataDeAbertura.mes = 06;
        c1.dataDeAbertura.ano = 2001;
        
        System.out.println(c1.recuperaDadosParaImpressao());
    }
}
 