/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerunidad1p4;

import java.util.Scanner;
import repraciones.CatalogoComponente;

/**
 *
 * @author rocio
 */
public class Taller {
    private Scanner sc;
    private CatalogoComponente catalogo;
    
    public Taller(){
        //inicializo la avariable sc que se usara para pedir los datos
        sc = new Scanner(System.in);
        catalogo = new CatalogoComponente();
    }
    
    public void presentarMenuPrincipal(){
        System.out.println("Bienvenido ");
        System.out.println("1. Realizar reparacion");
        System.out.println("2. Salir");
    }
    
    public void iniciar(){
        String entrada = "";
        do{
            presentarMenuPrincipal();
            System.out.print("Ingrese opcion:");
            entrada = sc.nextLine();
            switch(entrada){
                case "1":
                    //llamamos a metodo realizarRepacion()
                    realizarRepacion();
                    break;
                case "2":
                    //mostramos mensaje de finalizacion
                    System.out.println("Adios");
                    break;
                default:
                    //la opcion ingreada no esta dentro de las opciones del menu
                    System.out.println("Opcion invalida");
                    break;
                        
            }
        }while(!entrada.equals("2"));
    }
    
    public void realizarRepacion(){
        
        //ingrese el tipo de equipo a reaparar
        //debe validar que el tipo se "computador" o "celular", sino lo es debe volver a pedir
        System.out.println("Ingrese tipo de equipo a reaparar:");
        
        //pida el nombre del cliente
        System.out.println("Ingrese el nombre del cliente: ");
        
        
        //cree una nueva instancia de Reparacion
        //si se ingreso un string vacio para el nombre del cliente
        //use el constructor que fija cliente a "Consumidor final"
        
        
        //use el siguiente lazo para ingresar los componentes que se usaron en la reparacion
        String continuar="si";
        do{
            //pedir el nombre de un componente
            //buscar el nombre del componente en el catalogo
            //agregar el componente a la repacion en caso que exista
            //mostrar el total de la repacion hasta el momento
            //pedir si desea continuar agregando componenentes
            continuar="no";
        }while(continuar.equals("si"));
        
        //mostrar el resumen de la reparacion
    }
}
