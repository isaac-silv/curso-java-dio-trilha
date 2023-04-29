public class Escola {
    public static void main(String[] args) {
        Aluno andre = new Aluno();

        andre.setNome("André");
        andre.setIdade(10);
        andre.setTurma("6ª série");

        System.out.println(
                "O aluno(a) " + andre.getNome() + " tem " + andre.getIdade() + " anos e estuda na " + andre.getTurma());
    }
}
