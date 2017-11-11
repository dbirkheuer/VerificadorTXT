/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificadortxt;

/**
 *
 * @author djbir
 */
public class AdicionadorDeBotoesNoPainelMenu extends ControllerDaTela
{

    private ControllerDaTela controller;

    public AdicionadorDeBotoesNoPainelMenu setController( ControllerDaTela controller )
    {
        this.controller = controller;
        return this;
    }

    public void executar()
    {
        javax.swing.GroupLayout painel = new javax.swing.GroupLayout( this.controller.painelBotoesMenu );
        this.controller.painelBotoesMenu.setLayout( painel );
        painel.setHorizontalGroup(
                painel.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( painel.createSequentialGroup()
                                .addContainerGap()
                                .addComponent( this.controller.btnNovoArquivo )
                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                                .addComponent( this.controller.btnAbrirArquivo )
                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                                .addComponent( this.controller.btnSalvarTabela )
                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                                .addComponent( this.controller.btnGerarArquivo )
                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                        )
        );
        painel.setVerticalGroup(
                painel.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, painel.createSequentialGroup()
                                .addContainerGap( 8, Short.MAX_VALUE )
                                .addGroup( painel.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                                        .addComponent( this.controller.btnNovoArquivo )
                                        .addComponent( this.controller.btnAbrirArquivo )
                                        .addComponent( this.controller.btnSalvarTabela )
                                        .addComponent( this.controller.btnGerarArquivo )
                                )
                                .addContainerGap() )
        );
    }

}
