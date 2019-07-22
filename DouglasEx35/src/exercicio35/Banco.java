package exercicio35;

public class Banco {
    private int codigo;
    private String nome;
    private Conta contas[];
    private int qtdMaximaContas;
    private int qtdContas = 0;

    public Banco(int codigo, String nome, int qtdMaximaContas) {
        this.codigo = codigo;
        this.nome = nome;
        this.contas = new Conta[qtdMaximaContas];
        this.qtdMaximaContas = qtdMaximaContas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta[] getContas() {
        return contas;
    }

    public void setContas(Conta[] contas) {
        this.contas = contas;
    }

    public int getQtdMaximaContas() {
        return qtdMaximaContas;
    }

    public void setQtdMaximaContas(int qtdMaximaContas) {
        this.qtdMaximaContas = qtdMaximaContas;
    }

    public int getQtdContas() {
        return qtdContas;
    }

    public void setQtdContas(int qtdContas) {
        this.qtdContas = qtdContas;
    }

    public boolean adicionarConta(Conta conta) {
        if (conta instanceof Poupanca) {
            this.contas[qtdContas] = new Poupanca(((Poupanca) conta).getNumero(), ((Poupanca) conta).getSaldo());
        }

        if (conta instanceof Comum) {
            this.contas[qtdContas] = new Comum(((Comum) conta).getNumero(), ((Comum) conta).getSaldo());
        }

        if (conta instanceof Especial) {
            this.contas[qtdContas] = new Especial(((Especial) conta).getLimite(), ((Especial) conta).getNumero(), ((Especial) conta).getSaldo());
        }

        this.qtdContas++;
        return true;
    }

    public boolean removerConta(Conta conta) {
        for (int index = 0; index < this.qtdMaximaContas; index++) {
            if (conta.getNumero() == this.contas[index].getNumero()) {
                this.contas[index] = this.contas[qtdContas - 1];
                this.qtdContas--;
            }
        }
        return false;
    }

    public void depositar(Conta conta, float valor) {
        for (int index = 0; index < this.qtdContas; index++) {
            if (this.contas[index].getNumero() == conta.getNumero()) {
                conta.depositar(valor);
            }
        }
    }

    public void sacar(Conta conta, float valor) {
        for (int index = 0; index < this.qtdContas; index++) {
            if (this.contas[index].getNumero() == conta.getNumero()) {
                conta.sacar(valor);
            }
        }
    }

    public void listar(){
        for (int index = 0; index < this.qtdContas; index++) {
            System.out.println("Conta: " + contas[index].getNumero() + "\tSaldo: " + contas[index].getSaldo());
        }
    }
}
