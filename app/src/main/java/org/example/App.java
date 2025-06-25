package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int op;
        double tem;
        double result;

        do {
            System.out.println("\n----------------------TEMPCONVERTER---------------------");
            System.out.println("                convertor de temperatura                \n");
            System.out.println("qual tipo de conversão deseja?");
            System.out.println("(1) - Fahrenheit para graus celsius");
            System.out.println("(2) - Graus celsius para fahrenheit");
            System.out.println("(0) - Sair");
            op = s.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o valor que deseja converter: ");
                    tem = s.nextDouble();
                    result = fahrenheitParaCelsius(tem);
                    System.out.println(result + " Graus celsius.");
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja converter: ");
                    tem = s.nextDouble();
                    result = celsiusParaFahrenheit(tem);
                    System.out.println(result + " Fahrenheit.");
                    break;
                case 0:
                    System.out.println("Até logo ...");
                    break;
                default:
                    System.out.println("Opção inválida!!");
            }

        } while (op != 0);
    }

    public static double fahrenheitParaCelsius(double f) {
        return (f - 32) * 0.55;
    }

    public static double celsiusParaFahrenheit(double c) {
        return (c * 1.8) + 32;
    }
}
