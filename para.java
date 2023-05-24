import java.util.Scanner;

public class para {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //primeiro FOR
        System.out.println("Digite quantas vezes quer repetir: ");
        int n = sc.nextInt();
        int soma = 0;
        //toda vez que repetir o i recebera +1
        for (int i = 0; i<n ; i++){
            System.out.println("Digite um numero: ");
            int nmrs = sc.nextInt();
            soma = soma + nmrs;
        }

        System.out.println("A soma dos numeros é = " +soma);
    }
}
