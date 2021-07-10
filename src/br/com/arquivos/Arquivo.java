package br.com.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
    public static void main(String[] args) throws IOException {
        File arquivo = new File("D:\\user\\Documentos\\JDEV-TREINAMENTOS\\Projetos\\ler-arquivos\\arquivo.csv");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Pablo");
        pessoa1.setEmail("pablojuniorgn@ada");
        pessoa1.setIdade(15);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("junior");
        pessoa2.setEmail("juniorgn@ada");
        pessoa2.setIdade(17);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("guti");
        pessoa3.setEmail("guti@ada");
        pessoa3.setIdade(14);

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);



        if (!arquivo.exists()){
            arquivo.createNewFile();
        }
        FileWriter escrever = new FileWriter(arquivo);

        for (Pessoa p : pessoas) {
            escrever.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
        }

        escrever.flush();
        escrever.close();


    }
}
