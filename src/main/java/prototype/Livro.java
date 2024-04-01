package prototype;

// Classe Livro como objeto protótipo
class Livro implements Cloneable {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Método para obter título do livro
    public String getTitulo() {
        return titulo;
    }

    // Método para definir título do livro
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Método para obter autor do livro
    public String getAutor() {
        return autor;
    }

    // Método para definir autor do livro
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método para clonar o livro
    @Override
    public Livro clone() throws CloneNotSupportedException {
        return (Livro) super.clone();
    }
}



