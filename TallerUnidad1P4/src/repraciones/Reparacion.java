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
public class Reparacion {
    



    public Reparacion(String cliente, String tipoEquipo){
        this.cliente = cliente;
        this.tipoEquipo = tipoEquipo;
        componentesUsados = new Componente[8];
        
    }
    
    public Reparacion(String tipoEquipo){
        cliente = "consumidor final";
        this.tipoEquipo = tipoEquipo;
        componentesUsados = new Componente[8];
        
    }
    
}
