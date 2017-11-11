/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificadortxt;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author djbir
 */
public class CriadorDosBotoesMenu extends ControllerDaTela
{

    private ControllerDaTela controller;

    public CriadorDosBotoesMenu setController( ControllerDaTela controller )
    {
        this.controller = controller;
        return this;
    }

    public void executar()
    {

        this.controller.listaBotoesMenu = new ArrayList<JButton>();
        this.controller.listaIconesBotoesMenu = new ArrayList<ImageIcon>();

        // Para adicionar um novo botão, coloque o nas listagens 
        this.controller.listaBotoesMenu.add( this.controller.btnNovoArquivo = new JButton() );
        this.controller.listaIconesBotoesMenu.add( new javax.swing.ImageIcon(getClass().getResource("/resources/img/novoArquivo.png" ) ) );

        this.controller.listaBotoesMenu.add( this.controller.btnAbrirArquivo = new JButton() );
        this.controller.listaIconesBotoesMenu.add( new javax.swing.ImageIcon(getClass().getResource("/resources/img/abrirArquivo.png" ) ) );
        
        this.controller.listaBotoesMenu.add( this.controller.btnSalvarTabela = new JButton() );
        this.controller.listaIconesBotoesMenu.add( new javax.swing.ImageIcon(getClass().getResource("/resources/img/salvarTabela.png" ) ) );
        
        this.controller.listaBotoesMenu.add( this.controller.btnGerarArquivo = new JButton() );
        this.controller.listaIconesBotoesMenu.add( new javax.swing.ImageIcon(getClass().getResource("/resources/img/gerarArquivo.png" ) ) );

    }

}
