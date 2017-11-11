/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificadortxt;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author djbir
 */
public class ConstrutorDaTabela
{

    protected JButton botaoDaTabela;
    protected String identificadorDaTabela;
    protected Class classeDeTabelaClicada;
    protected ControllerDaTela controllerDaTela;

    public void executar()
    {
        try
        {
            new CriadorDaTabela()
                    .setClasse( classeDeTabelaClicada )
                    .setIdTabela( identificadorDaTabela )
                    .setController( controllerDaTela )
                    .executar();

            if ( controllerDaTela.arquivoParaAnalisar != null )
            {
                new PopuladorDeTabela()
                        .setControllerDaTela( controllerDaTela )
                        .setClasse( classeDeTabelaClicada )
                        .setIdTabela( identificadorDaTabela )
                        .executar();
            }
        }
        catch ( Exception e )
        {
            JOptionPane.showMessageDialog( null, e.getMessage() );
        }
    }

    public ConstrutorDaTabela setControllerDaTela( ControllerDaTela controllerDaTela )
    {
        this.controllerDaTela = controllerDaTela;
        return this;
    }

    public ConstrutorDaTabela setBotaoDaTabela( JButton botaoDaTabela )
    {
        this.botaoDaTabela = botaoDaTabela;
        return this;
    }

    public ConstrutorDaTabela setIdentificadorDaTabela( String identificadorDaTabela )
    {
        this.identificadorDaTabela = identificadorDaTabela;
        return this;
    }

    public ConstrutorDaTabela setClasseDeTabelaClicada( Class classeDeTabelaClicada )
    {
        this.classeDeTabelaClicada = classeDeTabelaClicada;
        return this;
    }

}
