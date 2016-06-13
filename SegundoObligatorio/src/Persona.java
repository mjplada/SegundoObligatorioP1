/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mjpla
 */
abstract class Persona {
    //Atributos
    private int ci;
    private String Nombre;
    //Get´s y Set´s
    public int getCI(){
        return this.ci;
    }
    public void setCI(int iCI){
        this.ci = iCI;
    }
    public String getNombre(){
        return this.Nombre;
    }
    public void setNombre(String sNombre){
        this.Nombre = sNombre;
    }
    //Constructores
    public Persona(){
        this.setCI(111111111);
        this.setNombre(Nombre);
    }
    public Persona(String sNombre, int iCI){
        this.setCI(iCI);
        this.setNombre(sNombre);
    }
    
    @Override
    public String toString(){
        return "Nombre: "+ this.getNombre() + ", CI: "+this.getCI();
    }
    
        @Override
    public boolean equals(Object obj){
        return this.getCI()== ((Persona)obj).getCI();
    }
    
}
