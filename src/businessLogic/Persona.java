/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class Persona {
   private String nombre;
   private String id;
   private ArrayList<Pet> listaMascotas;
    public Persona(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.listaMascotas= new ArrayList<Pet>();
    }
   public void showPet (){
       for(Pet p : listaMascotas){
           System.out.println(p);
       }
   }
   public void addPet(Pet p){
       this.listaMascotas.add(p);
   }
   
   @Override
    public String toString(){
        return nombre + " " + id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Pet> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(ArrayList<Pet> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }
     public void remove(Pet p){
       listaMascotas.remove(p);
     }
  
}
