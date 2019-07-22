package exercicio35;

public class Comum extends Conta{
    public Comum(int numero, float saldo) {
        super(numero, saldo);
    }
    
    @Override
    public void sacar(float valor){
        if((saldo - valor) >= 0)
            saldo = saldo - valor;
    }
}
