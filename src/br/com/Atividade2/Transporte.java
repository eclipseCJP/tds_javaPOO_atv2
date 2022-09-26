package br.com.Atividade2;



public class Transporte {
   private String tipo;
   private float valor;

    public Transporte(String tipo, float valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    
     public void mostrarTransporte(){ 
            System.out.println("transporte:.."+this.getTipo());
            System.out.println("valor da passagem:..R$"+this.getValor());
          
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
