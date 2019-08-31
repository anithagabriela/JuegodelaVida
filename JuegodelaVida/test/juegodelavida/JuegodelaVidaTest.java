/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodelavida;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class JuegodelaVidaTest extends TestCase{
      
      /**
     * Test del Methodo de la Tabla el Juego de la Vida
     */
    @Test
    public void TestValidarDimension() {
        assertTrue(JuegodelaVida.ValidarDimension());
    }
    @Test
    public void TestDefinirMuerto() {
        int fila = 3;
        int columna = 3;
        assertEquals(JuegodelaVida.DefinirVivoMuerto(fila, columna),0);
    }
    @Test
    public void TestDefinirVivo() {
        int fila = 2;
        int columna = 3;
        assertEquals(JuegodelaVida.DefinirVivoMuerto(fila, columna),1);
    }
    @Test
    public void TestRegladeJuego(){
        int fila = 1;
        int columna = 4;
        assertEquals(JuegodelaVida.ReglasJuego(fila, columna),0);
    }
    
}
