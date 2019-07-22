public class Pessoa
{
    private String nome;
    private int idade;
    private double peso;
    private String sobrenome;
    private Endereco endereco;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, String sobrenome, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public boolean doadorDeSangue() {
        if ((this.getIdade() > 18 && this.getIdade() <= 69) && this.getPeso() > 50) {
            return true;
        }

        return false;
    }

    public String nomeCompleto() {
        return this.getNome() + " " + this.getSobrenome();
    }

    public String iniciais() {
        return this.getNome().charAt(0) + "" + this.getSobrenome().charAt(0);
    }

    public String destinatario() {
        return String.format(this.getNome() + " " + this.getSobrenome() + ". " + this.getEndereco());
    }
}
