/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.time.LocalDate;
import modelo.Cliente;
import vista.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Controlador1 {
    private int actual;
    private List<Cliente> lista;
    
    public Controlador1(){
        actual=0;
        this.lista = new ArrayList<>();
        lista.add(new Cliente("Carlos Gómez", 104, "1500", LocalDate.of(2011, 5, 12)));
        lista.add(new Cliente("Ana López", 101, "3200", LocalDate.of(2001, 11, 28)));
        lista.add(new Cliente("Luis Martínez", 105, "450", LocalDate.of(2005, 2, 14)));
        lista.add(new Cliente("María Rodríguez", 102, "890", LocalDate.of(2002, 8, 5)));
        lista.add(new Cliente("Elena Belmonte", 103, "2100", LocalDate.of(2004, 6, 20)));
    }
    public boolean esVacia(){
        return lista.isEmpty();
    }
    public void avanzar(){
        actual++;
    }
    public void retroceder(){
        actual--;
    }
    public void irPrimero(){
        actual=1;
    }
    public void irUltimo(){
        actual=lista.size()-1;
    }
    public void anadirCliente(String nombre,int numero,String puntos,LocalDate fecha){
        lista.add(new Cliente(nombre, numero, puntos, fecha));
    }
    public boolean esUltimo(){
        return actual==lista.size()-1;
    }
    public boolean esPrimero(){
        return actual == 0;
    }
    public void borrarCliente(int num){
        lista.remove(num);
        
    }
    public Cliente obtenerClienteActual(){
        return lista.get(actual);
    }
    public void ordenarLista(){
        lista.sort(null);
    }
}
