package br.edu.ifrs.pwI.clientes;

import br.edu.ifrs.pwI.contatos.Endereco;

import java.util.List;

public class Cliente {
   private String telefone;
   private List<Endereco> enderecos;

   public Cliente(){};
   public Cliente(String telefone, List<Endereco> enderecos) {
      super(); //serve para chamar o construtor da super classe
      this.telefone = telefone;
      this.enderecos = enderecos;
   }

   public String getTelefone() {
      return telefone;
   }

   public void setTelefone(String telefone) {
      this.telefone = telefone;
   }

   public List<Endereco> getEnderecos() {
      return enderecos;
   }

   public void setEnderecos(List<Endereco> enderecos) {
      this.enderecos = enderecos;
   }

   @Override
   public String toString() {
      return "Cliente{" +
              "telefone='" + telefone + '\'' +
              ", enderecos=" + enderecos +
              '}';
   }
}
