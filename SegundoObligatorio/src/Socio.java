/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mjpla
 */
public class Socio extends Persona {
    
    //variables
    private String mail;
    private int edad;
    private int cuponera;
    
    //métodos
    
    
    public void setMail (String iMail){
        mail = iMail;
    }
    
    public String getMail(){
        return this.mail;
    }
    
    public void setEdad (int iEdad){
        edad= iEdad;
    }
    
    public int getEdad(){
        return this.edad;
    }
   public void setCuponera (int iCuponera){
        cuponera= iCuponera;
    }
    
    public int getCuponera(){
        return this.cuponera;
    } 


    //contructor
    
    public Socio(){
        this.setMail("julian@gmail.com");
        this.setEdad(27);
        this.setCuponera(1);
    }
    
    public Socio(String sNombre,int iCi,String iMail,int iEdad,int iCuponera){
        super(sNombre, iCi);
        this.setEdad(iEdad);
        this.setMail(iMail);
        this.setCuponera(iCuponera);
    }
    
    @Override
    public String toString(){
        return "Nombre: "+super.getNombre()+" Ci: "+super.getCI()+" Mail: "+this.getMail()+" Edad : "+this.getEdad()+" Cuponera: "+this.getCuponera();
    }
    
}
