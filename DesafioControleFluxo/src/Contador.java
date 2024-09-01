import java.util.Scanner;

public class Contador {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Digite o primeiro parâmetro");
          int parametroUm = sc.nextInt();
          System.out.println("Digite o segundo parâmetro");
          int parametroDois = sc.nextInt();

          try {
               //TODO: chamando o método contendo a lógica de contagem

               contar(parametroUm, parametroDois);

          }catch (ParametrosInvalidosException e) {
               //TODO: imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
               e.printStackTrace();
          }

     }
     static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
          //TODO: validar se parametroUm é MAIOR que parametroDois e lançar a exceção

          if(parametroUm > parametroDois) {
               throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro EXEMPLO ( Primeiro 34  segundo 45 ) ");
          }

          int contagem = parametroDois - parametroUm;
          //TODO: realizar o for para imprimir os números com base na variável contagem

          for(int i = 1; i <= contagem; i++) {
               System.out.println("Imprimindo o número: " + i);
          }
     }
}
