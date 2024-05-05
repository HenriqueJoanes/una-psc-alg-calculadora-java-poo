import java.util.Scanner;

public class Calculadora {

    private Scanner leia = new Scanner(System.in);

    public void iniciar() {
        while (true) {
            System.out.println("Digite 'Q' para sair ou qualquer outra tecla para continuar:");
            String input = leia.next();
            if (input.equalsIgnoreCase("Q")) {
                System.out.println("Programa encerrado.");
                break;
            }

            System.out.println("Digite o primeiro número:");
            double numeroUm = leia.nextDouble();

            System.out.println("Digite o segundo número:");
            double numeroDois = leia.nextDouble();

            System.out.println("Escolha a operação (1-Adição, 2-Subtração, 3-Multiplicação, 4-Divisão, 5-Potência, 6-Raiz quadrada do primeiro número):");
            int operacao = leia.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Resultado: " + (numeroUm + numeroDois));
                    break;
                case 2:
                    System.out.println("Resultado: " + (numeroUm - numeroDois));
                    break;
                case 3:
                    System.out.println("Resultado: " + (numeroUm * numeroDois));
                    break;
                case 4:
                    if (numeroDois == 0) {
                        System.out.println("Impossível realizar uma divisão por zero.");
                    } else {
                        System.out.println("Resultado: " + (numeroUm / numeroDois));
                    }
                    break;
                case 5:
                    if (numeroDois == 0) {
                        System.out.println("Resultado: 1");
                    } else {
                        System.out.println("Resultado: " + Math.pow(numeroUm, numeroDois));
                    }
                    break;
                case 6:
                    if (numeroUm < 0) {
                        System.out.println("Não existe raiz de número negativo.");
                    } else {
                        System.out.println("Resultado: " + Math.sqrt(numeroUm));
                    }
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.iniciar();
    }
}
