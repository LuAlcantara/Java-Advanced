package br.com.fiap.beans;

public class Funcionario {
    protected String nome;
    protected double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void printNome(){
        System.out.println("Nome: " + nome);
    }

    public void printSalario(){
        System.out.println("Salário: " + salario);
    }

    public void calcSalario(){
        this.salario = 1000;
    }
}
