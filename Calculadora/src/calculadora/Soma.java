package calculadora;
import java.util.Scanner;
/**
 *
 * @author info2
 */
public class Soma {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        Integer numero1 = entradaTeclado.nextInt();
        
        System.out.println("Informe o segundo número:");
        Integer numero2 = entradaTeclado.nextInt();
        
        System.out.println("A soma dos números digitados é: " + (numero1+numero2));
    }
}
