package builder;



public class PlantaBuilder {
    private String nome;
    private String especie;
    private String familia;

    public PlantaBuilder() {
    }

    public PlantaBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PlantaBuilder especie(String especie) {
        this.especie = especie;
        return this;
    }

    public PlantaBuilder familia(String familia) {
        this.familia = familia;
        return this;
    }

    public Planta build() {
        return new Planta(nome, especie, familia);
    }
}
