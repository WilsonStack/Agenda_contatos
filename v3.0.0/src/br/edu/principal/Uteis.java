package br.edu.principal;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Uteis {

    public static void mostraInicializacao() {
        System.out.println("==========================");
        System.out.println("    AGENDA DE CONTATOS    ");
        System.out.println("          v3.0.0          ");
        System.out.println("==========================");
        System.out.println("Bem-vindo!");
    }

    public static void mostraMenu() {
        System.out.println();
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Listar contatos");
        System.out.println("3 - Procurar contato");
        System.out.println("4 - Alterar contato");
        System.out.println("5 - Excluir contato");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int lerOpcao() {
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        sc.nextLine();
        return opcao;
    }

    public static void mostraEncerramento() {
        System.out.println("Encerrando a agenda... Até logo!");
    }

    public static void exibirMensagem(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}