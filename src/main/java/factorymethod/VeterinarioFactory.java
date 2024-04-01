package factorymethod;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

// Factory Method para criar instâncias de VeterinarioService
public class VeterinarioFactory {

    // Mapa de registros para associar tipos de animais com fornecedores de serviços de veterinário
    private static final Map<String, Supplier<VeterinarioService>> fornecedores = new HashMap<>();

    // Registrando fornecedores de serviços de veterinário para diferentes tipos de animais
    static {
        fornecedores.put("cachorro", VeterinarioCachorro::new);
        fornecedores.put("gato", VeterinarioGato::new);
    }

    // Método de fábrica que retorna uma instância adequada de VeterinarioService
    public static VeterinarioService criarVeterinario(String tipoAnimal) {
        Supplier<VeterinarioService> fornecedor = fornecedores.get(tipoAnimal.toLowerCase());
        if (fornecedor != null) {
            return fornecedor.get();
        }
        throw new IllegalArgumentException("Tipo de animal não suportado: " + tipoAnimal);
    }
}
