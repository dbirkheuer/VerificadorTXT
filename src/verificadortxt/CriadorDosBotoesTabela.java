/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificadortxt;

import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author djbir
 */
public class CriadorDosBotoesTabela extends ControllerDaTela
{

    private ControllerDaTela controller;

    public CriadorDosBotoesTabela setController( ControllerDaTela controller )
    {
        this.controller = controller;
        return this;
    }

    public void executar()
    {
        this.controller.listaBotoesTabela = new ArrayList<JButton>();
        this.controller.listaDescricoesBotoesTabela = new ArrayList<String>();

        // Para adicionar um novo botão, coloque o nas listagens 
        this.controller.listaBotoesTabela.add( this.controller.btnVendedor = new JButton() );
        this.controller.listaDescricoesBotoesTabela.add( "02 - Vendedor" );

        this.controller.listaBotoesTabela.add( this.controller.btnCidade = new JButton() );
        this.controller.listaDescricoesBotoesTabela.add( "03 - Cidade" );

        this.controller.listaBotoesTabela.add( this.controller.btnCondicaoPagamento = new JButton() );
        this.controller.listaDescricoesBotoesTabela.add( "04 - Condição de pagamento" );

        this.controller.listaBotoesTabela.add( this.controller.btnFilialUnidade = new JButton() );
        this.controller.listaDescricoesBotoesTabela.add( "05 - Filial Unidade" );

    }

}
