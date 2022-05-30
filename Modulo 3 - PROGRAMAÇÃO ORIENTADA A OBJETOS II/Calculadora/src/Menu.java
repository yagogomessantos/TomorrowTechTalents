import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private static Calculo calculo;
    private static Scanner scan = new Scanner(System.in);

    private static List listOfNumbers() {
        ArrayList lista = new ArrayList<>();
        boolean permanecer = true;
        System.out.println("Digite o primeiro número: ");
        String option = scan.nextLine();
        do {

            switch (option) {
                case "X":
                    System.out.println(lista);
                    permanecer = false;
                    break;

                default:
                    try {
                        lista.add(Double.valueOf(option));
                    } catch (NumberFormatException e) {
                        System.out.println("Digite apenas números ou 'X' para realizar o cálculo");
                        option = scan.nextLine().toUpperCase();
                        break;
                    }
                    System.out.println("Digite o próximo número ou 'X' para realizar o calculo");
                    option = scan.nextLine().toUpperCase();
            }
        } while (permanecer);

        return lista;


    }

    public static void iniciar() {
        boolean permancer = true;

        do {
            System.err.println("\n===========Calculadora===========");
            System.out.println("Digite uma opção abaixo:");
            System.out.println("[1] - Somar");
            System.out.println("[2] - Subtrair");
            System.out.println("[3] - Multiplicar");
            System.out.println("[4] - Dividir");
            System.out.println("[5] - Exit");
            int option = 0;
            try {
                option = scan.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida - Digite umas das opçoes entre 1 - 5 :");
                scan.nextLine();
                option = scan.nextInt();
            }
            scan.nextLine();
            switch (option) {
                case 1:
                    calculo = new Soma();
                    System.out.println("O Resultado da soma = " + calculo.calcular(listOfNumbers()));
                    break;
                case 2:
                    calculo = new Subtracao();
                    System.out.println("O Resultado da divisão = " + calculo.calcular(listOfNumbers()));
                    break;
                case 3:
                    calculo = new Multiplicacao();
                    System.out.println("O Resultado da multiplicação = " + calculo.calcular(listOfNumbers()));
                    break;
                case 4:
                    try {
                        calculo = new Divisao();
                        System.out.println("O Resultado da divisão = " + calculo.calcular(listOfNumbers()));
                    } catch (ArithmeticException e) {
                        System.out.println("Não é possível dividir por Zero");
                    }
                    break;
                case 5:
                    System.out.println("Obrigado por usar minha aplicação");
                    permancer = false;
                    scan.close();
                    break;
                default:
                    System.out.println("Entrada inválida");
            }
        } while (permancer);


    }


}
