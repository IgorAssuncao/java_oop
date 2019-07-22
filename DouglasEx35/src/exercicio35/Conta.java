package exercicio35;

public class Conta {
    protected int numero;
    protected float saldo;

    public Conta(int numero, float saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(float valor){
        saldo = saldo + valor;
    }
    
    public void sacar(float valor){
        saldo = saldo - valor;
    }
    
    public void consultarSaldo(){
        System.out.println("Saldo = " + saldo);
        //return saldo;
    }
    
}
