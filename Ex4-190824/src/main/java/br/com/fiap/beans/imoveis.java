package br.com.fiap.beans;

public class imoveis {
    private String endereco;
    private double preco;

    public imoveis() {
    }

    public imoveis(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void printCalcPreco() {
        System.out.print("O preço do imóvel é R$" + preco);
    }

}


