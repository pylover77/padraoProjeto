package abstractfactory;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FabricaVeiculoTest {

    @Test
    public void testFabricaCarro() {
        FabricaVeiculo fabricaCarro = new FabricaCarro();
        Veiculo carro = fabricaCarro.criarVeiculo();
        assertNotNull(carro);
        assertTrue(carro instanceof Carro);
    }

    @Test
    public void testFabricaMoto() {
        FabricaVeiculo fabricaMoto = new FabricaMoto();
        Veiculo moto = fabricaMoto.criarVeiculo();
        assertNotNull(moto);
        assertTrue(moto instanceof Moto);
    }
}
