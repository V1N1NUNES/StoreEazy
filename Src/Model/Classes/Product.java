package Model.Classes;

import Model.Enums.Sessao;

import java.util.UUID;

public abstract class Product {
    private String nome;
    private String descricao;
    private double valorUnitario;
    private Sessao sessaoProduto;
    private String idProduto;

    public Product(String nome, String descricao, double valorUnitario, Sessao sessaoProduto) {
        this.nome = nome;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.sessaoProduto = sessaoProduto;
        this.idProduto = UUID.randomUUID().toString();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public Sessao getSessaoProduto() {
        return sessaoProduto;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setSessaoProduto(Sessao sessaoProduto) {
        this.sessaoProduto = sessaoProduto;
    }
}
