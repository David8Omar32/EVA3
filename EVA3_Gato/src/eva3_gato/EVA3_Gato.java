package eva3_gato;

import java.util.Scanner;

public class EVA3_Gato {
    public static String[][] matriz = new String[3][3];
    public static void main(String[] args) {
        String posicion;
        int checarJugada1,checarJugada2,checarVictoria=4,jugada;
        matriz[0][0] = "100";
        matriz[0][1] = "200";
        matriz[0][2] = "300";
        matriz[1][0] = "400";
        matriz[1][1] = "500";
        matriz[1][2] = "600";
        matriz[2][0] = "700";
        matriz[2][1] = "800";
        matriz[2][2] = "900";
        Scanner cap = new Scanner(System.in);
        do {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println("");
            }
            int valor=0;
            do{
                do{
                    System.out.println("¿Que posicion quieres elegir?  [2]Salir");
                    posicion = cap.nextLine();
                    if (null != posicion)switch (posicion) {
                        case "100":
                            valor = 100;
                            break;
                        case "200":
                            valor = 200;
                            break;
                        case "300":
                            valor = 300;
                            break;
                        case "400":
                            valor = 400;
                            break;
                        case "500":
                            valor = 500;
                            break;
                        case "600":
                            valor = 600;
                            break;
                        case "700":
                            valor = 700;
                            break;
                        case "800":
                            valor = 800;
                            break;
                        case "900":
                            valor = 900;
                            break;
                        default:
                            break;
                    }
                    checarJugada1=jugadaValidaJugador(valor);
                        switch (posicion){
                    case "100":
                    matriz[0][0] = "-X-";
                        break;
                    case "200":
                    matriz[0][1] = "-X-";
                        break;
                    case "300":
                    matriz[0][2] = "-X-";
                        break;
                    case "400":
                    matriz[1][0] = "-X-";
                        break;
                    case "500":
                    matriz[1][1] = "-X-";
                        break;
                    case "600":
                    matriz[1][2] = "-X-";
                        break;
                    case "700":
                    matriz[2][0] = "-X-";
                        break;
                    case "800":
                    matriz[2][1] = "-X-";
                        break;
                    case "900":
                    matriz[2][2] = "-X-";
                        break;
                    default:
                        break;

                }
                checarVictoria = victoriaDerrota();
                }while(valor==0);
            }while(checarJugada1==2);
                do{
                    jugada=generarJugada();
                    checarJugada2 = jugadaValidaMaquina(jugada);
                    checarVictoria = victoriaDerrota();
                }while(checarJugada2==2&&checarVictoria==4);
            switch (jugada){
                case 100:
                matriz[0][0] = "-O-";
                    break;
                case 200:
                matriz[0][1] = "-O-";
                    break;
                case 300:
                matriz[0][2] = "-O-";
                    break;
                case 400:
                matriz[1][0] = "-O-";
                    break;
                case 500:
                matriz[1][1] = "-O-";
                    break;
                case 600:
                matriz[1][2] = "-O-";
                    break;
                case 700:
                matriz[2][0] = "-O-";
                    break;
                case 800:
                matriz[2][1] = "-O-";
                    break;
                case 900:
                matriz[2][2] = "-O-";
                    break;
                default:
                    break;
               
            }
            checarVictoria = victoriaDerrota();
           
        } while (checarVictoria == 4);
        if(checarVictoria == 0){
            System.out.println("Empate");
        }else if(checarVictoria == 1){
            System.out.println("Victoria");
        }else if(checarVictoria == 2){
            System.out.println("Perdiste");
        }
        for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println("");
            }
    }
    public static int generarJugada(){
        int valor = (int)(Math.random()*9+1);
        System.out.println(valor);
        
        switch (valor){
                case 1:
                valor=100;
                    break;
                case 2:
                valor=200;
                    break;
                case 3:
                valor=300;
                    break;
                case 4:
                valor=400;
                    break;
                case 5:
                valor=500;
                    break;
                case 6:
                valor=600;
                    break;
                case 7:
                valor=700;
                    break;
                case 8:
                valor=800;
                    break;
                case 9:
                valor=900;
                    break;
                default:
                    break;
               
            }
        return valor;
    }
    public static int jugadaValidaJugador(int jugador){
        //1==Valida 2==Invalida
        int jugada=1;
        if(jugador==100&&matriz[0][0]=="100"){
            jugada=1;
        }else if(jugador==200&&matriz[0][1]=="200"){
            jugada=1;
        }else if(jugador==300&&matriz[0][2]=="300"){
            jugada=1;
        }else if(jugador==400&&matriz[1][0]=="400"){
            jugada=1;
        }else if(jugador==500&&matriz[1][1]=="500"){
            jugada=1;
        }else if(jugador==600&&matriz[1][2]=="600"){
            jugada=1;
        }else if(jugador==700&&matriz[2][0]=="700"){
            jugada=1;
        }else if(jugador==800&&matriz[2][1]=="800"){
            jugada=1;
        }else if(jugador==900&&matriz[2][2]=="900"){
            jugada=1;
        }else {
            jugada=2;
        }
        return jugada;
    }
    
    public static int jugadaValidaMaquina(int maquina){
        int jugada;
        if(maquina==100&&matriz[0][0]=="100"){
            jugada=1;
        }else if(maquina==200&&matriz[0][1]=="200"){
            jugada=1;
        }else if(maquina==300&&matriz[0][2]=="300"){
            jugada=1;
        }else if(maquina==400&&matriz[1][0]=="400"){
            jugada=1;
        }else if(maquina==500&&matriz[1][1]=="500"){
            jugada=1;
        }else if(maquina==600&&matriz[1][2]=="600"){
            jugada=1;
        }else if(maquina==700&&matriz[2][0]=="700"){
            jugada=1;
        }else if(maquina==800&&matriz[2][1]=="800"){
            jugada=1;
        }else if(maquina==900&&matriz[2][2]=="900"){
            jugada=1;
        }else {
            jugada=2;
        }
        return jugada;
    }
    
    public static int victoriaDerrota(){
        //0==Empate 1==Victoria 2==Derrota
        int jugada=4;
        if(matriz[0][0]!="100"&&matriz[0][1]!="200"&&matriz[0][2]!="300"&&matriz[1][0]!="400"&&matriz[1][1]!="500"&&matriz[1][2]!="600"&&matriz[2][0]!="700"&&matriz[2][1]!="800"&&matriz[2][2]!="900"){
            jugada=0;
        }
        if(matriz[0][0]=="-X-"&&matriz[0][1]=="-X-"&&matriz[0][2]=="-X-"){
            jugada=1;
        }else if(matriz[0][0]=="-X-"&&matriz[1][1]=="-X-"&&matriz[2][2]=="-X-"){
            jugada=1;
        }else if(matriz[0][0]=="-X-"&&matriz[1][0]=="-X-"&&matriz[2][0]=="-X-"){
            jugada=1;
        }else if(matriz[0][1]=="-X-"&&matriz[1][1]=="-X-"&&matriz[2][1]=="-X-"){
            jugada=1;
        }else if(matriz[0][2]=="-X-"&&matriz[1][2]=="-X-"&&matriz[2][2]=="-X-"){
            jugada=1;
        }else if(matriz[0][2]=="-X-"&&matriz[1][1]=="-X-"&&matriz[2][0]=="-X-"){
            jugada=1;
        }else if(matriz[1][0]=="-X-"&&matriz[1][1]=="-X-"&&matriz[1][2]=="-X-"){
            jugada=1;
        }else if(matriz[2][0]=="-X-"&&matriz[2][1]=="-X-"&&matriz[2][2]=="-X-"){
            jugada=1;
        }else if(matriz[0][0]=="-O-"&&matriz[0][1]=="-O-"&&matriz[0][2]=="-O-"){
            jugada=2;
        }else if(matriz[0][0]=="-O-"&&matriz[1][1]=="-O-"&&matriz[2][2]=="-O-"){
            jugada=2;
        }else if(matriz[0][0]=="-O-"&&matriz[1][0]=="-O-"&&matriz[2][0]=="-O-"){
            jugada=2;
        }else if(matriz[0][1]=="-O-"&&matriz[1][1]=="-O-"&&matriz[2][1]=="-O-"){
            jugada=2;
        }else if(matriz[0][2]=="-O-"&&matriz[1][2]=="-O-"&&matriz[2][2]=="-O-"){
            jugada=2;
        }else if(matriz[0][2]=="-O-"&&matriz[1][1]=="-O-"&&matriz[2][0]=="-O"){
            jugada=2;
        }else if(matriz[1][0]=="-O-"&&matriz[1][1]=="-O-"&&matriz[1][2]=="-O-"){
            jugada=2;
        }else if(matriz[2][0]=="-O-"&&matriz[2][1]=="-O-"&&matriz[2][2]=="-O-"){
            jugada=2;
        }
        
        return jugada;
    }
}
