package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número do tipo inteiro: ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Resultado com tipo primitivo <int>: " + num);
        Integer numWrapper = num;
        System.out.println("Resultado com Wrapper <Integer>: " + numWrapper);
        sc.close();
    }
}
