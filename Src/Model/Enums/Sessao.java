package Model.Enums;

public enum Sessao {
    ELETRONICOS("Eletrônicos", 1),
    ALIMENTICIO("Alimentício", 2),
    FARMACEUTICO("Farmaceutico", 3),
    VESTUARIO("Vestuário", 4);

    private final String sessao;
    private final int categoria;

    Sessao(String sessao, int categoria) {
        this.sessao = sessao;
        this.categoria = categoria;
    }

    public String getSessao() {
        return sessao;
    }
    public int getCategoria() {
        return categoria;
    }
}
