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
public class Cat  extends Pet {
private boolean cazador; 
    @Override
    public String sonido() {
        return "miaw";
    }

    public Cat(boolean cazador, String id, String pelageColor, String nombre) {
        super(id, pelageColor, nombre);
        this.cazador = cazador;
    }
    @Override
    public String toString(){
        return  this.getClass().getSimpleName()+" "+ super.getId()+ " "+ super.getNombre() + " " + super.getPelageColor()+ " " + cazador;
    }
}
