package david24550248_examen_eva3;

import java.util.Scanner;

public class David24550248_Examen_EVA3 {
   public static int b=0,c=0,x=0,mayor=0;
   public static double promedio = 0;
   public static void main(String[] args) {
      double variable=0;
      int calificacion[];
      int iguales=0, menor =0,cantidad; 
      Scanner scn = new Scanner(System.in);
      
      do{
         System.out.println("Cantidad de calificaciones a capturar: ");
         cantidad = scn.nextInt();
         scn.nextLine();
      }while(cantidad < 1 || cantidad > 100);
      
      calificacion = new int[cantidad];
        
      for (int i = 0; i < cantidad; i++) {
         System.out.println("Insertar la calificación del alumno #" + (i+1)+" (0-100)");
         calificacion[i] = scn.nextInt();
         scn.nextLine();
         
         variable = variable +  calificacion[i];
      }
      promedio = pro(variable,cantidad);
      for (int i = 0; i < cantidad; i++) {
         iguales = probar2(calificacion[i]);
         mayor = probar(calificacion[i]);
      }
      for (int i = 0; i < cantidad; i++) {
         if (calificacion[i] < mayor && calificacion[i] < menor)
            menor = calificacion[i];
      }
      
      System.out.println("El promedio es: " + promedio);
      System.out.println("Número de calificaciones mayores o iguales al promedio: " + iguales);
      System.out.println("La calificación mayor es: " + mayor);
      System.out.println("La calificación menor es: " + menor);
    }
   public static double pro(double a, int d){
      a = a / d;
      return a;
   }
   public static int probar(int a){
         if (a > b){
            b = a;
         }
      return b;
   }
   public static int probar2(int d){
      if (d >= promedio) {
         x = x + 1;
      }
      
      return x;
   }
}
   

