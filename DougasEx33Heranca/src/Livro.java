public class Livro extends Produto {
    private String nomeAutor;

    public Livro(int codigo, String descricao, double preco, double peso, String nomeAutor) {
        super(codigo, descricao, preco, peso);
        this.nomeAutor = nomeAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public void imprimir() {
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Descricao: " + this.getDescricao());
        System.out.println("Preco: " + this.getPreco());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Nome Autor: " + this.getNomeAutor());
    }
}
