package br.com.fiap.main;

import br.com.fiap.beans.NovoImovel;
import br.com.fiap.beans.VelhoImovel;
import br.com.fiap.beans.imoveis;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        imoveis casa1 = new imoveis("Avenida Paulista, 1001", 550000);
        imoveis casa2 = new NovoImovel("Avenida Brigadeiro, 1002", 850000);
        imoveis casa3 = new VelhoImovel("Avenida Berrini, 1055", 750000);
    }
}