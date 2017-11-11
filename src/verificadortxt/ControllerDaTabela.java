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
public class ControllerDaTabela
{

    protected String idTabela;
    protected Class classe;
    protected JButton botaoClicado;
    protected ControllerDaTela controllerDaTela;

    public ControllerDaTabela setControllerDaTela( ControllerDaTela controllerDaTela )
    {
        this.controllerDaTela = controllerDaTela;
        return this;
    }

    public ControllerDaTabela setIdTabela( String idTabela )
    {
        this.idTabela = idTabela;
        return this;
    }

    public ControllerDaTabela setClasse( Class classe )
    {
        this.classe = classe;
        return this;
    }

    public ControllerDaTabela setBotaoClicado( JButton botaoClicado )
    {
        this.botaoClicado = botaoClicado;
        return this;
    }

}
