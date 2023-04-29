public class Aluno {
    private String nome;
    private String turma;

    public Aluno(String nome, String turma) {
        this.nome = nome;
        this.turma = turma;
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

}
