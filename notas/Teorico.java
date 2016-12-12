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
public class Teorico {

    public static float notaTeoria(float primerExamen, float segundoExamen) {
        ValidarFloat.validarFloat(primerExamen);
        ValidarFloat.validarFloat(segundoExamen);
        return ((primerExamen + segundoExamen) / 2) * 0.4f;
    }

}
