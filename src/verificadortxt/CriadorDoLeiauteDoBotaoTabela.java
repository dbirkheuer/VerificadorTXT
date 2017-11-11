/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificadortxt;

import javax.swing.JButton;

/**
 *
 * @author djbir
 */
public class CriadorDoLeiauteDoBotaoTabela extends ControllerDaTela
{

    private ControllerDaTela controller;

    public CriadorDoLeiauteDoBotaoTabela setController( ControllerDaTela controller )
    {
        this.controller = controller;
        return this;
    }

    public void executar()
    {
        for ( int i = 0; i < this.controller.listaBotoesTabela.size(); i++ )
        {
            JButton botao = new JButton();
            botao = this.controller.listaBotoesTabela.get( i );

            String descricao = "";
            descricao = this.controller.listaDescricoesBotoesTabela.get( i );

            botao.setBackground( new java.awt.Color( 255, 255, 255 ) );
            botao.setFont( new java.awt.Font( "Arial", 1, 14 ) );
            botao.setText( descricao );

            // método responsavel por criar o evento do clique
            new EventoDeCliqueDoBotao()
                    .setBotao( botao )
                    .setController( this.controller )
                    .criarEvento();

        }
    }

}
