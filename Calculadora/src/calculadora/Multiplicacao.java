package calculadora;


import java.util.Scanner;


public class Multiplicacao {
    public static void main(String[] args) {
        EntradaNumeros.recebe();
        System.out.println("A multiplicação dos números digitados é: " + (EntradaNumeros.x * EntradaNumeros.y));
    }
}


