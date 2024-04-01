package builder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class PlantaTest {

    @Test
    public void testPlantaBuilder() {
        // Criação de uma planta usando o builder
        Planta planta = new PlantaBuilder()
                .nome("Rosa")
                .especie("Rosa indica")
                .familia("Rosaceae")
                .build();

        // Verifica se os valores foram atribuídos corretamente
        assertEquals("Rosa", planta.getNome());
        assertEquals("Rosa indica", planta.getEspecie());
        assertEquals("Rosaceae", planta.getFamilia());

        // Verifica se o método detalhes() retorna os detalhes corretos
        assertEquals("Nome: Rosa, Espécie: Rosa indica, Família: Rosaceae", planta.detalhes());
    }
}
