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
<<<<<<< HEAD
   private String cliente;
   private String tipoEquipo;
   private Componente[] componentes;
   private int indice; 
   private String prueba;
   private int contador; 
=======
    



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
    
>>>>>>> e3d23f2ca7112522bba3b2f8459515dadb5c1e29
}
