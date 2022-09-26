package br.com.Atividade2;

public class Venda {
    private Cliente cliente;
    private String formaPg;
    private PacoteViagem pacote;
    private float dolar;

    public Venda(Cliente cliente, String formaPg, PacoteViagem pacote,float dolar) {
        this.cliente = cliente;
        this.formaPg = formaPg;
        this.pacote = pacote;
        this.dolar=dolar;
    }
    
    public void mostrarVenda(){
        System.out.println("VENDA REALIZADA");
        System.out.println("=======================================");
        pacote.mostrarPacoteViagem();
        cliente.mostrarCliente();
        System.out.println("forma de pagamento:.."+this.getFormaPg());
        System.out.println("total hospedagem:..R$"+pacote.calcularTotalHospedagem());
        System.out.println("total pacote:..R$"+pacote.totalPacote());
        System.out.println("total Dolar:..US$"+cotacaoRealParaDolar());
        System.out.println("=======================================");
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFormaPg() {
        return this.formaPg;
    }

    public void setFormaPg(String formaPg) {
        this.setFormaPg(formaPg);
    }
    
    public PacoteViagem getPacote() {
        return pacote;
    }

    public void setPacote(PacoteViagem pacote) {
        this.pacote = pacote;
    }

    public float getDolar() {
        return dolar;
    }

    public void setDolar(float dolar) {
        this.dolar = dolar;
    }
    
    public float cotacaoRealParaDolar(){
        float cotacao;
        cotacao= pacote.totalPacote()/this.getDolar();
        return cotacao;
    }
    
    
}
