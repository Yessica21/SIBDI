/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import vista.PanelBotones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.GUISibdi;
import vista.PanelDataLibro;

/**
 *
 * @author usuario
 */
public class ControlLIbro implements ActionListener {
    
    private PanelDataLibro panelDataLibro;
    public ControlLIbro(PanelDataLibro panelDataLibro)
    {
        this.panelDataLibro=panelDataLibro;
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(PanelBotones.BTN_AGREGAR))
        {
            if(panelDataLibro.getTxtID().equalsIgnoreCase("")){
                GUISibdi.mensaje("Debe agregar el ID del Libro");
            }else if(panelDataLibro.getTxtAutor().equalsIgnoreCase("")){
                GUISibdi.mensaje("Debe agregar el ID del Autor");
            }else if(panelDataLibro.getTxtEdicion().equalsIgnoreCase("")){
                GUISibdi.mensaje("Debe agregar el ID del Edicion");
            }else if(panelDataLibro.getTxtAutor().equalsIgnoreCase("")){
                GUISibdi.mensaje("Debe agregar el ID del Autor");
            }a
        }
       
        if(e.getActionCommand().equals(PanelBotones.BTN_ELIMINAR))
        {
            JOptionPane.showMessageDialog(null, "eliminar");
        }
        if(e.getActionCommand().equals(PanelBotones.BTN_MODIFICAR))
        {
            JOptionPane.showMessageDialog(null, "modificar");
        }
        if(e.getActionCommand().equals(PanelBotones.BTN_CONSULTAR))
        {
            JOptionPane.showMessageDialog(null, "consultar");
        }
        if(e.getActionCommand().equals(PanelBotones.BTN_SALIR))
        {
            JOptionPane.showMessageDialog(null, "salir");
        }
    }
    
}
