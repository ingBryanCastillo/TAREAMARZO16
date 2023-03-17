/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Pacientes;
import Modelos.modeloDocGarcia;
import Modelos.modeloDocHernandez;
import Vistas.frmListas;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;

/**
 *
 * @author umg
 */
public class ListaController implements ActionListener {
    frmListas VistaListas;
    frmPrincipal VistaPrincipal;
    modeloDocGarcia ModeloDocGarcia;
    modeloDocHernandez ModeloDocHernandez;
    
    
        public ListaController(frmPrincipal VistaPrincipal, frmListas VistaListas, Pacientes ModeloPacientes, modeloDocGarcia modeloDocGarcia, modeloDocHernandez modeloDocHernandez){
            this.VistaListas = VistaListas;
            this.ModeloDocGarcia =  modeloDocGarcia;
            this.ModeloDocHernandez = modeloDocHernandez;
            this.VistaPrincipal = VistaPrincipal;
            
            //PONER A LA ESCUCHA LOS BOTONES
            this.VistaPrincipal.btnDoc1.addActionListener(this);
            this.VistaPrincipal.btnDoc2.addActionListener(this);
            this.VistaPrincipal.btnListas.addActionListener(this);
            this.VistaListas.btnVerDoc1.addActionListener(this);
            this.VistaListas.btnVerDoc2.addActionListener(this);
            this.VistaListas.btnAtenderPaciente.addActionListener(this);
            
            //LEVANTAR VISTA PRINCIPAL
            this.VistaPrincipal.setLocationRelativeTo(null);
            this.VistaPrincipal.setVisible(true);
            
        }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnDoc1)
        {
            this.ModeloDocGarcia.EncolarPacienteGarcia(this.VistaPrincipal.txtApellido.getText(),
                    this.VistaPrincipal.txtNombre.getText());
            
            //mostrar los datos en el text area
            Queue <Pacientes> ListaLocal = this.ModeloDocGarcia.ListarPacientesGarcia();
            
            String Cadena = "";
           for (Pacientes MiListaClientes: ListaLocal)
               
               Cadena = Cadena + MiListaClientes.getApellido()+" "+MiListaClientes.getNombre()+"\n";
            this.VistaListas.txtListaClientes.setText(Cadena);
        }
    }
    
}
