package eva3_4_examen_2da;

import java.util.Scanner;

public class EVA3_4_Examen_2da {
    public static final int piedra = 1;
    public static final int tijera = 2;
    public static final int papel = 3;
    
    public static final int empate = 0;
    public static final int gana = 1;
    public static final int pierde = 2;
    
    public static void main(String[] args) {
        int res;
        do{
            res = pedirJugada("Introduce tu jugada (1-Piedra)(2-Tijera)(3-Papel)(4-Salir)");
            int jugada= generarJugadaComp();
            System.out.println(jugada);
            int resuJug = evaluarPartida(res,jugada);
            if (resuJug == 0) {
                System.out.println("Empate");
            } else if (resuJug == 1) {
                System.out.println("Gana el jugador");
            } else if (resuJug == 2) {
                System.out.println("Pierde el jugador");
            } else if (resuJug == 4) {
                System.out.println("Jugada no aceptable");
            }
        } while(res != 4);
    }
   
    public static int pedirJugada(String mensaje){
        Scanner cap = new Scanner(System.in);
        System.out.println(mensaje);
        int seleccion = cap.nextInt();
        return seleccion;
    }
   
    public static int generarJugadaComp(){
        int jugada;
        double valor = Math.random();
        if(valor >= 0 && valor< (.3)){
            jugada = piedra;
        } else if(valor>=(.3) && valor< (.6)){
            jugada = tijera;
        } else{
            jugada = papel;
        }
        return jugada;
    }
   
    public static int evaluarPartida(int jugadaus, int jugadacomp){
        int resu;//0 == empate 1== pierde 2== gana
        if (jugadaus == piedra && jugadacomp == piedra) {
            resu = empate;
        } else if (jugadaus == piedra && jugadacomp == tijera) {
            resu = gana;
        } else if (jugadaus == piedra && jugadacomp == papel) {
            resu = pierde;
        } else if (jugadaus == tijera && jugadacomp == piedra) {
            resu = pierde;
        } else if (jugadaus == papel && jugadacomp == piedra) {
            resu = gana;
        } else if (jugadaus == tijera && jugadacomp == tijera) {
            resu = empate;
        } else if (jugadaus == papel && jugadacomp == tijera) {
            resu = pierde;
        } else if (jugadaus == papel && jugadacomp == papel) {
            resu = empate;
        } else if (jugadaus == tijera && jugadacomp == papel) {
            resu = gana;
        } else {
            resu = 4;
        }
        return resu;
    }
}

