import java.util.Scanner;

public class rep {
    public static void main(String[] args) {
        // 1° estrutura de repetição

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;
        while (x != 0) {
            soma = soma + x;
            x = sc.nextInt();

        }
        System.out.println(soma);
        sc.close();

    }
}
