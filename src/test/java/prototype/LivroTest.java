package prototype;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class LivroTest {

    @Test
    public void testCloneLivro() {
        // Criação de um livro
        Livro livroOriginal = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");

        try {
            // Clonagem do livro
            Livro livroClone = livroOriginal.clone();

            // Verifica se os títulos são iguais
            assertEquals(livroOriginal.getTitulo(), livroClone.getTitulo());

            // Verifica se os autores são iguais
            assertEquals(livroOriginal.getAutor(), livroClone.getAutor());

            // Verifica se os objetos são diferentes
            assertNotSame(livroOriginal, livroClone);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

