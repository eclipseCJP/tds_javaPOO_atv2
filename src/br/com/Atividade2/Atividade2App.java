package br.com.Atividade2;
import java.util.Scanner;

public class Atividade2App 
{
    public static void main(String[] args) 
    {   
        Scanner entrada = new Scanner(System.in); 
          Cliente cliente;
          Hospedagem tipoHotel;
          PacoteViagem pacote;
          Transporte tipoT;
          Venda venda;
          /*
          cliente = new Cliente("fulano");
          tipoHotel = new Hospedagem("hotel fazenda", 150.00f);
          tipoT = new Transporte("aviao", 350.00f);
          pacote = new PacoteViagem(tipoT, tipoHotel,"Salvador",5,0.35f);
          System.out.println("informe o valor do dolar:..");
          float dolar = entrada.nextFloat();
          venda = new Venda(cliente,"cartao", pacote,dolar);
          venda.mostrarVenda();
          */
         
          
          String nome,hospedaria,veiculo,destino,formaPg;
          float valorT,valorH;
          int dias;
   
          
          
          int res;
          do
          {
              System.out.println("====Agencia de Viagem====");
              
              System.out.println("****Cadastrar Transporte****");
              System.out.println("****************************");
              System.out.print("tipo de transporte:..");
              veiculo=entrada.next();
              entrada.nextLine();
              System.out.print("valor da passagem:..R$");
              valorT=entrada.nextFloat();
              entrada.nextLine();
              
              tipoT = new Transporte(veiculo,valorT);
             
              System.out.println("");
              System.out.println("****Cadastrar Hospedagem****");
              System.out.println("****************************");
              System.out.print("tipo de hospedaria:..");
              hospedaria=entrada.next();
              entrada.nextLine();
              System.out.print("valor da diaria:..R$");
              valorH=entrada.nextFloat();
              entrada.nextLine();
              System.out.println("informe a porcetagem de lucro");
              float lucro= entrada.nextFloat();
              
              tipoHotel = new Hospedagem(hospedaria, valorH);
        
              System.out.print("informe o Destino:..");
              destino=entrada.next();
              entrada.nextLine();
              System.out.print("informe o periodo:..");
              dias=entrada.nextInt();
              entrada.nextLine();
              
              pacote =new PacoteViagem(tipoT, tipoHotel,destino, dias,lucro);
              System.out.println("");
              
              pacote.mostrarPacoteViagem();
              
              System.out.print("finalizar Venda [1]-sim  [2]-nao:..");
              res=entrada.nextInt();
              if(res == 2){
                  System.out.println("venda cancelada com sucesso!");
                  break;
              }
              System.out.println("");
              System.out.print("Nome Cliente:..");
              nome=entrada.next();
              cliente = new Cliente(nome);
              System.out.print("forma de pagamento:..");
              formaPg=entrada.next();
              System.out.print("informe a cotacao do dolar:..US$");
              float dolar = entrada.nextFloat();
              
              
              venda = new Venda(cliente,formaPg, pacote,dolar);
              venda.mostrarVenda();
            
              
              System.out.println("");
              System.out.println("realizar outra venda [1]-sim  [2]-nao:.."); 
              res=entrada.nextInt();
          }while(res != 2);
            
         
     
    }
}  
       
 
