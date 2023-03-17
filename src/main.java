
import Controladores.ListaController;
import Modelos.Pacientes;
import Modelos.modeloDocGarcia;
import Vistas.frmListas;
import Vistas.frmPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umg
 */
public class main {

   public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmListas VistaListas = new frmListas(VistaPrincipal, true);
        modeloDocGarcia modeloDocGarcia = new modeloDocGarcia();
        Pacientes modeloPacientes = new Pacientes(nombre,apellido);
        ListaController ControladorLista = new ListaController(VistaPrincipal, VistaListas, ModeloPacientes, modeloDocGarcia, modeloDocHernandez);
    }
}
