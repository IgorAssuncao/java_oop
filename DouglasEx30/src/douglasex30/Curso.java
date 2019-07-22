package douglasex30;

public class Curso {
    private String nome;
    private int qtdVagas;
    private Aluno[] alunos;
    private int qtdAlunos = 0;
    
    public Curso(String nome, int qtdVagas) {
        this.nome = nome;
        this.qtdVagas = qtdVagas;
        this.alunos = new Aluno[qtdVagas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdVagas() {
        return qtdVagas;
    }

    public void setQtdVagas(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }
    
    
    public boolean matricular(Aluno aluno) {
        for (int index = 0; index < qtdAlunos; index++) {
            if (alunos[index].getMatricula() == aluno.getMatricula()) {
                System.out.println("Matricula " + aluno.getMatricula() + " ja existente");
                return false;
            }
        }
        alunos[qtdAlunos] = aluno;
        qtdAlunos++;
        return true;
    }
    
    public boolean cancelarMatricula(Aluno aluno) {
        for (int index = 0; index < alunos.length; index++) {
            if (alunos[index].getMatricula() == aluno.getMatricula()) {
                alunos[index] = null;
                qtdAlunos--;
                return true;
            }
        }
        return false;
    }
    
    public void imprimir() {
        System.out.println("Informacoes do curso " + this.getNome() + ":");
        System.out.println("Quantidade de Vagas: " + this.getQtdVagas());
        System.out.println("Quantidade de Alunos: " + this.getQtdAlunos());
        for (int index = 0; index < qtdAlunos; index++) {
            System.out.printf("Matricula do aluno %d: %s\n", index + 1, alunos[index].getMatricula());
            System.out.printf("Nome do aluno %d: %s\n", index + 1, alunos[index].getNome());
        }
    }
}
