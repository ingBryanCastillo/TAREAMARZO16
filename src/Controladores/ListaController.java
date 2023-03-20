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
    
    
        public ListaController(frmPrincipal VistaPrincipal, frmListas VistaListas, modeloDocGarcia modeloDocGarcia, modeloDocHernandez modeloDocHernandez){
            this.VistaListas = VistaListas;
            this.ModeloDocGarcia =  modeloDocGarcia;
            this.ModeloDocHernandez = modeloDocHernandez;
            this.VistaPrincipal = VistaPrincipal;
            
            //PONER A LA ESCUCHA LOS BOTONES
            this.VistaPrincipal.btnDocHernandez.addActionListener(this);
            this.VistaPrincipal.btnDocGarcia.addActionListener(this);
            this.VistaPrincipal.btnListas.addActionListener(this);
            this.VistaListas.btnVerDoc1.addActionListener(this);
            this.VistaListas.btnVerDoc2.addActionListener(this);
            this.VistaListas.btnAtenderHernandez.addActionListener(this);
            this.VistaListas.btnAtenderHernandez.addActionListener(this);
            this.VistaListas.btnAtenderGarcia.addActionListener(this);
            
            //LEVANTAR VISTA PRINCIPAL
            this.VistaPrincipal.setLocationRelativeTo(null);
            this.VistaPrincipal.setVisible(true);
            
            
        }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnDocGarcia)
        {
            this.ModeloDocGarcia.EncolarPacienteGarcia(this.VistaPrincipal.txtApellido.getText(),
                    this.VistaPrincipal.txtNombre.getText());
        }
        
 
        
        if (e.getSource()==this.VistaPrincipal.btnListas){
            this.VistaListas.setVisible(true);
        }
        
        if (e.getSource()==this.VistaPrincipal.btnDocHernandez){
            this.ModeloDocHernandez.EncolarPacienteHernandez(this.VistaPrincipal.txtApellido.getText(),
                    this.VistaPrincipal.txtNombre.getText());
            
        }
        
        if (e.getSource()==this.VistaListas.btnVerDoc2){
            this.VistaListas.setVisible(true);
               //mostrar los datos en el text area
            Queue <Pacientes> ListaLocal = this.ModeloDocGarcia.ListarPacientesGarcia();
            
            String Cadena = "";
           for (Pacientes MiListaPacientes: ListaLocal)
               
               Cadena = Cadena + MiListaPacientes.getApellido()+" "+MiListaPacientes.getNombre()+"\n";
            this.VistaListas.txtListaPacientes.setText(Cadena);
        }
        
        if (e.getSource()==this.VistaListas.btnAtenderGarcia){
            this.VistaListas.setVisible(true);
            this.ModeloDocGarcia.DesEncolar();
            
            Queue <Pacientes> ListaLocal = this.ModeloDocGarcia.ListarPacientesGarcia();
            
            String Cadena = "";
           for (Pacientes MiListaPacientes: ListaLocal)
               
               Cadena = Cadena + MiListaPacientes.getApellido()+" "+MiListaPacientes.getNombre()+"\n";
            this.VistaListas.txtListaPacientes.setText(Cadena);
        }
        
        
        if (e.getSource()==this.VistaListas.btnVerDoc1){
            //mostrar los datos en el text area
            Queue <Pacientes> ListaLocal = this.ModeloDocHernandez.ListarPacientesHernandez();
            
            String Cadena = "";
           for (Pacientes MiListaPacientes: ListaLocal)
               
               Cadena = Cadena + MiListaPacientes.getApellido()+" "+MiListaPacientes.getNombre()+"\n";
            this.VistaListas.txtListaPacientes.setText(Cadena);
        }
        
        if (e.getSource()==this.VistaListas.btnAtenderHernandez){
            this.VistaListas.setVisible(true);
            this.ModeloDocHernandez.DesEncolar();
            
            Queue <Pacientes> ListaLocal = this.ModeloDocHernandez.ListarPacientesHernandez();
            
            String Cadena = "";
           for (Pacientes MiListaPacientes: ListaLocal)
               
               Cadena = Cadena + MiListaPacientes.getApellido()+" "+MiListaPacientes.getNombre()+"\n";
            this.VistaListas.txtListaPacientes.setText(Cadena);
        }
        
    }
    
    
}
