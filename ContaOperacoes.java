public class ContaOperacoes {
    protected double saldo;
    protected String ultimaOperacao;
    protected double valorUltimaOperacao;

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setUltimaOperacao(String ultimaOperacao){
        this.ultimaOperacao = ultimaOperacao;
    }

    public String getUltimaOperacao(){
        return ultimaOperacao;
    }

    public void setValorUltimaOperacao(double valorUltimaOperacao){
        this.valorUltimaOperacao = valorUltimaOperacao;
    }

    public double getValorUltimaOperacao(){
        return valorUltimaOperacao;
    }

    // métodos

    public void Sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            ultimaOperacao = "Saque";
            valorUltimaOperacao = valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o saque.");
        }
    } 

    public void Depositar(double valor){
        if (valor > 0){
            saldo += valor;
            ultimaOperacao = "Depósito";
            valorUltimaOperacao = valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o depósito.");
        }
    }

    public void Transferir(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            ultimaOperacao = "Transferência";
            valorUltimaOperacao = valor;
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Não foi possível realizar a transferência.");
        }
    }

    public void mostrarUltimaOperacao() {
        System.out.printf("Última operação: %s de R$ %.2f%n", ultimaOperacao, valorUltimaOperacao);
    }    
}