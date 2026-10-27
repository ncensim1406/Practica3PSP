/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;

/**
 *
 * @author alumno
 */
public class Test {
    
    public static boolean comprobarFecha(LocalDate fecha) {
        if (fecha.getYear() >= 1900 && fecha.getYear() <= 2015) {
            return true;
        } else {
            return false;
        }
    }

    
    public static boolean ComprobarPuntos(String puntos) {
        if(Integer.parseInt(puntos)<=0 && Integer.parseInt(puntos)>=1000){
            return true;
        }else{
            return false;
        }
    }
    
}
