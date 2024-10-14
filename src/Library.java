import java.util.ArrayList;
import java.util.List;
public class Library {
    private String nome;
    private List<Book> livrosDisponiveis;

    public Library(String nome) {
        this.nome = nome;
        this.livrosDisponiveis = new ArrayList<>();
    }

    public void adicionarLivro(Book livro) {
        livrosDisponiveis.add(livro);
        System.out.println("Livro '" + livro.getTitulo() + "' adicionado à biblioteca.");
    }

    public boolean removerLivro(Book livro) {
        return livrosDisponiveis.remove(livro);
    }

    public void exibirLivrosDisponiveis() {
        System.out.println("Livros disponíveis na biblioteca " + nome + ":");
        for (Book livro : livrosDisponiveis) {
            livro.exibirInfo();
        }
    }
}

