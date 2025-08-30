import java.util.Scanner;

public class Banco {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Criando contas
        ContaCorrente conta1 = new ContaCorrente("001", "Patrick", 1000);
        ContaPoupanca conta2 = new ContaPoupanca("002", "Ana", 500);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== MEU BANCO ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Ver saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para depósito na conta de Patrick: ");
                    double dep = sc.nextDouble();
                    conta1.depositar(dep);
                    break;
                case 2:
                    System.out.print("Valor para saque na conta de Patrick: ");
                    double saq = sc.nextDouble();
                    conta1.sacar(saq);
                    break;
                case 3:
                    System.out.print("Valor para transferir de Patrick para Ana: ");
                    double transf = sc.nextDouble();
                    conta1.transferir(conta2, transf);
                    break;
                case 4:
                    System.out.println("Saldo Patrick: R$" + conta1.getSaldo());
                    System.out.println("Saldo Ana: R$" + conta2.getSaldo());
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
        
    }
}
