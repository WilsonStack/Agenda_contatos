package br.edu.principal;

import java.util.List;
import java.util.Scanner;

public class Agenda {

    public static void adicionar(Scanner sc, List<String> nomes, List<String> celulares, List<String> emails) {
        System.out.print("Nome: ");
        nomes.add(sc.nextLine());
        System.out.print("Celular: ");
        celulares.add(sc.nextLine());
        System.out.print("E-mail: ");
        emails.add(sc.nextLine());
        System.out.println("Contato adicionado com sucesso!");
    }

    public static void listar(List<String> nomes, List<String> celulares, List<String> emails) {
        if (nomes.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }
        System.out.println("\n--- Lista de Contatos ---");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println((i + 1) + ". " + nomes.get(i) + " | " + celulares.get(i) + " | " + emails.get(i));
        }
    }

    public static void pesquisar(Scanner sc, List<String> nomes, List<String> celulares, List<String> emails) {
        System.out.print("Digite o nome para pesquisar: ");
        String termo = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase(termo)) {
                System.out.println("Encontrado: " + nomes.get(i) + " | " + celulares.get(i) + " | " + emails.get(i));
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Contato não encontrado!");
        }
    }

    public static void atualizar(Scanner sc, List<String> nomes, List<String> celulares, List<String> emails) {
        System.out.print("Digite o nome do contato que deseja alterar: ");
        String termo = sc.nextLine();

        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase(termo)) {
                System.out.print("Novo nome: ");
                nomes.set(i, sc.nextLine());
                System.out.print("Novo celular: ");
                celulares.set(i, sc.nextLine());
                System.out.print("Novo e-mail: ");
                emails.set(i, sc.nextLine());
                System.out.println("Contato alterado com sucesso!");
                return;
            }
        }
        System.out.println("Contato não encontrado!");
    }

    public static void excluir(Scanner sc, List<String> nomes, List<String> celulares, List<String> emails) {
        System.out.print("Digite o nome do contato que deseja excluir: ");
        String termo = sc.nextLine();

        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase(termo)) {
                nomes.remove(i);
                celulares.remove(i);
                emails.remove(i);
                System.out.println("Contato excluído com sucesso!");
                return;
            }
        }
        System.out.println("Contato não encontrado!");
    }
}