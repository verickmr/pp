import java.util.ArrayList;
import java.util.List;
public class User {
    private String nome;
    private List<Book> livrosEmprestados;

    public User(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void emprestarLivro(Book livro, Library biblioteca) {
        if (biblioteca.removerLivro(livro)) {
            livrosEmprestados.add(livro);
            System.out.println("Livro '" + livro.getTitulo() + "' emprestado com sucesso!");
        } else {
            System.out.println("Livro '" + livro.getTitulo() + "' não está disponível.");
        }
    }

    public void devolverLivro(Book livro, Library biblioteca) {
        if (livrosEmprestados.remove(livro)) {
            biblioteca.adicionarLivro(livro);
            System.out.println("Livro '" + livro.getTitulo() + "' devolvido com sucesso!");
        } else {
            System.out.println("Você não possui o livro '" + livro.getTitulo() + "'.");
        }
    }

    public void exibirLivrosEmprestados() {
        System.out.println("Livros emprestados por " + nome + ":");
        for (Book livro : livrosEmprestados) {
            livro.exibirInfo();
        }
    }

}
