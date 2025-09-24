public class ContaPoupanca extends ContaOperacoes{
    private ContaOperacoes conta;
    private double saldoPoupanca;
    private double rendimento;
    private double taxaPoupanca;
    private double calculoRendimento;
    private double calculoTaxaPoupanca;

    public ContaPoupanca(ContaOperacoes conta){
        this.conta = conta;
        this.saldoPoupanca = 0;
    }

    public void setSaldoPoupanca(double saldoPoupanca){
        this.saldoPoupanca = saldoPoupanca;
    }

    public double getSaldoPoupanca(){
        return saldoPoupanca;
    }

    public void setRendimento(double rendimento){
        this.rendimento = rendimento;
    }

    public double getRendimento(){
        return rendimento;
    }

    public void setTaxaPoupanca(double taxaPoupanca){
        this.taxaPoupanca = taxaPoupanca;
    }

    public double getTaxaPoupanca(){
        return taxaPoupanca;
    }

            public void aplicarNaPoupanca(double investimento){
            if (investimento > 0 && investimento <= conta.getSaldo()){
                if (investimento >= 500){
                calculoRendimento = saldoPoupanca * rendimento;
                saldoPoupanca += calculoRendimento;
                }
                conta.setSaldo(conta.getSaldo() - investimento);
                saldoPoupanca += investimento;
                calculoTaxaPoupanca = saldoPoupanca * taxaPoupanca;
                saldoPoupanca += calculoTaxaPoupanca;
                conta.setUltimaOperacao("Aplicação em conta poupança");
                conta.setValorUltimaOperacao(investimento);
                System.out.println("Valor aplicado com sucesso!");
            } else {
                System.out.println("Não foi possível realizar a aplicação.");
            }
        }
        
    public void retirarDaPoupanca(double valor){
        if (valor > 0 && valor <= saldoPoupanca){
            saldoPoupanca -= valor;
            conta.setSaldo(conta.getSaldo() + valor);
            conta.setUltimaOperacao("Retirar da poupança");
            conta.setValorUltimaOperacao(valor);
            System.out.println("Retirada da poupança realizada com sucesso!");
        } else {
            System.out.println("Não foi possível realizar a operação");
        }
    }
}