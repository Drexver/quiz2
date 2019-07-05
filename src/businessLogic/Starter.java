/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Starter {
private static ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
static Scanner Cc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vet v = new vet();
        leerMascota(v);
        String opcion = "";
        while(!opcion.equals("salir")){
            System.out.println("Bienvenido a veterinaria");
            System.out.println("Opciones");
            System.out.println("si quieres ver la lista de mascotas escribe mostrar");
            System.out.println("si quieres eliminar una mascota de  lista de mascotas escribe Eliminar");
            System.out.println("el archivo con la lista de mascotas sera modificado con los cambios al salir del programa");
            System.out.println("finalizar el programa escriba salir");
            System.out.println("los animales con el mis id no se añadiran a la lis");
            
            
            opcion = Cc.nextLine();
            mannage(v,opcion);
        }
        
    }
    public static void leerMascota(vet v){
        File file = new File("pets.txt");
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                String tipo = sc.next();
      String id = sc.next();
      String nombre = sc.next();
      String color = sc.next();
      String dueñoNombre;
      String dueñoId;
      boolean found;
      Persona d;
      Pet r;
      
    switch(tipo){
        case "Dog" : 
            String raza =sc.next();
            dueñoNombre = sc.next();
            dueñoId= sc.next();
            Dog p = new Dog(raza,id,color,nombre);
            found = false;
         
              for(Pet f : v.getListaMascota()){
                //System.out.println(w.getId() + " " + dueñoId);
                if(f.getId().equals(id)){
                    found = true;
                    break;
                }
              }
              if(!found){
                r= new Dog( raza,  id,  color,  nombre);
                v.addPet(r);
            for(Persona w : listaPersonas){
                //System.out.println(w.getId() + " " + dueñoId);
                if(w.getId().equals(dueñoId)){
                    w.addPet(p);
                    found = true;
                    break;
                }
            }
            if(!found){
            d = new Persona(dueñoNombre,dueñoId);
            d.addPet(p);
            listaPersonas.add(d);    
            }
              }
           
            break;
        case "Cat"    :
            boolean cazador =sc.nextBoolean();
            dueñoNombre = sc.next();
            dueñoId= sc.next();
             Cat c = new Cat(cazador,id,color,nombre);
             found = false;
              for(Pet f : v.getListaMascota()){
                //System.out.println(w.getId() + " " + dueñoId);
                if(f.getId().equals(id)){
                    found = true;
                    break;
                }
              }
            if(!found){
                r= new Cat( cazador,  id,  color,  nombre);
                v.addPet(r);
                
               found = false;
            for(Persona w : listaPersonas){
                
                if(w.getId().equals(dueñoId)){
                    w.addPet(r);
                    found = true;
                    break;
                }
            }
            if(!found){
             d = new Persona(dueñoNombre,dueñoId);
            d.addPet(r);
            listaPersonas.add(d);    
            }
            
            }
            break;
        case"Hamster" :
            double peso = Double.valueOf(sc.next());
            dueñoNombre = sc.next();
            dueñoId= sc.next();
            found = false;
            for(Pet f : v.getListaMascota()){
              ;
                if(f.getId().equals(id)){
                    found = true;
                    break;
                }
            }
            if(!found){
                r= new Hamster( peso,  id,  color,  nombre);
                v.addPet(r);
                found = false;
            for(Persona w : listaPersonas){
                
                if(w.getId().equals(dueñoId)){
                    w.addPet(r);
                    found = true;
                    break;
                }
            }
            if(!found){
             d = new Persona(dueñoNombre,dueñoId);
            d.addPet(r);
            listaPersonas.add(d);    
            }
            }
            
            
            
           
            break;
    }
            }
        }
        catch(Exception ex){
            ex.printStackTrace();            
        }
    }
    public static void mannage(vet v,String action){
        switch(action){
            case "mostrar" : 
                System.out.println("ingrese tipo de mascota");
                 String tipo =Cc.nextLine() ;
                 if(tipo.equals("Dog") ||tipo.equals("Cat")||tipo.equals("Hamster")){
                v.showPetBYtipe(tipo);
                 }else{
                     System.out.println("tipo invalido");
                 }
                break;
            case "Eliminar":
                System.out.println("ingrese el id de la mascota");
                String id =Cc.nextLine() ;
                boolean found = false;
                for(Persona p : listaPersonas){
                    for(Pet w: p.getListaMascotas()){
                        if(w.getId().equals(id)){
                            p.getListaMascotas().remove(w);
                            for(Pet z : v.getListaMascota()){
                                 if(z.getId().equals(id)){
                                     v.remove(z);
                                     break;
                                 }
                            }
                            found = true;
                            break;
                        }
                        
                    }
                    if(found){
                        break;
                        
                    }
                }
                if(!found){
                    System.out.println("mascota no encontrada");
                }
                
                break;
                
            case "salir":
                File f = new File("pets.txt");
                try{
                    
                FileWriter fw = new FileWriter(f,false);
                for(Persona g : listaPersonas){
                    for(Pet x :g.getListaMascotas()){
                        fw.write(x.toString()+"\r\n"+g.toString()+"\r\n");
                    }
                }
                fw.close();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                System.out.println("gracias por usar sistema");
                 break;
            default:
                System.out.println("opcion invalida");
            break;
        }
        
    }
    
}
