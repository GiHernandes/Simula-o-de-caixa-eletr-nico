import java.util.Scanner;

public class ContaCorrente{
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        String nome = "Giovanna";
        String tipoConta = "Conta corrente";
        Double saldo = 1800.00;
        int escolha = 0;

        while (escolha != 4){
        // Apresentar dados iniciais...
        System.out.println("**********************************************************");
        System.out.println("\nOlá " + nome + ", seja bem-vindo(a)!");
        System.out.println("\nConta: " + tipoConta);
        System.out.println("\nSaldo atual: " + saldo);
        System.out.println("\n**********************************************************");

        //Prompt de opções:
        System.out.println("\nEscolha uma opção:");
        System.out.println("\n[1] Sacar");
        System.out.println("[2] Depositar");
        System.out.println("[3] Transferir");
        System.out.println("[4] Sair");
        escolha = leitura.nextInt();
        
            if(escolha == 1){
                System.out.println("Digite o valor a ser sacado: ");
                Double saque = leitura.nextDouble();
                if (saque <= saldo){
                    saldo -= saque;
                    System.out.println("Saque realizado com sucesso," + nome + "!");
                    System.out.println("Saldo atual: %.2f" + saldo);
                } else{
                    System.out.println("Saldo insuficiente para realizar o saque desejado...");
                }
            }

            else if(escolha == 2){
                System.out.println("Digite o valor a ser depositado: ");
                Double deposito = leitura.nextDouble();
                saldo += deposito;
                System.out.println("Depósito realizado com sucesso, " + nome + "!. \nSeu novo saldo é: " + saldo);
            }
            
            else if(escolha == 3){
                System.out.println("Digite o valor a ser transferido: ");
                Double transferencia = leitura.nextDouble();
                if(transferencia <= saldo){
                    saldo -= transferencia;
                    System.out.println("Transferência realizada com sucesso, " + nome + "! \nSeu novo saldo é: " + saldo);
                } else{
                    System.out.println("Saldo insuficiente para realizar a transferência desejada...");
                }
            
            }
            else if(escolha == 4){
                System.out.println("Obrigada por utilizar nossos serviços " + nome + "!\nVolte sempre!!");
                break;
            } else{
                System.out.println("Opção inválida. \nTente novamente.");
            } 
        }       
    }
}