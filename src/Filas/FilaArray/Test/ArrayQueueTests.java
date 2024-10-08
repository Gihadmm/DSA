package Filas.FilaArray.Test;

import Filas.FilaArray.ArrayQueue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ArrayQueueTests {

    @Test
    void testEnqueue() {
        ArrayQueue c = new ArrayQueue();
        assertEquals("[]", c.toString(), "Deve imprimir []");

        c.Enqueue("BOS");
        assertEquals("[BOS]", c.toString(), "Deve imprimir [BOS]");

        c.Enqueue("ATL");
        assertEquals("[ATL, BOS]", c.toString(), "Deve imprimir [ATL, BOS]");

        c.Enqueue("MSP");
        assertEquals("[MSP, ATL, BOS]", c.toString(), "Deve imprimir [MSP, ATL, BOS]");

        c.Enqueue("LAX");
        assertEquals("[LAX, MSP, ATL, BOS]", c.toString(), "Deve imprimir [LAX, MSP, ATL, BOS]");
    }

    @Test
    void testDequeue() {
        ArrayQueue c = new ArrayQueue();
        assertEquals("[]", c.toString(), "Deve imprimir []");

        c.Enqueue("BOS");
        assertEquals("[BOS]", c.toString(), "Deve imprimir [BOS]");

        c.Enqueue("ATL");
        assertEquals("[ATL, BOS]", c.toString(), "Deve imprimir [ATL, BOS]");

        c.Dequeue();
        assertEquals("[ATL]", c.toString(), "Deve imprimir [ATL]");

        c.Enqueue("LAX");
        assertEquals("[ATL, LAX]", c.toString(), "Deve imprimir [ATL, LAX]");

        c.Dequeue();
        assertEquals("[LAX]", c.toString(), "Deve imprimir [LAX]");

        c.Dequeue();
        assertEquals("[]", c.toString(), "Deve imprimir []");

    }


    @Test
    void testIsEmpty() {
        ArrayQueue c = new ArrayQueue();
        assertTrue(c.isEmpty(), "A lista deve estar vazia");

        c.Enqueue("BOS");
        assertFalse(c.isEmpty(), "A lista não deve estar vazia");

        c.Enqueue("BOS2");
        assertFalse(c.isEmpty(), "A lista não deve estar vazia");

        c.Dequeue();
        assertFalse(c.isEmpty(), "A lista não deve estar vazia");

        c.Dequeue();
        assertTrue(c.isEmpty(), "A lista deve estar vazia");

    }

    @Test
    void testSize() {

        ArrayQueue c = new ArrayQueue();
        assertEquals(0, c.size(), "Tamanho deve ser 0");

        c.Enqueue("BOS");
        assertEquals(1, c.size(), "Tamanho deve ser 1");

        c.Enqueue("BOS2");
        assertEquals(2, c.size(), "Tamanho deve ser 2");

        c.Dequeue();
        assertEquals(1, c.size(), "Tamanho deve ser 1");

        c.Dequeue();
        assertEquals(0, c.size(), "Tamanho deve ser 0");

        c.Enqueue("BOS1");
        c.Enqueue("BOS2");
        c.Enqueue("BOS3");
        c.Enqueue("BOS4");
        assertEquals(4, c.size(), "Tamanho deve ser 4");
    }

    @Test
    void testFront() {

        ArrayQueue c = new ArrayQueue();

        c.Enqueue("BOS");
        assertEquals("[BOS]", c.toString(), "Deve imprimir [BOS]");

        c.Enqueue("BOS2");
        assertEquals("[BOS]", c.toString(), "Deve imprimir [BOS]");

        c.Dequeue();
        assertEquals("[BOS2]", c.toString(), "Deve imprimir [BOS2]");

        c.Enqueue("BOS3");
        assertEquals("[BOS2]", c.toString(), "Deve imprimir [BOS2]");

        c.Dequeue();
        assertEquals("[BOS3]", c.toString(), "Deve imprimir [BOS3]");
    }


}
