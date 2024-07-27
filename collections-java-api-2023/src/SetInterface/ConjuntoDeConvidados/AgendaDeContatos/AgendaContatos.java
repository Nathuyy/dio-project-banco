package SetInterface.ConjuntoDeConvidados.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)) { //todo contato que começar so com Nathália vai aparecer
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarContato(String nome, int numero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

        public static void main(String[] args) {
            // Criando uma instância da classe AgendaContatos
            AgendaContatos agendaContatos = new AgendaContatos();

            // Exibindo os contatos no conjunto (deve estar vazio)
            agendaContatos.exibirContatos();

            // Adicionando contatos à agenda
            agendaContatos.adicionarContato("João", 123456789);
            agendaContatos.adicionarContato("Maria", 987654321);
            agendaContatos.adicionarContato("Maria Fernandes", 55555555);
            agendaContatos.adicionarContato("Ana", 88889999);
            agendaContatos.adicionarContato("Fernando", 77778888);
            agendaContatos.adicionarContato("Carolina", 55555555);

            // Exibindo os contatos na agenda
            agendaContatos.exibirContatos();

            // Pesquisando contatos pelo nome
            System.out.println(agendaContatos.pesquisarPorNome("Maria"));

            // Atualizando o número de um contato
            Contato contatoAtualizado = agendaContatos.atualizarContato("Carolina", 44443333);
            System.out.println("Contato atualizado: " + contatoAtualizado);

            // Exibindo os contatos atualizados na agenda
            System.out.println("Contatos na agenda após atualização:");
            agendaContatos.exibirContatos();
        }
    }
