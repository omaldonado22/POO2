/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p1;

import hn.uth.poo.p1.objetos.Asignatura;
import hn.uth.poo.p1.objetos.Nivel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author DELL
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
           Asignatura asignatura1=new Asignatura();
           carros.add("Toyota");
           carros.add("BMW");
           carros.addFirst("Ferrari");
            System.out.println(carros);
            
            HashMap<String, String> ciudadesHonduras = new HashMap<String, String>();
            ciudadesHonduras.put("Cortes", "SPS");
            ciudadesHonduras.put("FRANCISCO MORAZAN", "TGU");
            ciudadesHonduras.put("ATLANTIDA","LA CEIBA");
            System.out.println(ciudadesHonduras);
            System.out.println(ciudadesHonduras.get("Cortes"));
            ciudadesHonduras.remove("ATLANTIDA");
            System.out.println(ciudadesHonduras);
            
            HashSet<String> celulares=new HashSet<String>();
            celulares.add("iPhone");
                            celulares.add("Samsung");
            celulares.add("Huawei");
            celulares.add("iPhone");
            System.out.println();
            
            
           
           
           
           asignatura1.setCodigo("AA-01");
           asignatura1.setNombre("Estrcutrada");
           asignatura1.setNivel(Nivel.MEDIO);
           switch(asignatura1.getNivel())
                   {
               case BAJO:
                   System.out.println("Su clase es de nivel bajo");
                   break;
               case MEDIO:
                   System.out.println("Su clase es de nivel medio");
                   break;
               case ALTO:
                   System.out.println("Su clase es de nivel alto");
               default:
                   System.out.println("Su nivel de clase no existe");
           }
           for(Nivel value: Nivel.values())
                System.out.println(value);
        } catch (Exception e) {
        }
    }
    
}
