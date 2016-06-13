/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mjpla
 */
public class Acceso {
    // variables
    int actPrincipal;
    int dia;
    int mes;
    int hora;
    Local local;
    Socio socio;
//métodos
    
    public void setActPrincipal(int iActPrincipal){
        actPrincipal = iActPrincipal;
    }
    public int getActPrincipal (){
        return actPrincipal;
    }
    public void setDia (int iDia){
        dia= iDia;
    }
    public int getDia(){
        return dia;
    }
    
        public void setMes (int iMes){
        mes = iMes;
    }
    public int getMes(){
        return mes;
    }
        public void setHora (int iHora){
        hora = iHora;
    }
    public int getHora(){
        return hora;
    }
    public void setSocio ( Socio iSocio){
        socio=iSocio;
    }
    public Socio getSocio (){
        return socio;
    }
    public void setLocal(Local iLocal){
        local = iLocal;
    }
    public Local getLocal(){
        return local;
    }
    
    
    // constructores
    public Acceso(){
        this.setActPrincipal(1);
        this.setDia(12);
        this.setHora(24);
        this.setLocal(new Local());
        this.setMes(10);
        this.setSocio(new Socio());
    }
    
    public Acceso(int iAct, int iDia, int iHora, int iMes, Local lLocal, Socio sSocio){
        this.setActPrincipal(iAct);
        this.setDia(iDia);
        this.setHora(iHora);
        this.setMes(iMes);
        this.setLocal(lLocal);
        this.setSocio(sSocio);        
    }
    // TO STRING
        
    @Override
    public String toString(){
        return "El socio: "+this.getSocio().getNombre()+" ingreso en el gimnasio: "+this.getLocal().getNombre()+" a la hora "+this.getHora()+" el día "+this.getDia()+" mes "+this.getMes()+" a realizar principalmente "+this.actEnTexto();
    }
    //Metodo que devuleve la activdad principal del acceso en String
    public String actEnTexto(){
        String sTexto="";
        switch(this.getActPrincipal()){
            case 1:{
                sTexto= "Aparatos";
                break;
            }
            case 2:{
                sTexto="Yoga";
                break;
            }
            case 3:{
                sTexto="Pesas";
                break;
            }
                case 4:{
                sTexto="Gimnasia";
                break;
            }
                  case 5:{
                sTexto="Pilates";
                break;
            }
                  case 6:{
                sTexto="Otros";
                break;
            }
            
        }
        return sTexto;
        
    }
    //Metodo que devuelve el turno que ingreso
    public String turno(){
        String sText;
        if (this.getHora()>14){
            sText = "Vespertino";
        }else{
            sText ="Matutino";
        }
        return sText;
    }
   
}

