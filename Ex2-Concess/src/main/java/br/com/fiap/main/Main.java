package br.com.fiap.main;

import br.com.fiap.beans.Analista;
import br.com.fiap.beans.Engenheiro;
import br.com.fiap.beans.Estagiario;
import br.com.fiap.beans.Gerente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setNome("Pedro");
        g.printNome();
        g.calcSalario();
        g.printSalario();

        Analista a = new Analista();
        a.setNome("Patricia");
        a.printNome();
        a.calcSalario();
        a.printSalario();

        Estagiario estag = new Estagiario();
        estag.setNome("Julia");
        estag.printNome();
        estag.calcSalario();
        estag.printSalario();

        Engenheiro eng = new Engenheiro();
        eng.setNome("Lucas");
        eng.printNome();
        eng.calcSalario();
        eng.printSalario();
    }
}