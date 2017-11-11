/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificadortxt.tabelas;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author djbir
 */
public class Vendedor extends JFrame {


    public void criarColunas(DefaultTableModel modelo) {
        modelo.addColumn("02 - Código do vendedor");
        modelo.addColumn("03 - Nome do vendedor");
        modelo.addColumn("04 - IMEI");
        modelo.addColumn("05 - Email do vendedor");
        modelo.addColumn("06 - Gerente(2)/Vendedor(1)");
        modelo.addColumn("07 - Numero pedido atual");
        modelo.addColumn("08 - Numero pedido inicial");
        modelo.addColumn("09 - Numero pedido final");
        modelo.addColumn("10 - Ativo(1)/Inativo(0) ");
        modelo.addColumn("11 - Lista de preço");
        modelo.addColumn("12 - Grupos de produtos");
        modelo.addColumn("13 - Exibir ou ocultar os grupos de produto");
        modelo.addColumn("14 - Saldo flex no ERP");
        modelo.addColumn("15 - Sanha atual");
        modelo.addColumn("16 - Senha nova");
        modelo.addColumn("17 - Segmento relacionado");
    }
    
    public void colunasObrigatorias(JTable tabela) {
        DefaultTableCellRenderer obrigatorio = new DefaultTableCellRenderer();
        DefaultTableCellRenderer naoObrigatorio = new DefaultTableCellRenderer();
        obrigatorio.setForeground(Color.BLUE);
        naoObrigatorio.setForeground(Color.black);
        
        tabela.getColumnModel().getColumn(0).setHeaderRenderer(obrigatorio);
        tabela.getColumnModel().getColumn(1).setHeaderRenderer(obrigatorio);
        tabela.getColumnModel().getColumn(2).setHeaderRenderer(naoObrigatorio);
        tabela.getColumnModel().getColumn(3).setHeaderRenderer(obrigatorio);
        tabela.getColumnModel().getColumn(4).setHeaderRenderer(obrigatorio);
        tabela.getColumnModel().getColumn(5).setHeaderRenderer(obrigatorio);
        tabela.getColumnModel().getColumn(6).setHeaderRenderer(obrigatorio);
        tabela.getColumnModel().getColumn(7).setHeaderRenderer(obrigatorio);
        tabela.getColumnModel().getColumn(8).setHeaderRenderer(obrigatorio);
        tabela.getColumnModel().getColumn(9).setHeaderRenderer(naoObrigatorio);
        tabela.getColumnModel().getColumn(10).setHeaderRenderer(naoObrigatorio);
        tabela.getColumnModel().getColumn(11).setHeaderRenderer(naoObrigatorio);
        tabela.getColumnModel().getColumn(12).setHeaderRenderer(naoObrigatorio);
        tabela.getColumnModel().getColumn(13).setHeaderRenderer(naoObrigatorio);
        tabela.getColumnModel().getColumn(14).setHeaderRenderer(naoObrigatorio);
        tabela.getColumnModel().getColumn(15).setHeaderRenderer(naoObrigatorio);
    }

}
