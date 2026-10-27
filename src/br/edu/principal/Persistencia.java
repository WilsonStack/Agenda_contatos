package br.edu.principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Persistencia {

    private static final String ARQUIVO = "contatos.txt";

    public static void carregarContatos(List<String> nomes, List<String> celulares, List<String> emails) {
        File file = new File(ARQUIVO);
        if (!file.exists()) {
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 3) {
                    nomes.add(partes[0]);
                    celulares.add(partes[1]);
                    emails.add(partes[2]);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar contatos: " + e.getMessage());
        }
    }

    public static void salvarContatos(List<String> nomes, List<String> celulares, List<String> emails) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (int i = 0; i < nomes.size(); i++) {
                bw.write(nomes.get(i) + ";" + celulares.get(i) + ";" + emails.get(i));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar contatos: " + e.getMessage());
        }
    }
}