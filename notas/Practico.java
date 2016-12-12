/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import validaciones.ValidarFloat;

/**
 *
 * @author Adri
 */
public class Practico {

    public static float notaPractico(float examen) {
        ValidarFloat.validarFloat(examen);
        return examen * 0.4f;
    }
}
