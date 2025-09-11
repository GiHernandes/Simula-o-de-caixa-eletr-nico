import java.util.Scanner;
//import java.time.localDateTime;    

public class ContaCorrente {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        ClienteBanco cliente = new ClienteBanco();
        cliente.setNome("Giovanna");
        cliente.setTipoConta("Corrente");

        //ContaOperacoes operacao = new ContaOperacoes();
        //operacao.setSaldo(2000.00);

        CalculaJuros juros = new CalculaJuros();
        juros.setSaldo(2000.0);
        juros.setJurosNegativo(0.12);
        juros.setJurosPositivo(0.05);

        int escolha = 0;
        while (escolha != 6){
        // Apresentar dados iniciais...
        System.out.println("**********************************************************");
        System.out.println("\nOlá " + cliente.getNome() + ", seja bem-vindo(a)!");
        System.out.println("\nConta: " + cliente.getTipoConta());
        System.out.printf("\nSaldo atual: R$ %.2f%n", juros.getSaldo());


        //String nome = "Giovanna";
        //String tipoConta = "Conta corrente";
        //Double saldo = 1800.00;
        //Double limiteEspecial = 500.00; // até onde pode ficar negativo
        //Double jurosPositivo = 0.1; // 1% ao mês
        //Double jurosNegativos = 0.5; // 5% ao mês
        //Double simulacao = 0.0;
        //int escolha;
        //String ultimaOperacao = "Nenhuma";
        //double valorUltimaOperacao = 0.0;

        //while (escolha != 6){
        // Apresentar dados iniciais...
        //System.out.println("**********************************************************");
        //System.out.println("\nOlá " + nome + ", seja bem-vindo(a)!");
        //System.out.println("\nConta: " + tipoConta);
        //System.out.printf("\nSaldo atual: R$ %.2f%n", saldo);
        //System.out.println("\n**********************************************************");

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
                    juros.Sacar(leitura.nextDouble());
                    break;

                case 2:
                    System.out.println("Digite o valor a ser depositado: ");
                    juros.Depositar(leitura.nextDouble());
                    break;
            
                case 3:
                    System.out.println("Digite o valor a ser transferido: ");
                    juros.Transferir(leitura.nextDouble());
                    break;

                case 4:
                    System.out.printf("Última operação: %s de R$ %.2f%n", juros.getUltimaOperacao(), juros.getValorUltimaOperacao());
                
                case 5:
                    System.out.println("Digite quantos meses deseja simular: ");
                    juros.SimuladorMensal(leitura.nextInt());
                    break;

                case 6:
                    System.out.println("Obrigada por utilizar nossos serviços " + cliente.getNome() + "!\nVolte sempre!!");
                    break;
                default:
                    System.out.println("Opção inválida. \nTente novamente.");
            } 
        }       
    }
}