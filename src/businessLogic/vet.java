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
public class vet {
    
    private ArrayList<Pet> listaMascota;

    public ArrayList<Pet> getListaMascota() {
        return listaMascota;
    }

    public void setListaMascota(ArrayList<Pet> listaMascota) {
        this.listaMascota = listaMascota;
    }

    public vet() {
        listaMascota = new  ArrayList<Pet>();
    }
     public void addPet(Pet p){
       this.listaMascota.add(p);
   }
    public void remove(Pet p){
        listaMascota.remove(p);
      
       } 
    
        
    public void showPetBYtipe(String type){
        for(Pet w : listaMascota){
            if(w.getClass().getSimpleName().equals(type)){
           System.out.println(w); 
            }
       }
    }
   public void showPet(){
       for(Pet w : listaMascota){
           System.out.println(w);  
       }
   }
    
}
