public class Produto {
    protected int codigo;
    protected String descricao;
    protected double preco;
    protected double peso;

    public Produto(int codigo, String descricao, double preco, double peso) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calculoFrete() {
        return this.peso * 6.5;
    }
}
