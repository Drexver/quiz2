/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

/**
 *
 * @author rodri
 */
public class Dog extends Pet {
private String raza;
    @Override
    
    public String sonido() {
        return "guau";
    }

    public Dog(String raza, String id, String pelageColor, String nombre) {
        super(id, pelageColor, nombre);
        this.raza = raza;
    }
    
    @Override
    public String toString(){
        return  this.getClass().getSimpleName()+" "+ super.getId()+ " "+ super.getNombre() + " " + super.getPelageColor()+ " " + raza  ;
    }
    
}
