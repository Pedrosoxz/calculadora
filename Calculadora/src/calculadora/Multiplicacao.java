package calculadora;


import java.util.Scanner;


public class Multiplicacao {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        Integer numero1 = entradaTeclado.nextInt();
        
        System.out.println("Informe o segundo número:");
        Integer numero2 = entradaTeclado.nextInt();
        
        System.out.println("A multiplicação dos números digitados é: " + (numero1*numero2));
    }
}

