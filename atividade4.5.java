package br.unipar.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String menu = """
                *************
                1 - Calculadora de multiplicação
                2 - 
                3 - 
                4 - 
                *************
                Digite a opção
                """;

        while (true) {
            System.out.println(menu);
            Scanner leia = new Scanner(System.in);
            int opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual numero deseja multiplicar?");
                    double num = 0;
                    num = leia.nextDouble();
                    for (int i = 1; i <= 10; i++){
                        System.out.println(i+" X " +num+" :"+ (num*i));
                    }
                    return;
                case 2:
                    System.out.println("vc é ");
                    return;
                case 3:
                    System.out.println("vc é ");
                    return;
                case 4:
                    System.out.println("a");
                    return;
                default:
                    System.out.println("Invalido");
                    return;
            }
        }
    }
}
