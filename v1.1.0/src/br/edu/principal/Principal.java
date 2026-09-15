package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        boolean continuar = true;

        Uteis.mostraInicializacao();

        while (continuar) {
            Uteis.mostraMenu();
            int opcao = Uteis.selecionaOpcao(sc);

            switch (opcao) {
                case 1 -> agenda.adicionar(sc);
                case 2 -> agenda.listar();
                case 3 -> agenda.pesquisar(sc);
                case 4 -> agenda.atualizar(sc);
                case 5 -> agenda.excluir(sc);
                case 6 -> continuar = Uteis.sair(); // Permanece true, não encerra o programa
                default -> System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}