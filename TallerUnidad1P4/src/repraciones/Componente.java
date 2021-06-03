/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repraciones;

/**
 *
 * @author rocio
 */
public class Componente {
    private String nombre;
    private double precio;
    
    public Componente(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void mostrarInformacion(){
        System.out.printf("Nombre del componente: %s\nPrecio del componente: %f\n", nombre, precio);
        
    }
    
      
}