/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mjpla
 */
public class Local {
    //variables
    private String nombre;
    private String direccion;
    // métodos
    
    
    public void setNombre(String iNombre){
        nombre = iNombre;
    } 
    public String getNombre(){
        return nombre;
    }
    public void setDireccion(String iDireccion){
        direccion = iDireccion;
    }
    public String getDireccion(){
        return direccion;
    }
    
    //constructor
    Local(){
        this.setNombre("gym");
        this.setDireccion("gjkdflkgj");
    }
    Local(String iNombre,String iDireccion){
        this.setNombre(iNombre);
        this.setDireccion(iDireccion);
    }
    @Override
    public String toString(){
        return "Gimnasio: "+this.getNombre()+" Dirección: "+this.getDireccion();
    }
    
    @Override
    public boolean equals(Object obj){
        return this.getNombre().equals(((Local)obj).getNombre());
    }
    
}
