/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mjpla
 */
public class Profesor extends Persona {
    private int experiencia;
    
    public int getExperiencia(){
        return this.experiencia;
    }
    public void setExperiencia(int iExp){
        this.experiencia = iExp;
    }
    
    public Profesor(){
        this.setExperiencia(2);
    }
    public Profesor(int iCi, String sNombre, int iExp){
        super(sNombre, iCi);
        this.setExperiencia(iExp);
    }
    
    
}
