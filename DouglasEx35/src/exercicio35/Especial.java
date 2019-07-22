package exercicio35;

public class Especial extends Conta{
    private float limite;

    public Especial(float limite, int numero, float saldo) {
        super(numero, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void sacar(float valor){
        if((saldo+limite-valor) >= 0)
            saldo = saldo - valor;
    }
}
