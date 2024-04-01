package abstractfactory;

public class Carro implements Veiculo {
    @Override
    public void montar() {
        System.out.println("Montando carro");
    }
}