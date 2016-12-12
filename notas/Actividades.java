/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

/**
 *
 * @author Adri
 */
public class Actividades {

    public static int actividades(int nActividades) {
        if (nActividades == 12) {
            return 2;
        } else if (nActividades == 11) {
            return 1;
        } else {
            return 0;
        }
    }
}
