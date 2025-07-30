package calculadora;
import java.util.Scanner;
/**
 *
 * @author info2
 */
public class Soma extends EntradaNumeros{
    public static void main(String[] args) {
        EntradaNumeros.recebe();
        System.out.println("A soma dos números digitados é: " + (EntradaNumeros.x + EntradaNumeros.y));
    }
}
