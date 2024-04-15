package Ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KitTest {

    @Test
    void testCalcularPrecio() {
        ElementoSimple silla = new ElementoSimple(1, 50.0);
        ElementoSimple mesa = new ElementoSimple(2, 100.0);

        Kit kit = new Kit(1001);
        kit.agregarElemento(silla);
        kit.agregarElemento(mesa);

        // Prueba para verificar si el precio se calcula correctamente
        assertEquals(135.0, kit.calcularPrecio(), 0.001);
    }

    @Test
    void testAgregarElemento() {
        ElementoSimple silla = new ElementoSimple(1, 50.0);
        ElementoSimple mesa = new ElementoSimple(2, 100.0);

        Kit kit = new Kit(1001);
        kit.agregarElemento(silla);
        kit.agregarElemento(mesa);

        // Prueba para verificar si los elementos se agregan correctamente al kit
        assertEquals(2, kit.getElementos().size());
        assertTrue(kit.getElementos().contains(silla));
        assertTrue(kit.getElementos().contains(mesa));
    }
}

