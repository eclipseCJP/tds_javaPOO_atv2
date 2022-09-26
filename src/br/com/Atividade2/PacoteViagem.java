package br.com.Atividade2;

public class PacoteViagem {
    private Transporte transportes;
    private Hospedagem hospedagens;
    private String destino;
    private int qtdDias;
    private float porcentagem;

    public PacoteViagem(Transporte transportes, Hospedagem hospedagens, String destino, int qtdDias,float porcentagem) {
        this.transportes = transportes;
        this.hospedagens = hospedagens;
        this.destino = destino;
        this.qtdDias = qtdDias;
        this.porcentagem=porcentagem;
    }
    public void mostrarPacoteViagem(){
        System.out.println("PACOTE");
        System.out.println("============================");
        hospedagens.mostrarHospedagem();
        transportes.mostrarTransporte();
        System.out.println("destino:.."+this.getDestino());
        System.out.println("periodo:.."+this.getQtdDias()+" dias");
        
    }
    
    public Transporte getTransportes() {
        return transportes;
    }

    public void setTransportes(Transporte transportes) {
        this.transportes = transportes;
    }

    public Hospedagem getHospedagens() {
        return hospedagens;
    }

    public void setHospedagens(Hospedagem hospedagens) {
        this.hospedagens = hospedagens;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    } 

    public float getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(float porcentagem) {
        this.porcentagem = porcentagem;
    }
    
    
    public float calcularTotalHospedagem(){
       float totalHospedagem;
       totalHospedagem= hospedagens.getValorDiaria()*qtdDias;
       return totalHospedagem;
    }
    public float calcularLucro(){
        float margem;
        margem=getPorcentagem()*calcularTotalHospedagem();
        return margem;
    }
    public float totalPacote(){
        float totalValorPacote;
        totalValorPacote=transportes.getValor()+calcularTotalHospedagem()+calcularLucro();
        return totalValorPacote;
    }
    
}
