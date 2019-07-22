public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro(1, "livro", 10.5, 0.4, "Joao");
        CD cd1 = new CD(1, "cd", 11, 0.2, "Metallica");
        Software software1 = new Software(3, "software", 100, 0.1, "OpenSource");

        livro1.imprimir();
        System.out.println();
        cd1.imprimir();
        System.out.println();
        software1.imprimir();
    }
}
