
public class Condicionais
{
    public static String paridade(int numero) {
        if (numero % 2 == 0) {
            return "Par";
        }
        return "Impar";
    }

    public static String maior(int numero1, int numero2) {
        if (numero1 > numero2)
            return String.format("O numero maior e %d", numero1);

        return String.format("O numero maior e %d", numero2);
    }

    public static String maiorMenor(int numero1, int numero2, int numero3) {
        if (numero1 > numero2 && numero2 > numero3)
            return String.format("O numero maior é %d e o menor é %d", numero1, numero3);
        if (numero1 > numero3 && numero3 > numero2)
            return String.format("O numero maior é %d e o menor é %d", numero1, numero2);
        if (numero2 > numero3 && numero3 > numero1)
            return String.format("O numero maior é %d e o menor é %d", numero2, numero1);
        if (numero2 > numero1 && numero1 > numero3)
            return String.format("O numero maior é %d e o menor é %d", numero2, numero3);
        if (numero3 > numero1 && numero1 > numero2)
            return String.format("O numero maior é %d e o menor é %d", numero3, numero2);
        if (numero3 > numero2 && numero2 > numero1)
            return String.format("O numero maior é %d e o menor é %d", numero3, numero1);
        return String.format("");
    }
}
