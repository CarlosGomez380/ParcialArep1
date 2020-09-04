package edu.escuelaing.arep.lab1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Unit test for simple App.
 */
public class AppTest {

    public LinkedLista lista= new LinkedLista();

    @Before
    public void add() {
        for (int i = 1; i < 11; i++) {
            lista.addNode(i);
        }
    }

    @Test
    public void deberiaCalcularLaDesviacionEstandar() {
        assertEquals(3.03, App.deviation(lista) , 0);

    }

    @Test
    public void deberiaCalcularLaMedia() {
        assertEquals(5.5,App.mean(lista), 0);
    }


}