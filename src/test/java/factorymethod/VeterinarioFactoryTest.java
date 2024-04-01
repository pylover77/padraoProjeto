package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VeterinarioFactoryTest {

    @Test
    public void testCriarVeterinarioCachorro() {
        VeterinarioService veterinario = VeterinarioFactory.criarVeterinario("cachorro");
        assertNotNull(veterinario);
        assertTrue(veterinario instanceof VeterinarioCachorro);
    }

    @Test
    public void testCriarVeterinarioGato() {
        VeterinarioService veterinario = VeterinarioFactory.criarVeterinario("gato");
        assertNotNull(veterinario);
        assertTrue(veterinario instanceof VeterinarioGato);
    }

    @Test
    public void testCriarVeterinarioTipoInvalido() {
        try {
            VeterinarioService veterinario = VeterinarioFactory.criarVeterinario("passaro");
            fail("Uma exceção IllegalArgumentException deveria ter sido lançada.");
        } catch (IllegalArgumentException e) {
            // Esperado
        }
    }

}