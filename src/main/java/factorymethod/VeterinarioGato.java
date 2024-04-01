package factorymethod;

public class VeterinarioGato implements VeterinarioService {
    @Override
    public void tratarAnimal(String nomeAnimal) {
        System.out.println("Tratando gato: " + nomeAnimal);
        // Lógica específica para tratar gatos
    }
}
