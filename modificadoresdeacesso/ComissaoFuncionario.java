package modificadoresdeacesso;

public class ComissaoFuncionario extends Object {
    private String primeironome;
    private String ultimonome;
    private String numerosocial;
    private double vendasbrutas;
    private double porcentagemcomissao;
    
    public ComissaoFuncionario(String primeironome, String ultimonome, String numerosocial, double vendasbrutas, double porcentagemcomissao)
    {
        this.primeironome = primeironome;
        this.ultimonome = ultimonome;
        this.numerosocial = numerosocial;
        setVendasbrutas(vendasbrutas);
        setPorcentagemcomissao(porcentagemcomissao);
    }

    public String getPrimeironome() {
        return primeironome;
    }

    public void setPrimeironome(String primeironome) {
        this.primeironome = primeironome;
    }
    
    public String getUltimonome() {
        return ultimonome;
    }

    public void setUltimonome(String ultimonome) {
        this.ultimonome = ultimonome;
    }
    
    public String getNumerosocial() {
        return numerosocial;
    }

    public void setNumerosocial(String numerosocial) {
        this.numerosocial = numerosocial;
    }
    
    public double getVendasbrutas() {
        return vendasbrutas;
    }
    
    public void setVendasbrutas(double vendasbrutas) {
        this.vendasbrutas = (vendasbrutas < 0.0) ? 0.0 : vendasbrutas;
    }    

    public double getPorcentagemcomissao() {
        return porcentagemcomissao;
    }
    
    public void setPorcentagemcomissao(double porcentagemcomissao) {
        this.porcentagemcomissao = (porcentagemcomissao > 0.0 && porcentagemcomissao < 1.0) ? porcentagemcomissao : 0.0;
    }
    
    public double calculalucros(){
        return porcentagemcomissao * vendasbrutas;
    }

    String setPorcentagemcomissao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}   
