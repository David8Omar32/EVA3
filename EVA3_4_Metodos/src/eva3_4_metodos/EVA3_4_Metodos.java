package eva3_4_metodos;

import java.util.Scanner;

public class EVA3_4_Metodos {
    public static void main(String[] args) {
        System.out.println("Mayor = " + buscarMayor(15,415));
        String dia = diaSemana("Dar un número del 1-7 indicando el dia de la semana: ");
        System.out.println("El dia es: " + dia);
    }
    
    public static int buscarMayor(int num1, int num2){
        if (num1 != num2) {
            if (num1 > num2) {
                return num1;
            }else {
                return num2;
            }
        } else if(num1 == num2){
            return num1;
        } else {
            return 0;
        }
    }
    
    public static String diaSemana(String num){
        Scanner cap = new Scanner(System.in);
        System.out.println(num);
        int dianum = cap.nextInt();
        String resultado;
        switch(dianum){    
        case 1:
            resultado = "Domingo";
            break;
        case 2:
            resultado = "Lunes";
            break;
        case 3:
            resultado = "Martes";
            break;
        case 4:
            resultado = "Miercoles";
            break;
        case 5:
            resultado = "Jueves";
            break;
        case 6:
            resultado = "Viernes";
            break;
        case 7:
            resultado = "Sabado";
            break;
        default:
            resultado = "Simbolo no valido";
        }
        return resultado;
    }
    
}
