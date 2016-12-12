/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import javax.swing.JOptionPane;
import validaciones.ValidarFloat;

/**
 *
 * @author Adri
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float primerExamen = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del primer examen: "));
        float segundoExamen = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del segundo examen: "));
        float tercerExamen = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del tercer examen: "));
        int nActividades = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de actividades entregadas: "));
        float total = Teorico.notaTeoria(primerExamen, segundoExamen)
                + Practico.notaPractico(tercerExamen)
                + Actividades.actividades(nActividades);
        JOptionPane.showMessageDialog(null, "La nota final es: " + total);

    }

}
