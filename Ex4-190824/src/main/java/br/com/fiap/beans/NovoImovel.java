package br.com.fiap.beans;

public class NovoImovel extends imoveis{
    public NovoImovel(String s, int i) {
    }

    public void AdicionalPreco (String endereco, double preco) {
        super(endereco, preco);
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }
}
