package modificadoresdeacesso;

public class ComissaoFuncionarioTeste {

    public static void main(String[] args) {
        ComissaoFuncionario funcionario = new ComissaoFuncionario("Thiago", "Nicolau", "222-22-2222", 1000, 0.06);
        
        System.out.printf("O nome é: %s\n", funcionario.getPrimeironome());
        System.out.printf("Sobrenome é: %s\n", funcionario.getUltimonome());
        System.out.printf("O número de segurança social é: %s\n", funcionario.getNumerosocial());
        System.out.printf("Valor bruto da semana é: %.2f\n", funcionario.getVendasbrutas());
        System.out.printf("Porcentagem da comissão é: %.2f\n", funcionario.setPorcentagemcomissao());
        
        funcionario.setVendasbrutas(500);
        funcionario.setPorcentagemcomissao(0.1);

    }
    
}
