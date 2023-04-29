public class Aluno {
    private String nome;
    private int idade;
    private String turma;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTurma() {
        return turma;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public void setIdade(int novaIdade) {
        idade = novaIdade;
    }

    public void setTurma(String novaTurma) {
        turma = novaTurma;
    }
}