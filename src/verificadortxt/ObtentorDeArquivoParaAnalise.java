/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificadortxt;

import javax.swing.JFileChooser;

/**
 *
 * @author djbir
 */
public class ObtentorDeArquivoParaAnalise
{
    public String arquivo;

    public String executar()
    {
        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode( JFileChooser.FILES_ONLY );

        if ( file.showOpenDialog( null ) == JFileChooser.APPROVE_OPTION )
        {
            this.arquivo = file.getSelectedFile().getAbsoluteFile().toString();
        }

        return this.arquivo;
    }
}
