package factorymethod;

public class VeterinarioCachorro implements VeterinarioService {
    @Override
    public void tratarAnimal(String nomeAnimal) {
        System.out.println("Tratando cachorro: " + nomeAnimal);
        // Lógica específica para tratar cachorros
    }
}
