public class CD extends Produto {
    private String nomeBanda;

    public CD(int codigo, String descricao, double preco, double peso, String nomeBanda) {
        super(codigo, descricao, preco, peso);
        this.nomeBanda = nomeBanda;
    }

    public String getNomeBanda() {
        return nomeBanda;
    }

    public void setNomeBanda(String nomeBanda) {
        this.nomeBanda = nomeBanda;
    }

    public void imprimir() {
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Descricao: " + this.getDescricao());
        System.out.println("Preco: " + this.getPreco());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Nome Banda: " + this.getNomeBanda());
    }
}
