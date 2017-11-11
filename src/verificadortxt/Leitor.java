package verificadortxt;

import java.io.BufferedReader;
import java.io.FileReader;

public class Leitor {

    private String diretorioDoArquivo;
    private File arquivo;

    public Leitor setDiretorioDoArquivo(String diretorioDoArquivo) {

        this.diretorioDoArquivo = diretorioDoArquivo;
        this.arquivo = new File(this.diretorioDoArquivo);

        return this;
    }

    public Leitor setArquivo(File arquivo) {

        this.arquivo = arquivo;
        return this;
    }

    public List<String> executar() throws Exception {

        if (this.arquivo == null) {
            throw new Exception("O arquivo está null. Tem certeza que o arquivo existe?");
        }

        List<String> lista = new ArrayList<String>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(this.arquivo));

        String linha = "";
        while ((linha = bufferedReader.readLine()) != null) {
            lista.add(linha);
        }

        bufferedReader.close();
        return lista;
    }

}