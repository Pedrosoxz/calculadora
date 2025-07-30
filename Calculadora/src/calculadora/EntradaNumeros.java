package calculadora;
import java.util.Scanner;

public class EntradaNumeros {
    protected static Integer x;
    protected static Integer y;
    
    public static void recebe() {
      Scanner entradaTeclado = new Scanner (System.in);
        System.out.println("Digite o primeiro número: ");
        setX((Integer) entradaTeclado.nextInt());
        
        System.out.println("Digit o segundo número: ");
        setY((Integer) entradaTeclado.nextInt());
    }

    /**
     * @return the x
     */
    public static Integer getX() {
        return x;
    }

    /**
     * @param aX the x to set
     */
    public static void setX(Integer aX) {
        x = aX;
    }

    /**
     * @return the y
     */
    public static Integer getY() {
        return y;
    }

    /**
     * @param aY the y to set
     */
    public static void setY(Integer aY) {
        y = aY;
    }
}
