package exercicio35;

public class Poupanca extends Conta{
    public Poupanca(int numero, float saldo) {
        super(numero, saldo);
    }
    
    @Override
    public void sacar(float valor){
        if((saldo - valor) >= 0)
            saldo = saldo - valor;
    }
    
    public void calculaRendimento(float percentual){
        saldo = saldo + (saldo * (percentual/100));
    }
}
