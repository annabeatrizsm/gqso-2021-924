package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;

public class SomaTest {
    Soma soma;

    @BeforeEach
    public void setup(String string) {
        soma = new Soma();
    }
     
    @Test
    public void testSoma_success() {
        assertEquals(2 + 2, soma.rotaDaSoma("4.", null));
    }
    
    @Test
    public void testSoma_entradaLetra() {
        assertThrows(IllegalArgumentException.class, () ->{
            soma.rotaDaSoma("a", null);
        });
    }

    @Test
    public void testSoma_entradaNegativo() {
        assertThrows(IllegalArgumentException.class, () ->{
            soma.rotaDaSoma("-4", null);
        });
    }
}
