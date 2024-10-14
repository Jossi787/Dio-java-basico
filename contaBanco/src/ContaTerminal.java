import java.util.Scanner;

public class ContaTerminal {


    public static void  main(String[] args) throws Exception {
      //Conhecer e importar a classe Scanner
      Scanner scan = new Scanner(System.in);

      int numero = 0;
      String agencia = new String("");
      String nomeCliente = new String("");
      double saldo = 0.0;

       //Exibir as mebsagens para o nosso usuario
      System.out.println("Informe seu nome:" );
       //Obter pelo scanner os valores digitados no terminal
      nomeCliente = scan.nextLine();
      System.out.println("Informe sua agência:" );
      agencia = scan.nextLine();
      System.out.println("Informe o numero da conta:" );
      numero = scan.nextInt();
      System.out.println("Informe o saldo da conta:R$" );
      saldo = scan.nextDouble();
        //Exibir a mensagem conta criada
      System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agencia é "+agencia+", conta "+numero+" e seu saldo é R$"+saldo+" e já está disponível para saque");
  }
}


      
    
     
      


    

