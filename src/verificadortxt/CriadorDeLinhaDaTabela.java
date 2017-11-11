/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificadortxt;

import javax.swing.JOptionPane;

/**
 *
 * @author djbir
 */
public class CriadorDeLinhaDaTabela
{

    protected ControllerDaTela controllerDaTela;
    private int qtdeLinhas;

    public CriadorDeLinhaDaTabela setController( ControllerDaTela controllerDaTela )
    {
        this.controllerDaTela = controllerDaTela;
        return this;
    }

    public CriadorDeLinhaDaTabela executar()
    {

        String nomeConsulta = JOptionPane.showInputDialog( null, "Quantas linhas?", "Adicionar linhas", JOptionPane.QUESTION_MESSAGE );

        try
        {
            this.qtdeLinhas = Integer.parseInt( nomeConsulta );
        }
        catch ( Exception e )
        {
            JOptionPane.showMessageDialog( null, "Entrada inválida! Adicionei 5 linhas" );
            if ( this.qtdeLinhas == 0 )
            {
                this.qtdeLinhas = 5;
            }
        }

        for ( int x = 0; x < this.qtdeLinhas; x++ )
        {
            controllerDaTela.defauldTableModel.addRow( new Object[]
            {
                null, null
            } );
        }

        return this;
    }
}
