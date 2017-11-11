/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificadortxt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import verificadortxt.tabelas.Vendedor;

/**
 *
 * @author djbir
 */
public class EventoDeCliqueDoBotao extends ControllerDaTela
{

    protected JButton botao;
    protected ControllerDaTela controller;

    public EventoDeCliqueDoBotao setController( ControllerDaTela controller )
    {
        this.controller = controller;
        return this;
    }

    public EventoDeCliqueDoBotao setBotao( JButton botao )
    {
        this.botao = botao;
        return this;
    }

    public void criarEvento()
    {
        botao.addActionListener( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                if ( e.getSource() == controller.btnNovoArquivo )
                {
                    controller.arquivoParaAnalisar = new ObtentorDeArquivoParaAnalise()
                            .executar();
                }
                if ( e.getSource() == controller.btnVendedor )
                {
                    new ConstrutorDaTabela()
                            .setBotaoDaTabela( controller.btnVendedor )
                            .setIdentificadorDaTabela( "02|" )
                            .setClasseDeTabelaClicada( Vendedor.class )
                            .setControllerDaTela( controller )
                            .executar();
                    
                }

                if ( e.getSource() == controller.btnCidade )
                {
                    JOptionPane.showMessageDialog( null, "cidade" );
                }

                if ( e.getSource() == controller.btnCondicaoPagamento )
                {
                    JOptionPane.showMessageDialog( null, "condicao" );
                }

            }
        } );
    }

}
