package br.com.alura.aplicacaodecompras.modelos.modelo.Compra;

public class Compras {
    String descricao;
    double valor;

    public Compras(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}

