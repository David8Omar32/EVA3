package eva3_3_captura;

import java.util.Scanner;

public class EVA3_3_Captura {
    public static void main(String[] args) {
        System.out.println("Introduce tu edad");
        int edad = capturarInt(0);
        System.out.println("Introduce tu Salario");
        double salario = capturardouble(0);
        String nombre = capturarTexto("Introduce tu nombre");
        String apellido = capturarTexto("Introduce tu apellido");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: "+ apellido);
        System.out.println("Edad: "+ edad);
        System.out.println("Salario: "+ salario);
    }
    public static String capturarTexto(String mensaje){
        Scanner cap = new Scanner(System.in);
        String texto;
        System.out.println(mensaje);
        texto = cap.nextLine();
        return texto;
    }
    public static int capturarInt(int num){
        Scanner cap = new Scanner(System.in);
        int texto;
        System.out.println(num);
        texto = cap.nextInt();
        return texto;
    }
    public static double capturardouble(double num){
        Scanner cap = new Scanner(System.in);
        double texto;
        System.out.println(num);
        texto = cap.nextDouble();
        return texto;
    }
}
