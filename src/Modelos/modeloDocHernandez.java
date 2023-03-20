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
public class modeloDocHernandez {
Queue<Pacientes> ListaHernandez = new LinkedList(); 
    
    public void EncolarPacienteHernandez (String Ape, String Nom)
    {
        Pacientes nuevoPaciente = new Pacientes(Ape,Nom);
        this.ListaHernandez.add(nuevoPaciente);
        JOptionPane.showMessageDialog(null, "PACIENTE AGREGADO:");
    }
 
public Queue ListarPacientesHernandez()
{
    
    return this.ListaHernandez;
       
}
    
   public void DesEncolar()
   {
    this.ListaHernandez.poll();
   }
    
}
