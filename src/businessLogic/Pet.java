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
public abstract class Pet {
    private String id;
    private String pelageColor;
    private String nombre;

    public Pet(String id, String pelageColor, String nombre) {
        this.id = id;
        this.pelageColor = pelageColor;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getPelageColor() {
        return pelageColor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPelageColor(String pelageColor) {
        this.pelageColor = pelageColor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

public abstract String sonido();

}
