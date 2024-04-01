package abstractfactory;

public class Moto implements Veiculo {
    @Override
    public void montar() {
        System.out.println("Montando moto");
    }
}
