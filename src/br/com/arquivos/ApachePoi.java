package br.com.arquivos;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApachePoi {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\user\\Documentos\\JDEV-TREINAMENTOS\\Projetos\\ler-arquivos\\arquivo._excel.xsl");

        if (!file.exists()) {
            file.createNewFile();
        }

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

        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        HSSFSheet linePessoa = hssfWorkbook.createSheet("Planilha de pessoas");

        int lineNumber = 0;
        for(Pessoa p : pessoas) {
            Row line = linePessoa.createRow(lineNumber++); //Criando a linha na planilha

            int cell = 0;

            Cell cellName = line.createCell(cell++);
            cellName.setCellValue(p.getNome());

            Cell cellEmail = line.createCell(cell++);
            cellEmail.setCellValue(p.getEmail());

            Cell cellAge = line.createCell(cell++);
            cellAge.setCellValue(p.getIdade());
        }


    }

}
