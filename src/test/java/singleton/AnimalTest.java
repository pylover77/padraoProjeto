package singleton;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    @Test
    public void testSingleton() {
        // Obtém duas instâncias do Animal
        Animal animal1 = Animal.getInstance();
        Animal animal2 = Animal.getInstance();

        // Verifica se as duas instâncias são iguais
        assertEquals(animal1, animal2);
    }

    @Test
    public void testSetName() {
        // Obtém uma instância do Animal
        Animal animal = Animal.getInstance();

        // Define um nome para o animal
        animal.setName("Cachorro");

        // Verifica se o nome foi definido corretamente
        assertEquals("Cachorro", animal.getName());
    }
}
