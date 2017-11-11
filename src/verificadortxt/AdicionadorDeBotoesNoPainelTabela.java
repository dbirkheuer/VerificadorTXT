/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificadortxt;

import javax.swing.JPanel;

/**
 *
 * @author djbir
 */
public class AdicionadorDeBotoesNoPainelTabela extends ControllerDaTela
{

    private ControllerDaTela controller;

    public AdicionadorDeBotoesNoPainelTabela setController( ControllerDaTela controller )
    {
        this.controller = controller;
        return this;
    }

    public void executar()
    {
        this.controller.painelBotoesTabela = new JPanel();
        javax.swing.GroupLayout jpMenusLayout = new javax.swing.GroupLayout( this.controller.painelBotoesTabela );
        this.controller.painelBotoesTabela.setLayout( jpMenusLayout );

        jpMenusLayout.setHorizontalGroup(
                jpMenusLayout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        // Para adicionar um novo botão, copie a linha abaixo renomeando o botao
                        .addComponent( this.controller.btnVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                        .addComponent( this.controller.btnCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                        .addComponent( this.controller.btnCondicaoPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                        .addComponent( this.controller.btnFilialUnidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
        );

        jpMenusLayout.setVerticalGroup(
                jpMenusLayout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( jpMenusLayout.createSequentialGroup()
                                // Para adicionar um novo botão, copie as duas primeiras linhas abaixo renomeando o botao
                                .addComponent( this.controller.btnVendedor )
                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                                .addComponent( this.controller.btnCidade )
                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                                .addComponent( this.controller.btnCondicaoPagamento )
                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                                .addComponent( this.controller.btnFilialUnidade )
                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                        ) );

        this.controller.painelRolagemBotoes.setViewportView( this.controller.painelBotoesTabela );
    }

}
