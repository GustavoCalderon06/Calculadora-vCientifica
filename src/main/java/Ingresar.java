import java.util.Scanner;

public interface Ingresar {
    static double ingresarDouble(){
        return new Scanner(System.in).nextDouble();
    }
    static int ingresarInt(){
        return new Scanner(System.in).nextInt();
    }
}
