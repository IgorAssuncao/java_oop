/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio35;

public class Exercicio35 {
    public static void main(String[] args) {
        Banco banco1 = new Banco(1, "Banco 1", 3);

        Conta conta1 = new Especial(2000, 1, 200);
        Conta conta2 = new Comum(2, 300);
        Conta conta3 = new Poupanca(3, 400);

        banco1.adicionarConta(conta1);
        banco1.listar();
        System.out.println();
        banco1.adicionarConta(conta2);
        banco1.listar();
        System.out.println();
        banco1.adicionarConta(conta3);
        banco1.listar();
        System.out.println();
        banco1.sacar(conta1, 10);
        banco1.listar();
    }
}
