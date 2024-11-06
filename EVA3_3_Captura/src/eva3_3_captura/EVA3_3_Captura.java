package eva3_3_captura;

import java.util.Scanner;

public class EVA3_3_Captura {
    public static void main(String[] args) {
        int edad = capturarInt("Introduce tu edad");
        double salario = capturardouble("Introduce tu Salario");
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
    public static int capturarInt(String num){
        Scanner cap = new Scanner(System.in);
        int texto;
        System.out.println(num);
        texto = cap.nextInt();
        return texto;
    }
    public static double capturardouble(String num){
        Scanner cap = new Scanner(System.in);
        double texto;
        System.out.println(num);
        texto = cap.nextDouble();
        return texto;
    }
}
