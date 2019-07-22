package douglasex30;

public class DouglasEx30 {
    public static void main(String[] args) {
        Curso curso = new Curso("TI", 10);

        Aluno aluno1 = new Aluno(getMatriculaUltimoAluno(curso), "Jorge");
        curso.matricular(aluno1);

        curso.imprimir();
        System.out.println();

        Aluno aluno2 = new Aluno(getMatriculaUltimoAluno(curso), "Joao");
        curso.matricular(aluno2);

        curso.imprimir();
        System.out.println();

        Aluno aluno3 = new Aluno(getMatriculaUltimoAluno(curso), "Pedro");
        curso.matricular(aluno3);

        curso.imprimir();
        System.out.println();

        curso.cancelarMatricula(aluno3);
        curso.imprimir();

    }

    public static int getMatriculaUltimoAluno(Curso curso) {
        Aluno[] alunos = curso.getAlunos();
        int ultimaMatricula = 0;
        for (int index = 0; index < curso.getQtdAlunos(); index++) {
            ultimaMatricula = alunos[index].getMatricula();
        }
        System.out.println();

        return ultimaMatricula + 1;
    }
}
