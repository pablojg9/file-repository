package br.com.arquivos;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream entrada = new FileInputStream(new File("D:\\user\\Documentos\\JDEV-TREINAMENTOS\\Projetos\\ler-arquivos\\arquivo.txt"));

        Scanner scanner = new Scanner(entrada, "UTF-8");
        StringBuilder stringBuilder = new StringBuilder();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while(scanner.hasNext()) {
            String line = scanner.nextLine();

            if (!line.isEmpty()) {
                String[] dados = line.split("\\;");

                Pessoa pessoa = new Pessoa();
                pessoa.setNome(dados[0]);
                pessoa.setEmail(dados[1]);
                pessoa.setIdade(Integer.parseInt(dados[2]));

                stringBuilder.append(line).append("\n");
                pessoas.add(pessoa);
            }


        }

        JOptionPane.showMessageDialog(null, stringBuilder.toString());

    }


}
