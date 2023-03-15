package br.edu.ifrs.pwI.teste;


import br.edu.ifrs.pwI.clientes.ClientePessoaFisica;
import br.edu.ifrs.pwI.contatos.Endereco;
import br.edu.ifrs.pwI.documentos.Cpf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.*;


public class Menu {

    public static void main(String args[]) {
        ArrayList<ClientePessoaFisica> clientes = new ArrayList<>();
        while(true) {
            switch(montaMenu()) {
                case 1:
                    String telefone = JOptionPane.showInputDialog("informe o telefone:");
                    String nome= JOptionPane.showInputDialog("informe o nome:");
                    long numero = Long.parseLong(JOptionPane.showInputDialog("informe o número do Cpf:"));
                    int digito = Integer.parseInt(JOptionPane.showInputDialog("informe o dig do cpf:"));
                    Cpf cpf = new Cpf(numero, digito);
                    ArrayList<Endereco> enderecos = new ArrayList<>();
                    for (int i = 0; i < 3; i++) {
                        String logradouro = JOptionPane.showInputDialog("informe o logradouro:");
                        String complemento= JOptionPane.showInputDialog("informe o complemento:");
                        long cep = Long.parseLong(JOptionPane.showInputDialog("informe o cep:"));
                        enderecos.add(new Endereco(logradouro, complemento, cep));
                    }
                    clientes.add(new ClientePessoaFisica(telefone, enderecos, nome, cpf));

                    break;
                case 2://pesquisar por nome
                    boolean flag = false;
                    if(clientes!=null && !clientes.isEmpty()) {
                        String nomePesq= JOptionPane.showInputDialog("informe o nome:");
                        for (ClientePessoaFisica cliente : clientes) {
                            if(cliente!= null && cliente.getNome().equals(nomePesq)) {
                                JOptionPane.showMessageDialog(null, "cliente cadastrado -> " + cliente.toString());
                                flag = true;
                            }
                        }
                    }
                    if(!flag)
                        JOptionPane.showMessageDialog(null, "cliente não está cadastrado!");
                    break;
                case 3://pesquisar por cpf
                    flag = false;
                    if(clientes!=null && !clientes.isEmpty()) {
                        long numPesq = Long.parseLong(JOptionPane.showInputDialog("informe o número do Cpf para pesquisa:"));
                        int digPesq = Integer.parseInt(JOptionPane.showInputDialog("informe o dig do cpf para pesquisa:"));
                        for (ClientePessoaFisica cliente : clientes) {
                            if(cliente!= null && cliente.getCpf().getNumero()==numPesq && cliente.getCpf().getDigito()==digPesq ) {
                                JOptionPane.showMessageDialog(null, "cliente cadastrado -> " + cliente.toString());
                                flag = true;
                            }
                        }
                    }
                    if(!flag)
                        JOptionPane.showMessageDialog(null, "cliente não está cadastrado!");
                    break;
                case 4://pesquisar por CEP
                    flag = false;
                    if(clientes!=null && !clientes.isEmpty()) {
                        long cepPesq = Long.parseLong(JOptionPane.showInputDialog("informe o número do CEP para pesquisa:"));
                        for (ClientePessoaFisica cliente : clientes) {
                            if(cliente!= null) {
                                for(Endereco end : cliente.getEnderecos()) {
                                    if(end!= null && end.getCep()==cepPesq) {
                                        JOptionPane.showMessageDialog(null, "cliente cadastrado -> " + cliente.toString());
                                        flag = true;
                                    }
                                }
                            }
                        }
                    }
                    if(!flag)
                        JOptionPane.showMessageDialog(null, "cliente não está cadastrado!");
                    break;
                case 5: for (ClientePessoaFisica clientePessoaFisica : clientes) {
                    if(clientePessoaFisica!=null)
                        JOptionPane.showMessageDialog(null, clientePessoaFisica.toString());
                }
                    break;
                case 6: System.exit(0);
                    break;
            }
        }

    }
    public static int montaMenu() {
        String menu = "1 - Cadastrar Cliente Pessoa Física\n" +
                "2 - Pesquisar Cliente Pessoa Física pelo nome\n" +
                "3 - Pesquisar Cliente Pessoa Física pelo CPF\n" +
                "4 – Pesquisar Cliente Pessoa Física pelo endereço\n" +
                "5 - Listar todos os Clientes Pessoa Física\n" +
                "6 - Sair ";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
}


