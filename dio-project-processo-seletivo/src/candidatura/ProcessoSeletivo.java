package candidatura;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
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

    static void imprimirSelecionados(){
        String [] candidatos = {"Candidato 1","Candidato 2","Candidato 3","Candidato 4"};
        System.out.println("Candidatos selecionados para a vaga: ");
        for(int i = 0; i < candidatos.length; i++){
            System.out.println(candidatos[i] + "índice do candidato: " + i);
        }
    }
}