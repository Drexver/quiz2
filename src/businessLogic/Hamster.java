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
public class Hamster extends Pet {
private double peso;
    @Override
    public String sonido() {
        return "";
    }

    public Hamster(double peso, String id, String pelageColor, String nombre) {
        super(id, pelageColor, nombre);
        this.peso = peso;
    }
    @Override
    public String toString(){
       return  this.getClass().getSimpleName()+ " "+super.getId()+ " "+ super.getNombre() + " " + super.getPelageColor()+ " " +peso;
    }
    
}
