package br.edu.ifrs.pwI.documentos;

public class Cpf extends Object{
    //atributos
    private long numero;
    private int digito;

    //construtores
    public Cpf() {}
    public Cpf(long numero, int digito) {
        super();
        this.numero = numero;
        this.digito = digito;
    }

    public long getNumero() {
        return numero;
    }
    public void setNumero(long numero) {
        this.numero = numero;
    }
    public int getDigito() {
        return digito;
    }
    public void setDigito(int digito) {
        this.digito = digito;
    }
    @Override
    public String toString() {
        return "Cpf: "+ numero + "-" + digito;
    }
}