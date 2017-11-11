/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificadortxt;

import java.lang.reflect.Method;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author djbir
 */
public class ConstrutorDeColunasDaTabela
{

    private String nomeDaClasse;
    private String nomeDaFuncao;
    private Method funcao;
    private Object objeto;
    private JTable tabela;
    private Class classe;

    private DefaultTableModel modelo;

    public void executar() throws Exception
    {
        criarColunas();
        definirColunasObrigatorias();

    }

    private void criarColunas() throws Exception
    {
        classe = Class.forName( this.nomeDaClasse );
        this.objeto = classe.newInstance();
        nomeDaFuncao = "criarColunas";
        this.funcao = objeto.getClass().getMethod( this.nomeDaFuncao, DefaultTableModel.class );
        this.funcao.invoke( this.objeto, this.modelo );

    }

    private void definirColunasObrigatorias() throws Exception
    {
        this.nomeDaFuncao = "colunasObrigatorias";
        funcao = null;
        funcao = objeto.getClass().getMethod( this.nomeDaFuncao, JTable.class );
        funcao.invoke( this.objeto, this.tabela );

    }

    public ConstrutorDeColunasDaTabela setClasse( Class classe )
    {
        this.nomeDaClasse = classe.getName();
        return this;
    }

    public ConstrutorDeColunasDaTabela setTabela( JTable tabela )
    {
        this.tabela = tabela;
        this.modelo = ( DefaultTableModel ) this.tabela.getModel();
        this.modelo.setRowCount( 0 );
        this.modelo.setColumnCount( 0 );
        return this;
    }
}
