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

   private String confusion;
   private String tipoConfusion;
   private Componente[] confusiones;
   private int indiceConfusion;  

    

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
    /*
    •	Metodo imprimirResumen(): void, que muestra el nombre del cliente,
    el tipo de equipo reparado, la información de los componentes usados y 
    el total a pagar.
    */
    public void imprimirResumen(){
        System.out.println(cliente+tipoEquipo+calcularTotal());
    }

}
