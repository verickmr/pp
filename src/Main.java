public class Main {
    public static void main(String[] args) {
        Library bc = new Library("Biblioteca Central");

        Book livro1 = new Book("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Book livro2 = new Book("Dom Casmurro", "Machado de Assis", 1899);
        Book livro3 = new Book("1984", "George Orwell", 1949);

        bc.adicionarLivro(livro1);
        bc.adicionarLivro(livro2);
        bc.adicionarLivro(livro3);

        bc.exibirLivrosDisponiveis();

        User usuario = new User("Carlos");

        usuario.emprestarLivro(livro1, bc);

        usuario.exibirLivrosEmprestados();

        usuario.devolverLivro(livro1, bc);

        bc.exibirLivrosDisponiveis();
    }

}