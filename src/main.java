
import Controladores.ListaController;
import Modelos.Pacientes;
import Modelos.modeloDocGarcia;
import Modelos.modeloDocHernandez;
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
        modeloDocHernandez modeloDocHernandez = new modeloDocHernandez();
        ListaController ControladorLista = new ListaController(VistaPrincipal, VistaListas, modeloDocGarcia, modeloDocHernandez);
    }
}
