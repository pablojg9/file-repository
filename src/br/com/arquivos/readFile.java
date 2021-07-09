package br.com.arquivos;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream entrada = new FileInputStream(new File("D:\\user\\Documentos\\JDEV-TREINAMENTOS\\Projetos\\ler-arquivos\\arquivo.txt"));

        Scanner scanner = new Scanner(entrada, "UTF-8");
        StringBuilder stringBuilder = new StringBuilder();

        while(scanner.hasNext()) {
            String line = scanner.nextLine();

            if (!line.isEmpty()) {
                stringBuilder.append(line).append("\n");
            }


        }

        JOptionPane.showMessageDialog(null, stringBuilder.toString());

    }


}
