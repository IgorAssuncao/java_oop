public class Software extends Produto {
    private String categoria;

    public Software(int codigo, String descricao, double preco, double peso, String categoria) {
        super(codigo, descricao, preco, peso);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void imprimir() {
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Descricao: " + this.getDescricao());
        System.out.println("Preco: " + this.getPreco());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Categoria: " + this.getCategoria());
    }
}
