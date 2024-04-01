package abstractfactory;

public class FabricaCarro implements FabricaVeiculo {
    @Override
    public Veiculo criarVeiculo() {
        return new Carro();
    }
}
