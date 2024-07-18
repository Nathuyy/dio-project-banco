import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 


        while (true) {
            System.out.println("Número da conta: ");
            int numeroConta = leitor.nextInt();

            if (numeroConta <= 0) {
                System.out.println("Número inválido");
            } else {
                System.out.println("Número da conta: " + numeroConta);
                break;
            }
            
        }

        while (true) {
            System.out.println("Agência: ");
            int agencia = leitor.nextInt();

            if (agencia <= 0) {
                System.out.println("Número inválido");
            } else {
                System.out.println("Agência: " + agencia);
                break;
            }
        }

        while (true) {
            System.out.println("Nome do titular: ");
            String nomeTitular = leitor.next();
            
            if (nomeTitular.isEmpty()) {
                System.out.println("Nome inválido");
            } else {
                System.out.println("Nome do titular: " + nomeTitular);
                break;
            }
            
        }
        while (true) {
            System.out.println("Saldo: ");
            double saldo = leitor.nextDouble();
            
            if (saldo <= 0) {
                System.out.println("Saldo inválido");
            } else {
                System.out.println("Saldo: " + saldo);
                break;
            }
            
        }

        System.out.println("Operação realizada com sucesso");

       

    }
    
}