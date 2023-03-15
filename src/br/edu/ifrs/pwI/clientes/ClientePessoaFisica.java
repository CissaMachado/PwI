package br.edu.ifrs.pwI.clientes;

import br.edu.ifrs.pwI.contatos.Endereco;
import br.edu.ifrs.pwI.documentos.Cpf;

import java.util.List;

public class ClientePessoaFisica extends Cliente{
    private String nome;
    private Cpf cpf;

    public ClientePessoaFisica() {}
    public ClientePessoaFisica(String telefone, List<Endereco> enderecos,
                               String nome, Cpf cpf) {
        super(telefone, enderecos); //chama o construtor da superclasse
        this.nome = nome;
        this.cpf = cpf;
    }
    @Override
    public String toString() {
        return super.toString() + "\nNome:" + nome + "\n Cpf:" + cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Cpf getCpf() {
        return cpf;
    }
    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }





}

