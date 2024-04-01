package abstractfactory;

public class FabricaMoto implements FabricaVeiculo {
    @Override
    public Veiculo criarVeiculo() {
        return new Moto();
    }
}