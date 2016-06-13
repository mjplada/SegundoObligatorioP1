
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mjpla
 */
public class Gimnasio {
    //Atributos
    private ArrayList<Profesor> listaProfesores = new ArrayList<>();
    private ArrayList<Local> listaLocales = new ArrayList<>();
    private ArrayList<Acceso> listaAccesos = new ArrayList<>();
    private ArrayList<Socio> listaSocios = new ArrayList<>();
    
    //Constructor
    public Gimnasio(){
        listaProfesores = new ArrayList<Profesor>();
        listaLocales = new ArrayList<Local>();
        listaAccesos = new ArrayList<Acceso>();
        listaSocios = new ArrayList<Socio>();
    }
    
    public void addProfesor(Profesor unProfe){
        this.getListaProfesores().add(unProfe);
    }
    public ArrayList<Profesor> getListaProfesores(){
        return this.listaProfesores;
    }
    public void addLocal(Local unLocal){
        this.getListaLocales().add(unLocal);
    }
    public ArrayList<Local> getListaLocales(){
        return this.listaLocales;
    }
    public void addAcceso(Acceso unAcceso){
        this.getListaAccesos().add(unAcceso);
    }
    public ArrayList<Acceso> getListaAccesos(){
        return this.listaAccesos;
    }
    public void addSocio(Socio unSocio){
        this.getListaSocios().add(unSocio);
    }
    public ArrayList<Socio> getListaSocios(){
        return this.listaSocios;
    }
}
