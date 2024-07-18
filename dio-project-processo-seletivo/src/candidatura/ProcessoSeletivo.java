package candidatura;
import java.util.Scanner;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o seu salário pretendido?");
        double salarioPretendido = leitor.nextDouble();
        analisarCandidato(salarioPretendido);


        leitor.close();
    }

    static void analisarCandidato(double salarioPretendido ) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Candidato Aprovado");   
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Candidato Aprovado");
        } else {
            System.out.println("Candidato Reprovado");
        }
    }
}