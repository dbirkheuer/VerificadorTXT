/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificadortxt;

import java.awt.Component;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author djbir
 */
public class CriadorDaTabela
{

    protected String idTabela;
    protected Class classe;
    protected ControllerDaTela controllerDaTela;

    public void executar() throws Exception
    {
        new ConstrutorDeColunasDaTabela()
                .setClasse( classe )
                .setTabela( controllerDaTela.tabela )
                .executar();

        redimensionarColunas();

        //new CriadorDeLinhaDaTabela()
                //.setController( controllerDaTela )
                //.executar();

    }

    public CriadorDaTabela setIdTabela( String idTabela )
    {
        this.idTabela = idTabela;
        return this;
    }

    public CriadorDaTabela setClasse( Class classe )
    {
        this.classe = classe;
        return this;
    }

    public CriadorDaTabela setController( ControllerDaTela controllerDaTela )
    {
        this.controllerDaTela = controllerDaTela;
        return this;
    }

    private void redimensionarColunas()
    {
        final TableColumnModel personalizacaoDaColuna = this.controllerDaTela.tabela.getColumnModel();
        int quantidadeDeLinhasDaTabela = this.controllerDaTela.tabela.getRowCount();
        int dimensão = 250;
        int quantidadeDeColunas = this.controllerDaTela.tabela.getColumnCount();

        for ( int colunas = 0; colunas < quantidadeDeColunas; colunas++ )
        {

            if ( quantidadeDeLinhasDaTabela == 0 )
            {

                for ( int linhas = 0; linhas <= quantidadeDeLinhasDaTabela; linhas++ )
                {
                    personalizacaoDaColuna.getColumn( colunas ).setPreferredWidth( dimensão );
                }
            }
            else
            {
                for ( int linhas = 0; linhas < quantidadeDeLinhasDaTabela; linhas++ )
                {
                    TableCellRenderer renderer = this.controllerDaTela.tabela.getCellRenderer( linhas, colunas );
                    Component comp = this.controllerDaTela.tabela.prepareRenderer( renderer, linhas, colunas );
                    dimensão = Math.max( comp.getPreferredSize().width + 1, dimensão );
                    personalizacaoDaColuna.getColumn( colunas ).setPreferredWidth( dimensão );
                }
            }
        }

    }
}
