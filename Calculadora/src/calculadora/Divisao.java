package calculadora;


import java.util.Scanner;


public class Divisao {
    public static void main(String[] args) {
        EntradaNumeros.recebe();
        System.out.println("A divisão dos números digitados é: " + (EntradaNumeros.x / EntradaNumeros.y));
    }
}

