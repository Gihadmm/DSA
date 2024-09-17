package ListasEncadeadas.LEC.test;

import ListasEncadeadas.LEC.ListaEncadeadaCircular.CircularSLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircularSLinkedListTest {
    @Test
    void testAddHead() {
        CircularSLinkedList c = new CircularSLinkedList();
        assertEquals("[]", c.toString(), "Deve imprimir []");

        c.addHead("BOS");
        assertEquals("[BOS]", c.toString(), "Deve imprimir [BOS]");

        c.addHead("ATL");
        assertEquals("[ATL, BOS]", c.toString(), "Deve imprimir [ATL, BOS]");

        c.addHead("MSP");
        assertEquals("[MSP, ATL, BOS]", c.toString(), "Deve imprimir [MSP, ATL, BOS]");

        c.addHead("LAX");
        assertEquals("[LAX, MSP, ATL, BOS]", c.toString(), "Deve imprimir [LAX, MSP, ATL, BOS]");
    }

    @Test
    void testAddTail() {
        CircularSLinkedList c = new CircularSLinkedList();
        assertEquals("[]", c.toString(), "Deve imprimir []");

        c.addTail("MSP");
        assertEquals("[MSP]", c.toString(), "Deve imprimir [MSP]");

        c.addTail("ATL");
        assertEquals("[MSP, ATL]", c.toString(), "Deve imprimir [MSP, ATL]");

        c.addTail("BOS");
        assertEquals("[MSP, ATL, BOS]", c.toString(), "Deve imprimir [MSP, ATL, BOS]");

        c.addTail("MIA");
        assertEquals("[MSP, ATL, BOS, MIA]", c.toString(), "Deve imprimir [MSP, ATL, BOS, MIA]");
    }

    @Test
    void testRemoveFirst() {
        CircularSLinkedList c = new CircularSLinkedList();
        assertEquals("[]", c.toString(), "Deve imprimir []");

        c.addTail("MSP");
        assertEquals("[MSP]", c.toString(), "Deve imprimir [MSP]");

        c.addTail("BOS");
        assertEquals("[MSP, BOS]", c.toString(), "Deve imprimir [MSP, BOS]");

        c.removeFirst();
        assertEquals("[BOS]", c.toString(), "Deve imprimir [BOS]");

        c.removeFirst();
        assertEquals("[]", c.toString(), "Deve imprimir []");

//        assertThrows(EmptyCircularSLinkedList.class, () -> {
//            c.removeFirst();
//        });
    }

    @Test
    void testSize() {
        CircularSLinkedList c = new CircularSLinkedList();
        assertEquals(0, c.size(), "Tamanho deve ser 0");

        c.addTail("A");
        assertEquals(1, c.size(), "Tamanho deve ser 1");

        c.addTail("B");
        assertEquals(2, c.size(), "Tamanho deve ser 2");

        c.removeFirst();
        assertEquals(1, c.size(), "Tamanho deve ser 1");

        c.removeFirst();
        assertEquals(0, c.size(), "Tamanho deve ser 0");
    }

    @Test
    void testIsEmpty() {
        CircularSLinkedList c = new CircularSLinkedList();
        assertTrue(c.isEmpty(), "A lista deve estar vazia");

        c.addTail("A");
        assertFalse(c.isEmpty(), "A lista não deve estar vazia");

        c.removeFirst();
        assertTrue(c.isEmpty(), "A lista deve estar vazia");
    }

}
