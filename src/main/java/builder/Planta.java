package builder;


public class Planta {
    private String nome;
    private String especie;
    private String familia;

    public Planta(String nome, String especie, String familia) {
        this.nome = nome;
        this.especie = especie;
        this.familia = familia;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getFamilia() {
        return familia;
    }

    // Método para exibir detalhes da planta
    public String detalhes() {
        return "Nome: " + nome + ", Espécie: " + especie + ", Família: " + familia;
    }
}

