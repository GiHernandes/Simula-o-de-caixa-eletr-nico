public class CalculaJuros extends ContaOperacoes {
    private double jurosPositivo;
    private double jurosNegativo;
    private double simulacao;

    public void setJurosPositivo(double jurosPositivo){
    this.jurosPositivo = jurosPositivo;
    }

    public double getJurosPositivo(){
        return jurosPositivo;
    }

    public void setJurosNegativo(double jurosNegativo){
        this.jurosNegativo = jurosNegativo;
    }

    public double getJurosNegativo(){
        return jurosNegativo;
    }

    // método

    public void SimuladorMensal(int meses){
        simulacao = saldo;
        if (meses > 0){
            for (int i = 1; i <= meses; i++){
                if (simulacao >= 0){
                    simulacao += simulacao * jurosPositivo;
                } else {
                    simulacao += simulacao * jurosNegativo;
                    }
        }
            System.out.printf("Após %d meses, seu saldo é R$ %.2f%n", meses, simulacao);
            } else {
                System.out.println("Quantidade inválida.");
                }
    }
}