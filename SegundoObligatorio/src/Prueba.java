
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermo Trecca
 */
public class Prueba {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Gimnasio Gym = new Gimnasio();
        menu();
    }
    
    
     public static void menu(){
        Scanner in = new Scanner(System.in);
        int i =0;
        boolean bSalida=false;
        while (!bSalida){
            System.out.println("Bienvenido a ULTRA GYM V2.0 \n-----------------\n\n 1) Registro de socio \n 2) Registro de profesor \n 3)  Recarga de cuponera \n 4) Registro de local \n 5)  Registro de acceso a gimnasio \n 6)  Consulta de uso \n 7) Listado de accesos \n 8)  Tipo de actividad más común \n 9) Consulta de Profesores");
            i= in.nextInt();
            in.nextLine();
            switch (i){
                case 1:{
                    
                    break;
                }
                case 2 :{
                    
                    break;
                }
                case 3:{
                  bSalida=true;  
                    break;
                }
                   
        }
            
        }
    }
     
     
     public static int PideNumero(int min,int max, String unString){
        /* verifica que el valor esté entre el mínimo y el máximo asignado.
        en caso contrario pide nuevamente el valor, preguntando con el String asignado.
        */
        boolean bSalida= false;
        Scanner in = new Scanner(System.in);
        System.out.println(unString + " (Entre " + min + " y " + max+ " ): ");
        int valor = in.nextInt();
        in.nextLine();
        while (!bSalida){
            if (valor<min||valor>max){
                System.out.println("El valor ingresado no esta dentro de los parametros correctos.");
                 System.out.println(unString + " entre " + min + " y " + max+ " : ");
                 valor = in.nextInt();
                 in.nextLine();
            }else{
                bSalida=true;
            }
        }    
       return valor;
    }
     
     public static String PideTexto(String sConsulta){
         // método para pedir un texto
        Scanner in = new Scanner(System.in);
        System.out.println(sConsulta);
        return in.nextLine();
    }
    
}
