package br.edu.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

    private List<String> nomes = new ArrayList<>();
    private List<String> celulares = new ArrayList<>();
    private List<String> emails = new ArrayList<>();

    public void adicionar(Scanner sc) {
        System.out.println("=== ADICIONAR CONTATO ===");
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o celular: ");
        String celular = sc.nextLine();
        System.out.print("Digite o email: ");
        String email = sc.nextLine();

        nomes.add(nome);
        celulares.add(celular);
        emails.add(email);

        System.out.println("Contato adicionado com sucesso!");
    }

    public void listar() {
        System.out.println("=== LISTAR CONTATOS ===");
        if (nomes.isEmpty()) {
            System.out.println("Nenhum contato cadastrado!");
        } else {
            for (int i = 0; i < nomes.size(); i++) {
                System.out.println("--------------------------");
                System.out.println("Nome: " + nomes.get(i));
                System.out.println("Celular: " + celulares.get(i));
                System.out.println("Email: " + emails.get(i));
            }
        }
    }

    public void pesquisar(Scanner sc) {
        System.out.println("=== PROCURAR CONTATO ===");
        System.out.print("Digite o nome do contato: ");
        String nomeBusca = sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase(nomeBusca)) {
                System.out.println("--------------------------");
                System.out.println("Nome: " + nomes.get(i));
                System.out.println("Celular: " + celulares.get(i));
                System.out.println("Email: " + emails.get(i));
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Contato não encontrado!");
        }
    }

    public void atualizar(Scanner sc) {
        System.out.println("=== ALTERAR CONTATO ===");
        System.out.print("Digite o nome do contato: ");
        String nomeProcurado = sc.nextLine();

        int posicao = -1;
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase(nomeProcurado)) {
                posicao = i;
            }
        }

        if (posicao != -1) {
            System.out.print("Digite o novo nome: ");
            String novoNome = sc.nextLine();

            System.out.print("Digite o novo celular: ");
            String novoCelular = sc.nextLine();

            System.out.print("Digite o novo email: ");
            String novoEmail = sc.nextLine();

            nomes.set(posicao, novoNome);
            celulares.set(posicao, novoCelular);
            emails.set(posicao, novoEmail);

            System.out.println("Contato alterado com sucesso!");
        } else {
            System.out.println("Contato não encontrado!");
        }
    }

    public void excluir(Scanner sc) {
        System.out.println("=== EXCLUIR CONTATO ===");
        System.out.print("Digite o nome do contato: ");
        String nomeExcluir = sc.nextLine();

        boolean excluido = false;

        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase(nomeExcluir)) {
                nomes.remove(i);
                celulares.remove(i);
                emails.remove(i);

                excluido = true;
                System.out.println("Contato excluído com sucesso!");
                break;
            }
        }
        if (!excluido) {
            System.out.println("Contato não encontrado!");
        }
    }
}