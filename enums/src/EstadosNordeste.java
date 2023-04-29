public enum EstadosNordeste {
    PARAIBA("PB", "Paraíba"),
    PERNAMBUCO("PE", "Pernambuco"),
    CEARA("CE", "Ceará"),
    MARANHHAO("MA", "Maranhão");

    private String sigla;
    private String nome;

    private EstadosNordeste(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

}
