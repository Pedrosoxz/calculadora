package calculadora;

import java.util.Scanner;


public class Subtracao {
    public static void main(String[] args) {
        EntradaNumeros.recebe();
        System.out.println("A subtracao dos números digitados é: " + (EntradaNumeros.x - EntradaNumeros.y));
    }
}

