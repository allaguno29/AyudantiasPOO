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
public class CatalogoComponente {
    private Componente[] componentes;

    public CatalogoComponente(){
      componentes = new Componente[10]; 
      componentes[0]=new Componente("bateria celular",100.0);
      componentes[1]=new Componente("bateria computador",200.0);
      componentes[2]=new Componente("display celular",150.0);
      componentes[3]=new Componente("placa madre",300.0);
    }

    
    public Componente buscarComponente(String nombre){
        Componente componenteEncontrado=null;
        for(Componente c: componentes){
            
            if(c.getNombre().equalsIgnoreCase(nombre)){
                componenteEncontrado=c;

            }
        }
        return componenteEncontrado;

    }
    public void imprimirCatalogo(){
         for(Componente c: componentes){
             c.mostrarInformacion();
        }
    }
}
