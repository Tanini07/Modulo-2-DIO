import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("indique o primeiro parametro para o nosso programa!");
        int parametroUm = sc.nextInt();

        System.out.println("indique o segundo parametro para o nosso programa!");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
         static void contar(int parametroUm, int parametroDois) throws RuntimeException {
            if(parametroUm > parametroDois){
                throw new RuntimeException("O parametro dois deve ser maior que o parametro um!");
            }
            int contagem = parametroDois - parametroUm;
          for(int contador = 1; contador <= contagem; contador++)
          System.out.println(contador);
            
        }
    }

