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
public class CriadorDoLeiauteDoBotaoMenu extends ControllerDaTela
{

    private ControllerDaTela controller;

    public CriadorDoLeiauteDoBotaoMenu setController( ControllerDaTela controller )
    {
        this.controller = controller;
        return this;
    }

    public void executar()
    {
        for ( int i = 0; i < this.controller.listaBotoesMenu.size(); i++ )
        {
            JButton botao = new JButton();
            botao = this.controller.listaBotoesMenu.get( i );
            botao.setBackground( new java.awt.Color( 255, 255, 255 ) );
            botao.setFont( new java.awt.Font( "Arial", 1, 14 ) );
            botao.setIcon( this.controller.listaIconesBotoesMenu.get( i ) );
            botao.setBorder( null );

            new EventoDeCliqueDoBotao()
                    .setBotao( botao )
                    .setController( this.controller )
                    .criarEvento();

        }

    }

}
