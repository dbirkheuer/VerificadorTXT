package verificadortxt;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class PopuladorDeTabela {

    protected String idTabela;
    protected Class classe;
    protected ControllerDaTela controllerDaTela;

    private void redimensionarColunas() {

        this.controllerDaTela.defauldTableModel = (DefaultTableModel) this.controllerDaTela.tabela.getModel();
        this.controllerDaTela.defauldTableModel.setRowCount(0);
        this.controllerDaTela.defauldTableModel.setColumnCount(0);

        final TableColumnModel personalizacaoDaColuna = this.controllerDaTela.tabela.getColumnModel();
        int quantidadeDeLinhasDaTabela = this.controllerDaTela.tabela.getRowCount();
        int dimensao = 250;
        int quantidadeDeColunas = this.controllerDaTela.tabela.getColumnCount();

        for (int colunas = 0; colunas < quantidadeDeColunas; colunas++) {

            if (quantidadeDeLinhasDaTabela == 0) {

                for (int linhas = 0; linhas <= quantidadeDeLinhasDaTabela; linhas++) {
                    personalizacaoDaColuna.getColumn(colunas).setPreferredWidth(dimensao);
                }
            } else {
                for (int linhas = 0; linhas < quantidadeDeLinhasDaTabela; linhas++) {
                    TableCellRenderer renderer = this.controllerDaTela.tabela.getCellRenderer(linhas, colunas);
                    Component comp = this.controllerDaTela.tabela.prepareRenderer(renderer, linhas, colunas);
                    dimensao = Math.max(comp.getPreferredSize().width + 1, dimensao);
                    personalizacaoDaColuna.getColumn(colunas).setPreferredWidth(dimensao);

                }
            }
        }

    }

    public void executar() throws Exception {
        new ConstrutorDeColunasDaTabela().setClasse(this.classe).setTabela(this.controllerDaTela.tabela).executar();

        redimensionarColunas();

        List<String> lista = new Leitor().setDiretorioDoArquivo(this.controllerDaTela.arquivoParaAnalisar).executar();

        for (String linha : lista) {
            if (linha.startsWith(idTabela)) {
                int i = this.idTabela.length();
                this.controllerDaTela.defauldTableModel.addRow(linha.substring(i).split("\\|"));
            }
        }
    }

    public PopuladorDeTabela setIdTabela(String idTabela) {
        this.idTabela = idTabela;
        return this;
    }

    public PopuladorDeTabela setClasse(Class classe) {
        this.classe = classe;
        return this;
    }

    public PopuladorDeTabela setControllerDaTela(ControllerDaTela controllerDaTela) {
        this.controllerDaTela = controllerDaTela;
        return this;
    }

}
