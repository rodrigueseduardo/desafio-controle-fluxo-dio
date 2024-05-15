import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        terminal.close();

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        else {
            int contagem = parametroDois - parametroUm;
            System.out.println("Os números  impressos são: ");

            for (int i = 0; i <= contagem; i++) {
                System.out.println(parametroUm + i);
            }
            System.out.println("Quantidade de iterações: " + (contagem + 1));
        }
    }
}
