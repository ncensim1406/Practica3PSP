/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author alumno
 */
public class Cliente implements Comparable<Object>{
    
    private String nombre;
    private int numero;
    private String puntos;
    private LocalDate fecha;

    public Cliente(String nombre, int numero, String puntos, LocalDate fecha) {
        this.nombre = nombre;
        this.numero = numero;
        this.puntos = puntos;
        this.fecha = fecha;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", numero=" + numero + ", puntos=" + puntos + ", fecha=" + fecha + '}';
    }
    
    @Override
    public int compareTo(Object otro){
       Cliente cliente2 = (Cliente)otro;
       return (this.numero-cliente2.numero); 
    }
    

}
