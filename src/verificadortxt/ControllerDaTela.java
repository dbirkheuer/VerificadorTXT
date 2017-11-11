package verificadortxt;

import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author djbir
 */
public class ControllerDaTela
{

    protected String arquivoParaAnalisar = null;
    protected DefaultTableModel defauldTableModel = null;

    public void iniciar()
    {
        this.criarBotoesNoMenuLateral();
        this.criarBotoesNoMenuSupeior();
    }

    private void criarBotoesNoMenuLateral()
    {
        // método responsavel por criar os botoes de cada tabela
        new CriadorDosBotoesTabela()
                .setController( this )
                .executar();

        // método responsavel por criar o leiaute do botão e o evento do clique
        new CriadorDoLeiauteDoBotaoTabela()
                .setController( this )
                .executar();

        // método responsavel por adicionar o botão no painel menu de botoes
        new AdicionadorDeBotoesNoPainelTabela()
                .setController( this )
                .executar();

    }

    private void criarBotoesNoMenuSupeior()
    {
        // método responsavel por criar os botoes do menu superior
        new CriadorDosBotoesMenu()
                .setController( this )
                .executar();

        // método responsavel por criar o leiaute do botão e o evento do clique
        new CriadorDoLeiauteDoBotaoMenu()
                .setController( this )
                .executar();

        // método responsavel por adicionar o botão no painel menu de botoes
        new AdicionadorDeBotoesNoPainelMenu()
                .setController( this )
                .executar();

    }

    public ControllerDaTela setPainelBotoes( JPanel painelBotoes )
    {
        this.painelBotoesTabela = painelBotoes;
        return this;
    }

    public ControllerDaTela setPainelRolagemBotoes( JScrollPane painelRolagemBotoes )
    {
        this.painelRolagemBotoes = painelRolagemBotoes;
        return this;
    }

    public ControllerDaTela setPainelMenu( JPanel painelMenu )
    {
        this.painelBotoesMenu = painelMenu;
        return this;
    }

    public ControllerDaTela setTabela( JTable tabela )
    {
        this.tabela = tabela;
        return this;
    }

    public ControllerDaTela setPainelPrincipal( JPanel painelPrincipal )
    {
        this.painelPrincipal = painelPrincipal;
        return this;
    }

    protected JPanel painelBotoesTabela;
    protected JPanel painelPrincipal;

    protected JScrollPane painelRolagemBotoes;
    protected JPanel painelBotoesMenu;
    protected JTable tabela;

    protected List<String> listaDescricoesBotoesTabela;
    protected List<JButton> listaBotoesTabela;

    protected List<JButton> listaBotoesMenu;
    protected List<ImageIcon> listaIconesBotoesMenu;

    // Botoes do menu superior
    protected JButton btnNovoArquivo;
    protected JButton btnAbrirArquivo;
    protected JButton btnSalvarTabela;
    protected JButton btnGerarArquivo;
    

    // Botoes do menu lateral, menu de tabelas
    protected JButton btnVendedor;
    protected JButton btnCidade;
    protected JButton btnCondicaoPagamento;
    protected JButton btnFilialUnidade;

}
