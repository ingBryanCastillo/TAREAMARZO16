/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;


/**
 *
 * @author umg
 */
public class modeloDocGarcia {
Queue<Pacientes> ListaGarcia = new LinkedList(); 
    
    public void EncolarPacienteGarcia (String Ape, String Nom)
    {
        Pacientes nuevoPaciente = new Pacientes(Ape,Nom);
        this.ListaGarcia.add(nuevoPaciente);
        JOptionPane.showMessageDialog(null, "PACIENTE AGREGADO:");
    }
 
public Queue ListarPacientesGarcia()
{
    
    return this.ListaGarcia;
       
}
    
   public void DesEncolar()
   {
    this.ListaGarcia.poll();
   }
    
}

