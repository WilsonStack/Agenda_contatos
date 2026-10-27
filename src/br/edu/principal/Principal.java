package br.edu.principal;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        
        Contato c1 = new Contato();
        c1.nome = "Maria Silva";
        c1.celular = "(85) 99999-1111";
        c1.email = "maria@email.com";

        Contato c2 = new Contato();
        c2.nome = "João Souza";
        c2.celular = "(85) 98888-2222";
        c2.email = "joao@email.com";

        System.out.println("=== Teste de Objetos (v3.0.0) ===");
        System.out.println("Objeto 1: " + c1.nome + " - " + c1.celular + " - " + c1.email);
        System.out.println("Objeto 2: " + c2.nome + " - " + c2.celular + " - " + c2.email);
        System.out.println();


        List<String> nomes = new ArrayList<>();
        List<String> celulares = new ArrayList<>();
        List<String> emails = new ArrayList<>();

        Persistencia.carregarContatos(nomes, celulares, emails);
        Uteis.mostraInicializacao();

        int opcao;
        do {
            Uteis.mostraMenu();
            opcao = Uteis.lerOpcao();

            switch (opcao) {
                case 1:
                    Agenda.adicionar(nomes, celulares, emails);
                    break;
                case 2:
                    Agenda.listar(nomes, celulares, emails);
                    break;
                case 3:
                    Agenda.pesquisar(nomes, celulares, emails);
                    break;
                case 4:
                    Agenda.atualizar(nomes, celulares, emails);
                    break;
                case 5:
                    Agenda.excluir(nomes, celulares, emails);
                    break;
                case 0:
                    Persistencia.salvarContatos(nomes, celulares, emails);
                    Uteis.mostraEncerramento();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}