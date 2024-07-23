package model;

import java.util.Date;

public class Pessoa {

    private static int counter = 1;

    private int numeroPessoa ;
    private String name;
    private String cpf;
    private String numeroDaConta; 
    private Date accountCreationDate;

    public Pessoa() { }

    public Pessoa(String name, String cpf, String numeroDaConta) {
        this.numeroPessoa = Pessoa.counter;
        this.name = name;
        this.cpf = cpf;
        this.numeroDaConta = numeroDaConta;
        this.accountCreationDate = new Date();
        Pessoa.counter += 1;
    }

    public int getNumeroPessoa() {
        return this.numeroPessoa;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String numeroDaConta() {
        return numeroDaConta;
    }
    public void setnumeroDaConta(String numeroDaContal) {
        this.numeroDaConta = numeroDaConta;
    }
    public Date getAccountCreationDate() {
        return this.accountCreationDate;
    }

    public String toString() {
        return  "\nName: " + this.getName() +
                "\nCPF: " + this.getCpf() +
                "\nnumeroDaConta: " + this.getnumeroDaConta() +
                "\nAccount Creation Date: " + Utils.dateToString(this.getAccountCreationDate());
    }


}