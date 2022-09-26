package br.com.Atividade2;

public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
    
    public void mostrarCliente(){
        System.out.println("Cliente:.."+this.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
