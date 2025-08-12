import java.util.Scanner;
//import java.time.localDateTime;    

public class ContaCorrente{
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        String nome = "Giovanna";
        String tipoConta = "Conta corrente";
        Double saldo = 1800.00;
        Double limiteEspecial = 500.00; // até onde pode ficar negativo
        Double jurosPositivo = 0.1; // 1% ao mês
        Double jurosNegativos = 0.5; // 5% ao mês
        Double simulacao = 0.0;
        int escolha = 0;
        String ultimaOperacao = "Nenhuma";
        double valorUltimaOperacao = 0.0;

        while (escolha != 6){
        // Apresentar dados iniciais...
        System.out.println("**********************************************************");
        System.out.println("\nOlá " + nome + ", seja bem-vindo(a)!");
        System.out.println("\nConta: " + tipoConta);
        System.out.printf("\nSaldo atual: R$ %.2f%n", saldo);
        System.out.println("\n**********************************************************");

        //Prompt de opções:
        System.out.println("\nEscolha uma opção:");
        System.out.println("\n[1] Sacar");
        System.out.println("[2] Depositar");
        System.out.println("[3] Transferir");
        System.out.println("[4] Última operação");
        System.out.println("[5] Simular passagem de mês");
        System.out.println("[6] Sair");
        escolha = leitura.nextInt();
            
            switch (escolha) {
                case 1:
                System.out.println("Digite o valor a ser sacado: ");
                Double saque = leitura.nextDouble();
                if (saque > 0 && saque <= saldo){
                    saldo -= saque;
                    ultimaOperacao = "saque";
                    valorUltimaOperacao = saque;
                    System.out.println("Saque realizado com sucesso," + nome + "!");
                    System.out.println("Saldo atual: %.2f" + saldo);
                } else{
                    System.out.println("Saldo insuficiente para realizar o saque desejado...");
                }
                break;

            case 2:
                System.out.println("Digite o valor a ser depositado: ");
                Double deposito = leitura.nextDouble();
                if (deposito > 0){
                    saldo += deposito;
                    ultimaOperacao = "Depósito";
                    valorUltimaOperacao = deposito;
                    System.out.println("Depósito realizado com sucesso, " + nome + "!. \nSeu novo saldo é: " + saldo);
                } else {
                    System.out.println("Valor menor ou igual a zero. A operação não será realizada...");
                }
                break;
            
                case 3:
                System.out.println("Digite o valor a ser transferido: ");
                Double transferencia = leitura.nextDouble();
                if(transferencia > 0 && transferencia <= saldo){
                    saldo -= transferencia;
                    ultimaOperacao = "Transferência";
                    valorUltimaOperacao = transferencia;
                    System.out.println("Transferência realizada com sucesso, " + nome + "! \nSeu novo saldo é: " + saldo);
                } else{
                    System.out.println("Saldo insuficiente para realizar a transferência desejada...");
                }
                break;

                case 4:
                    System.out.printf("Última operação: %s de R$ %.2f%n", ultimaOperacao, valorUltimaOperacao);
                    break;
                
                case 5:
                    System.out.println("Quantos meses deseja simular?");
                    int meses = leitura.nextInt();
                    if (meses > 0){
                        for (int i = 1; i <= meses; i++){
                            if (saldo >= 0){
                                simulacao = saldo + (saldo * jurosPositivo);
                            } else {
                                simulacao = saldo + (saldo * jurosNegativos);
                            }
                        }
                        System.out.printf("Após %d meses, seu saldo é R$ %.2f%n", meses, simulacao);
                    } else {
                        System.out.println("Quantidade inválida.");
                    }
                    break;
            
                case 6:
                    System.out.println("Obrigada por utilizar nossos serviços " + nome + "!\nVolte sempre!!");
                    break;
                default:
                    System.out.println("Opção inválida. \nTente novamente.");
            } 
        }       
    }
}