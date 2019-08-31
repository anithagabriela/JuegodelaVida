/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodelavida;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class JuegodelaVida {
    private static int[] fila = new int[6];
    private static int[] columna = new int [6];
    private static int lista[][] = {{1,2}, {2,3}, {3,2}, {3,4}, {4,2}, {5,3}};
    private static ArrayList fila_juego = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static boolean ValidarDimension () {
        if(fila.length <= 3){
            return false;
        }
        return true;
        
    }
     public static void Tabla(){          
        for (int cont_fila = 1; cont_fila <= fila.length; cont_fila++){
            ArrayList fila = new ArrayList();
            for (int cont_columna = 1; 
                    cont_columna <= columna.length; cont_columna++){
                int cell_value = DefinirVivoMuerto(cont_fila, cont_columna);
                int element = cell_value;
                fila.add(element);
            }
            fila_juego.add(fila);
            System.out.println(fila);
        }
     }
     
      public static int DefinirVivoMuerto(int fila, int columna){
        int vivo = lista.length;
        int vivo_o_muerto = 0;
        for (int unvivo = 0; unvivo < vivo; unvivo++){
            if (fila == lista[unvivo][0]){
                if(columna == lista[unvivo][1]){
                    vivo_o_muerto = 1;
                }
            }
        }
        return vivo_o_muerto;
    }
      public static void CrearJuego(){
        if (ValidarDimension()){
            Tabla();
        }else{
            System.out.println("Very small board");
        }
    }
    public static int ReglasJuego(int fila, int columna){
        int neighborhood_counter = 0;
        if (fila > 0 && columna > 0){
            for (int fila_posicion = fila-1;fila_posicion <= fila+1; fila_posicion++){
                ArrayList lista_fila = (ArrayList)fila_juego.get(fila_posicion);
               for (int columna_posicion = columna-1;columna_posicion <= columna+1; columna_posicion++){
                   if(fila_posicion != fila || columna_posicion != columna){
                       int dato = Integer.parseInt(lista_fila.get(columna_posicion).toString());            
                        if(dato == 1){
                            neighborhood_counter = neighborhood_counter+1;
                        }
                   }  
                } 
            }
            if(neighborhood_counter >= 2){
                return 1;
            }
            return 0;
        }else{
            for (int fila_posicion = fila;fila_posicion <= fila+1; fila_posicion++){
                ArrayList lista_fila = (ArrayList)fila_juego.get(fila_posicion);
               for (int columna_posicion = columna;columna_posicion <= columna+1; columna_posicion++){
                   if(fila_posicion != fila || columna_posicion != columna){
                       int dato = Integer.parseInt(lista_fila.get(columna_posicion).toString());            
                        if(dato == 1){
                            neighborhood_counter = neighborhood_counter+1;
                        }
                   }  
                } 
            }
        if(neighborhood_counter >= 2){
            return 1;
        }
        return 0;
        
        }
    }
     public static void main(String[] args) {
        CrearJuego();
        ReglasJuego(1, 4);
     }
     
}
        

